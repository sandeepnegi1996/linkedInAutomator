package com.workon.testcases.userselfservice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.userselfservice.MainProfilePage;
import com.workon.pages.actions.userselfservice.SubstitutePage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_AddDefaultSubstitueUnplannedFull {

	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {
		String testName = "TestCase_AddDefaultSubstitueUnplannedFull";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

		Page.initConfiguration();

	}

	@AfterMethod
	public void afterClass() {
		Page.quitBrowser();
	}

	// first were removing the default substitue aand then we are adding the default
	// substitute
	/*
	 * @Test(dataProvider = "substituteProvider", dataProviderClass = DP.class,
	 * priority = 1) public void addDefaultSubstituteUnplannedFullPermission(String
	 * ntid) throws InterruptedException {
	 */
		
	
		@Test
		public void addDefaultSubstituteUnplannedFullPermission() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		MainProfilePage profile = dp.gotoWorkONProfile();
		profile.switchToProfilePage();

		SubstitutePage substitute = profile.gotoSubstituePage();

		// then adding a new user
		String substituteUser="workontester1";
		substitute.addUser();
		substitute.addApprover(substituteUser);
		substitute.clickSaveButton();

		Thread.sleep(10000);
	 	
	 	//After saving I will Assert whether user is added or not
	 	
	 	boolean isSubstituteAdded= substitute.verifyDefaultSubstitueAdded();
	 	
	 	System.out.println("Substitute is added :     "+isSubstituteAdded);
	 
	 		Assert.assertEquals(isSubstituteAdded, true);
	 	
	 		Thread.sleep(4000);
	 	
	 	
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Added as a substitue to " + substituteUser);
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

}
