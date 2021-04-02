package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.ap8d.AP8DRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;


public class TestCaseVerifyMasterDataLinkDashboardPbi22783Ap extends TestBase{

	
	
	@BeforeMethod
	public void setTestName(){
		String testName = "TestCaseVerifyMasterDataLinkDashboardPbi22783Ap";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(priority=1)
	public void verifyMasterDataLinkAp() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		SearchPage sp = dp.gotoSearchBox();
		 sp.searchAp8d();
		 
		 Thread.sleep(3000);
		 
		AP8DRequestCreation ap8d = new AP8DRequestCreation();
		String actual=ap8d.getActualMasterLinkAp8d();
		
		Log.info("actual link present is "+actual);
		String expected="https://rb-wam-ap-q.bosch.com/workon01ap/secure/ProjectAdminConfig.jspa";
		
		Assert.assertEquals(actual, expected,"master Data link is not similar");
		
		

	}
	
	
	@Test(priority=2)
	public void verifyMasterDataLinkPropertyTargetAp() throws InterruptedException {

		AP8DRequestCreation ap8d = new AP8DRequestCreation();
		
		String actual=ap8d.getActualMasterLinkPropertyTargetAp8d();
		
		Log.info("actual link present is "+actual);
		String expected="_blank";
		
		Assert.assertEquals(actual, expected,"property does not contains target as blank");
		
	}
}
