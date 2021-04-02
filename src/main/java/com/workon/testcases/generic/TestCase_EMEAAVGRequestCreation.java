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
import com.workon.pages.actions.emeaavg.EMEAAVGRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_EMEAAVGRequestCreation  extends TestBase{

	
	@BeforeMethod
	public void beforeClass() {
		
		String testName="TestCase_EMEAAVGRequestCreation";
		if(!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test"+testName.toUpperCase());
		}
		
	}
	
	
	@Test(dataProvider="ntidProvider",dataProviderClass=DP.class)
	public void emeaavgRequestCreation(String ntid) throws InterruptedException {
		
		
		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp= dp.gotoSearchBox();
		EMEAAVGRequestCreation emea= sp.gotoEMEAAVG();
		
		emea.switchToRequestCreationTab();
		emea.typeReason();
		emea.selectOptionHana();
		emea.selectOptionEmea();
		emea.selectRequestOptionAdd();
		emea.typeSystemName();
		emea.typeDomainName();
		
		emea.clickOnWorkflowTab();

		Thread.sleep(2000);
		
		emea.clearApprovalList();
		
	
		emea.addApprover(ntid);
		

		
		emea.addDepartmentManagerCost();
		emea.addDepartmentManagerCostSecond();
		
		emea.clickOnSubmitButton();
		
		Thread.sleep(10000);
		emea.displayRequestKey();
		
		
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
		
	
	}
	
	
}
