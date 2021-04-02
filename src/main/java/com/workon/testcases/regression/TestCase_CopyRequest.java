package com.workon.testcases.regression;

import java.io.IOException;

import org.openqa.selenium.By;
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

public class TestCase_CopyRequest extends TestBase {

	@Test
	public void verifyCloneRequest() throws InterruptedException {

		Log.startTestCase("VerifyCopyRequest");

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		SearchPage sp = dp.gotoSearchBox();

		SearchRequestPage searchRequestPage = sp.gotoSearchRequestRbga();

		searchRequestPage.switchToRequestSearching();
		Log.info("Opening the first Request in RBGA Search Request Page");
		searchRequestPage.openingFirstRequest();

		String briefDescriptionText = Page.getElementText(By.xpath(
				"//span[contains(text(),'Brief Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_view')]"));

		Log.info(briefDescriptionText);

		// Verfy Copy button is Present

		Assert.assertEquals(SearchRequestPage.isCopyButtonPresent(), true);

		searchRequestPage.clickOnCopyButton();

		boolean isCloneSummaryPresent = Page
				.isElementPresent(By.xpath("//input[@id='summary' and @class='textfield']"));

		Assert.assertEquals(isCloneSummaryPresent, true);

		// get summary text in the copy request page

		String cloneRequestSummary = Page.driver.findElement(By.xpath("//input[@id='summary' and @class='textfield']"))
				.getAttribute("value");
		Log.info("Clone Request Summary is :  " + cloneRequestSummary);

		// Assert Clone Request Summary contains text "CLONE"

		boolean isContainClone = cloneRequestSummary.contains("CLONE");

		Assert.assertEquals(isContainClone, true);

		// Assert that the brief DescriptionText should be present in the request in
		// clone Request Summary

		boolean isContainBriefDescription = cloneRequestSummary.contains(briefDescriptionText);

		Assert.assertEquals(isContainBriefDescription, true);

		// click on the create button

		searchRequestPage.clickOnCreateButton();

		// verify the form data is similar to original request

		// Verify the attachments is copied from the original request

		// Verify the status is draft

		// Verify that the request is created

		searchRequestPage.clickOnDraftSubmitButton();
		Log.info("Creating Request After Copying");

		// verify key is present
		Assert.assertEquals(searchRequestPage.isKeyPresent(), true);

		searchRequestPage.displayRequestKeyAfterCopying();

		Log.endTestCase("VerifyCopyRequest");

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	@BeforeMethod
	public void beforeMethod() {

		String testName = "TestCase_CopyRequest";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

}
