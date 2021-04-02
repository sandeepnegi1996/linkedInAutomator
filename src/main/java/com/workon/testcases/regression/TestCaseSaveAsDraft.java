package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseSaveAsDraft extends TestBase {


	@BeforeMethod
	public void beforeMethod() {
		String testName = "TestCaseSaveAsDraft";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void verifySaveAsDraft(String ntid) throws InterruptedException {
		Log.startTestCase("verifySaveAsDraft");

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.switchToRbgaRequestCreation();
		rbga.clickCheckBoxElement();
		rbga.typeBriefDescription();
		rbga.typeLocation();
		rbga.typeFullDescription();
		rbga.clickOnWorkflowTab();
		rbga.clickfirstApproverButton();
		rbga.addApprover(ntid);

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		Assert.assertEquals(searchRequestPage.isSaveAsDraftPresent(), true);

		Assert.assertEquals(searchRequestPage.isSubmitPresent(), true);

		Assert.assertEquals(searchRequestPage.isResetPresent(), true);

		// click on save as braft
		searchRequestPage.clickOnSaveAsDraft();

		rbga.displayRequestKey();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	// after the draft request creation below tests will verify the
	// key,status,assignee,appliant.created,priority
	@Test(priority = 2)
	public void verifyKeyIsPresent() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		Assert.assertEquals(searchRequestPage.isKeyPresent(), true, "key is not present once clicked on save as draft");

	}

	@Test(priority = 3)
	public void verifyStatusIsDraft() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String status = searchRequestPage.getStatus();

		String currentStatus = searchRequestPage.getTrimmedValue(status);

		Log.info("***** Current Status Found is " + currentStatus);

		String expectedStatus = "Draft";

		Assert.assertEquals(expectedStatus.equals(currentStatus), true);

		Assert.assertEquals(currentStatus, expectedStatus, "Status is not equal to Draft");

	}

	@Test(priority = 4)
	public void verifyApplicant() {

		// Assert Applicant name

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String applicantName = searchRequestPage.getApplicantName();

		Log.info(applicantName);

		String trimmedApplicantName = searchRequestPage.getTrimmedValue(applicantName);
		Log.info(trimmedApplicantName);

		String expectedApplicantName = "workOn tester (RBVH/ETM4)";
		Assert.assertEquals(trimmedApplicantName, expectedApplicantName, "Applicant name doesn't matched");

	}

	@Test(priority = 5)
	public void verifyCreatedDate() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String createdDate = searchRequestPage.getCreatedDate();
		Log.info(createdDate);

		String currentDate = searchRequestPage.getCurrentDate();
		Log.info(currentDate);

		boolean isCreatedDatePresent = createdDate.contains(currentDate);

		Assert.assertEquals(isCreatedDatePresent, true, "***  Date is not matched  ***");

	}

	@Test(priority = 6)
	public void verifyPriorityAsDefault() {
		// Assert Priority

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String currentPriority = searchRequestPage.getPriority();
		Log.info(currentPriority);

		String trimmedCurrentPriority = searchRequestPage.getTrimmedValue(currentPriority);
		Log.info(trimmedCurrentPriority);

		String expectedPriority = "Default";

		Assert.assertEquals(trimmedCurrentPriority, expectedPriority, " ***   Priority Matching Failed   ***");
	}

}
