package com.workon.testcases.centralsearch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;	
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_CentralSearch_SearchVerify {

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		String testName = "TestCase_CentralSearch_SearchVerify";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
		Page.initConfiguration();

	}

	@AfterMethod
	public void afterMethod() {
		Page.quitBrowser();
	}

	@Test
	public void verifyTheRequestInTable() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		CentralSearchPage cp = dp.gotoCentralSearch();

		cp.gotoSearchRequest("RBGA");
		Thread.sleep(2000);
		cp.displayFirstRequestKey();

		// compare the Paased Key with the key returned by the displayFirstRequestKey

		boolean isRequestPresent = cp.requestKey.contains("RBGA");
		Log.info(""+isRequestPresent);
		Assert.assertEquals(isRequestPresent, true);

		// if both are not equal test case will be fail

	}
	
	

}
