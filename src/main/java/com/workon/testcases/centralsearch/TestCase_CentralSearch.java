package com.workon.testcases.centralsearch;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.CentralSearchPage;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_CentralSearch {

	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {
		String testName = "TestCase_CentralSearch";

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
	public void verifyTheRequestOpeningInNewTab() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		CentralSearchPage cp = dp.gotoCentralSearch();

		cp = cp.gotoSearchRequest("RBGA");
		cp.displayFirstRequestKey();

		cp.clickOntheFirstRequest();

		cp.gotoRequestTab();
		cp.displayTheRequestKeyInNewTab();
		cp.getRequestKeyAfterOpeningRequest();
		cp.compareRequestKey();

	}

}
