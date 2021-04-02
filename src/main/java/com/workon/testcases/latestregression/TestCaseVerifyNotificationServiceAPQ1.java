package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.NotificationService;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.ap8d.AP8DRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseVerifyNotificationServiceAPQ1 extends TestBase {

	@BeforeMethod
	public static void setTestName() {
		String testName = "TestCaseVerifyNotificationServiceAPQ1";
		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 1)
	public void verifyNotificationBellap8d(String ntid) throws InterruptedException {

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
		ap8d.clickAdd_anApprover();
		ap8d.addApprover(ntid);
		Log.info("Assigned to: " + ntid);

		ap8d.clickOnSubmitButton();
		ap8d.displayRequestKey();

		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	@Test(priority = 2)
	public void verifyNotificationServiceApQ1Ap8DAfterRequestCreation() {
		NotificationService notificationservice = new NotificationService();
		boolean isNotificatoinBellPresent = notificationservice.verifyNotificaitonBellPresent();
		Log.info("current status of the notification service :   " + isNotificatoinBellPresent);
		Assert.assertEquals(isNotificatoinBellPresent, true, "notification bell is not present in the EMEA Q1");
	}

}
