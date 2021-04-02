package com.workon.testcases.regression;

import java.io.IOException;

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

public class TestCaseForwardRequest extends TestBase {

	@Test(dataProvider = "forwardRequestProvider", dataProviderClass = DP.class)
	public void verifyForwardRequest(String ntid1, String ntid2) throws InterruptedException {
		Log.startTestCase("VerifyForwardRequest");

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

		// workontester
		rbga.addApprover(ntid1);

		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();
		Thread.sleep(4000);

		/*
		 * -[] -Click on the forward button -[] -Assign the request to someone using
		 * userpicker -[] -Comment box will come --> fill the comment in the comment box
		 * -[] -Click on the Assign -[] -Check that the assignee is changed
		 * 
		 */

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		Assert.assertEquals(searchRequestPage.isForwardButtonPresent(), true);

		searchRequestPage.clickOnForwardButton();

		searchRequestPage.clickOnUserPicker();

		// workontester1
		rbga.addApprover(ntid2);

		Assert.assertEquals(searchRequestPage.isCommentBoxPresent(), true);

		searchRequestPage.typeCommentInForwardForm("this is forwarding request for testing");

		rbga.clickOnSubmitButton();

		Thread.sleep(4000);

		String completeAssigneeName = searchRequestPage.getCurrentAssigneeName();

		String trimmedAssigneeName = searchRequestPage.getTrimmedValue(completeAssigneeName);

		Log.info("Current Assignee name is : " + trimmedAssigneeName);

		Assert.assertEquals(trimmedAssigneeName, "workOn tester1 (RBVH/ETM4)");

		Log.endTestCase("VerifySuspendAndResume");

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	@BeforeMethod
	public void beforeMethod() {

		String testName = "TestCase_ForwardRequest";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

}
