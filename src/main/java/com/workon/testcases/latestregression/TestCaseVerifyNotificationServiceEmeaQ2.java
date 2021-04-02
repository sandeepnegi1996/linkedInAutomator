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
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseVerifyNotificationServiceEmeaQ2 extends TestBase {

	@BeforeMethod
	public void setTestName(){
		String testName = "TestCaseVerifyNotificationServiceEmeaQ2";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void verifyNotificationServiceEmeaQ2(String ntid) throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.switchToRbgaRequestCreation();
		rbga.clickCheckBoxElement();
		rbga.typeBriefDescription();
		rbga.typeLocation();
		rbga.typeFullDescription();

		Thread.sleep(2000);
	
		NotificationService notificationservice = new NotificationService();

		boolean isNotificatoinBellPresent = notificationservice.verifyNotificaitonBellPresent();

		Log.info("current status of the notification service :   "+isNotificatoinBellPresent);
		
		Assert.assertEquals(isNotificatoinBellPresent, true, "notification bell is not present in the page");

		rbga.clickOnWorkflowTab();
		rbga.clickfirstApproverButton();
		rbga.addApprover(ntid);
		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

}
