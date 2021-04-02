package com.workon.testcases.workonDashboard;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_VerifyAllBrokenLinks {

	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {

		String testName = "TestCase_VerifyAllBrokenLinks";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
		Page.initConfiguration();

	}

	@AfterMethod
	public void afterClass() {
		Page.quitBrowser();
	}

	@Test
	public void dashboardTestBrokenLinks() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		Log.info("inside the dashboard Links ");

		String actual = dp.getCentalSearchLink();

		Log.info(actual);
		String expected = dp.getCentalSearchLinkExpected();

		Log.info(expected);
		
		Assert.assertEquals(actual, expected);

		
		// Verify all the userful links in the right side
		// Store all the userful links in the right side in the config.properties.

	}
}
