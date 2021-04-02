package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseVerifyMasterDataLinkDashboardPbi22783 extends TestBase {

	@BeforeMethod
	public void setTestName()  {
		String testName = "TestCaseVerifyMasterDataLinkDashboardPbi22783";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(priority=1)
	public void verifyMasterDataLinkEmeaQ2() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();

		SearchPage sp = dp.gotoSearchBox();
		 sp.searchRBGA();
		 
		 Thread.sleep(3000);
		RBGARequestCreation rbga = new RBGARequestCreation();
		String actual=rbga.getActualMasterLink();
		
		Log.info("actual link present is "+actual);
		String expected="https://rb-wam-q.bosch.com/workon01/workflow02q/secure/ProjectAdminConfig.jspa";
		
		Assert.assertEquals(actual, expected,"master Data link is not similar");
		
		

	}
	
	
	@Test(priority=2)
	public void verifyMasterDataLinkPropertyTargetEmeaQ2() throws InterruptedException {

		RBGARequestCreation rbga = new RBGARequestCreation();
		
		String actual=rbga.getActualMasterLinkPropertyTarget();
		
		Log.info("actual link present is "+actual);
		String expected="_blank";
		
		Assert.assertEquals(actual, expected,"property does not contains target as blank");
		
	}
	

	 
	
}
