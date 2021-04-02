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
import com.workon.pages.actions.cnterm.CNTERMRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_CNTERMRequestCreation extends TestBase {

	@BeforeMethod
	public void beforeClass() {
		String testName = "TestCase_CNTERMRequestCreation";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void cntermRequestCreation(String ntid) throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		CNTERMRequestCreation cnterm = sp.gotoCNTERM();
		cnterm.switchToCNTERMRequestCreation();
		cnterm.enterPersonnelNumber();
		cnterm.enterEmployeeName();

		cnterm.clickOnWorkflowTab();

		Log.info("Assigned to: " + ntid);
		cnterm.clickOnSubmitButton();
		cnterm.displayRequestKey();

		Thread.sleep(10000);

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}
}
