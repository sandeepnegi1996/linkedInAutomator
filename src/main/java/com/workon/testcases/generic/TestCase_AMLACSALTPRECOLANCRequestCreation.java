package com.workon.testcases.generic;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.amlacsaltrecolann.AMLACSALTRECOLANNRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_AMLACSALTPRECOLANCRequestCreation extends TestBase {
	
	
	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {
		
		//checking that the test case should be skipped or not
		
		String testName="TestCase_AMLACSALTPRECOLANCRequestCreation";
		
		if(!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test"+testName.toUpperCase());
		}
		
	}

	

	@Test(dataProvider="ntidProvider",dataProviderClass=DP.class)
	public void amlacsaltrepcolancRequestCreation(String ntid) throws InterruptedException {

		
		
		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		AMLACSALTRECOLANNRequestCreation amlacsal = sp.gotoAMLACSALTRECOLANN();
		amlacsal.switchToAMLACSALTRECOLANNRequestCreation();
		amlacsal.clickOnFirstInnerTab();
		amlacsal.typeClientInformation();
		amlacsal.typeMontate();
		amlacsal.typeCommercials();
		amlacsal.clickOnWorkflowTab();
		amlacsal.clickOnApprovalButton();
		amlacsal.addApprover(ntid);
		amlacsal.clickOnSubmitButton();
		
		Thread.sleep(10000);
		amlacsal.displayRequestKeyAMLAC();
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(amlacsal.displayRequestKeyAMLAC());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
		

	}

}
