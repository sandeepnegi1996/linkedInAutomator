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

public class TestCase_DashboardSessionExpiredIsuue  {

	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {

		String testName = "TestCase_DashboardSessionExpiredIsuue";

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
	public void dashboardSessionExpired() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		for (int i = 0; i < 20; i++) {

			dp.gotoWorkflows();
			Thread.sleep(3000);
			
			
			  boolean isBarPresent=dp.isSearchBarPresent();
			  
			  Assert.assertEquals(isBarPresent, true);
			 
			  Log.info("Search bar status:   "+isBarPresent);
			 
			
			
			dp.gotoMyFavTab();

			Thread.sleep(3000);
			
		
			

		}

	}
}
