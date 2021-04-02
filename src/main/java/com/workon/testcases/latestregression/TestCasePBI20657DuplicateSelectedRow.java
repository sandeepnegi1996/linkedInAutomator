package com.workon.testcases.latestregression;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.rblvap.RBLVAPRequestCreation;
import com.workon.utilities.testUtil.TestUtil;

public class TestCasePBI20657DuplicateSelectedRow {

	@BeforeMethod
	public static void setTestName() {
		String testName = "TestCasePBI20657DuplicateSelectedRow";
		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void verifyDuplicateSelectedRowWorking(String ntid) throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		RBLVAPRequestCreation rblvap = sp.gotoRBLVAP();
		
		
		rblvap.switchToRblvapRequestCreation();
		Thread.sleep(4000);
		rblvap.typeSubject();
		rblvap.selectOrganizationalArea();
		
		
		Thread.sleep(3000);
		
		
		rblvap.typeReasonForAbsence();
		
		Thread.sleep(2000);
		rblvap.clickOnDuplicateSelectedRowButton();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}
}
