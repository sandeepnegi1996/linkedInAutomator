package com.workon.testcases.generic;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.apga.APGARequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseApgaRequestCreation extends TestBase{
	
	@BeforeMethod
	public void beforeClass() {
		String testName="TestCase_APGARequestCreation";
		if(!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test"+testName.toUpperCase());
		}
	}

	@Test(dataProvider="ntidProvider",dataProviderClass=DP.class)
	public void apgaRequestCreation(String ntid) throws InterruptedException {
		
		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		APGARequestCreation apga = sp.gotoAPGA();
		apga.switchToRequestCreation();
		apga.clickCheckBoxElement();
		apga.selectRGB();
		apga.selectPredefinedWorkflow();
		apga.typeBriefDecription();
		apga.typeComment();	
		apga.clickOnWorkflowTab();
		apga.clickApprovalGridList(ntid);
		apga.clickOnSubmitButton();
		
		Thread.sleep(10000);
		apga.displayRequestKey();		
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
				

	}

}
