package com.workon.testcases.regression;

import java.io.IOException;

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

public class TestCase_DeleteAsDraft extends TestBase {

	@Test
	public void verifyDeleteDraft() throws InterruptedException {
		Log.startTestCase("VerifyDeleteAsDraft");

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();

		SearchRequestPage searchRequestPage = sp.gotoSearchRequestRbga();

		searchRequestPage.switchToRequestSearching();
		int requestRowNumber = searchRequestPage.requestWithStatusAsDraft();
		String requestKey = searchRequestPage.getRequestKeyWithRowNumber(requestRowNumber);
		searchRequestPage.openRequestWithStatusDraft(requestRowNumber);

		// Stroring the request key in the String so that // we will check in the

		// Verify that the Delete Draft button is present

		Assert.assertEquals(SearchRequestPage.isDeleteDraftButtonPresent(), true);

		searchRequestPage.clickOnDeleteDraft();

		searchRequestPage.typeComment();
		Log.info("waiting after entering comment");

		searchRequestPage.clickOnOkComment();
		Log.info("waiting after clicking on the OK button");

		Thread.sleep(3000);

		boolean isRequestAvailableInSearchRequestPage = searchRequestPage.isRequestKeyAvailable(requestKey);

		Assert.assertEquals(isRequestAvailableInSearchRequestPage, false);

		Log.endTestCase("VerifyDeleteAsDraft");

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	@BeforeMethod
	public void beforeClass()  {

		String testName = "TestCase_DeleteAsDraft";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

}
