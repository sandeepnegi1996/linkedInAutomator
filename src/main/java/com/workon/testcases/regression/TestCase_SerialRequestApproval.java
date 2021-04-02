package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.ap8d.AP8DRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_SerialRequestApproval {

	@BeforeMethod
	public void beforeClass() {

		String testName = "TestCase_SerialRequestApproval";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "serialApproverProvider", dataProviderClass = DP.class)
	public void ap8dSerialRequestApproval(String approver1, String approver2) throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		SearchPage sp = dp.gotoSearchBox();
		AP8DRequestCreation ap8d = sp.gotoAP8D();
		ap8d.switchToRbgaRequestCreation();
		ap8d.clickOnApplicationDetails();
		ap8d.type8dReportNumber();
		ap8d.selectAddApprovalForInternal();
		ap8d.typeComment();
		ap8d.clickOnWorkflowTab();

		// Adding the first approver as the current user

		ap8d.clickAdd_anApprover();
		ap8d.addApprover(login.currentLoggedInUser());

		// adding the first approver
		ap8d.clickAdd_anApprover();
		ap8d.addApprover(approver1);

		// adding the second approver
		ap8d.clickAdd_anApprover();
		ap8d.addApprover(approver2);

		ap8d.clickOnSubmitButton();
		ap8d.displayRequestKey();

		// check the approve button is present and approve the request

		Assert.assertEquals(true, ap8d.isApproverButtonPresent());
		ap8d.clickApproverButton();

		// here we have to login with the workontester1
		// and approve the request
		// or add the current user in the approval list

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}
}
