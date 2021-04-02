package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCasePrintRequest extends TestBase {

	@BeforeMethod
	public void beforeClass() {

		String testName = "TestCasePrintRequest";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test
	public void verifyPrintRequestBoschLogoPresent() throws InterruptedException {
		Log.startTestCase("VerifyPrintRequest");

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();

		SearchRequestPage searchRequestPage = sp.gotoSearchRequestRbga();

		searchRequestPage.switchToRequestSearching();
		Log.info("Opening the first Request in RBGA Search Request Page");
		searchRequestPage.openingFirstRequest();

		searchRequestPage.clickOnPrintButton();

		Thread.sleep(5000);

		searchRequestPage.switchToPrintPage();

		Thread.sleep(5000);
		boolean isboschlogopresent = searchRequestPage.isBoschLogoPresent();
		Assert.assertEquals(isboschlogopresent, true, "*** Bosch Logo is not present ***");

		Log.endTestCase("VerifyPrintRequest");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
	}

}
