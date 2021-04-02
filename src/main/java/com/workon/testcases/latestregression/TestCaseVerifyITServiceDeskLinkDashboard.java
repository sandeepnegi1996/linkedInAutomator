package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseVerifyITServiceDeskLinkDashboard extends TestBase {

	@BeforeMethod
	public static void setTestName() {
		String testName = "TestCaseVerifyITServiceDeskLinkDashboard";
		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	}

	@Test(priority = 1)
	public void verifyItServiceDeskLinkDashboard() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();


		boolean isServiceDeskLinkPresent = dp.isItServiceDeskLinkPresent();

		Assert.assertEquals(isServiceDeskLinkPresent, true, "IT service desk link is Not Present");

		Log.info("isServiceDeskLinkPresent status:   " + isServiceDeskLinkPresent);

	}

	@Test(priority = 2)
	public void verifyITServiceDeskLinkValue() {

		DashboardPage dp = new DashboardPage();

		String actualLink = "mailto:ITServiceDesk@bosch.com";
		String expectedLink = dp.getItServiceDeskLinkHref();
		Assert.assertEquals(actualLink, expectedLink, "IT service desk link does not match");

		Log.info("Verify link is present  status:   " + expectedLink);

	}

}
