package com.workon.testcases.userselfservice;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.userselfservice.MainProfilePage;
import com.workon.pages.actions.userselfservice.SubstitutePage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_AddDefaultSubstitueUnplannedView {


	@BeforeMethod
	public void beforeClass() throws InterruptedException, IOException {
		String testName = "TestCase_AddDefaultSubstitueUnplannedView";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

		Page.initConfiguration();

	}

	@AfterMethod
	public void afterClass() {
		Page.quitBrowser();
	}

	

	
	
	//first were removing the default substitue aand then we are adding the default substitue
	@Test(dataProvider="substituteProvider",dataProviderClass=DP.class,priority=1)
	public void addDefaultSubstituteUnplannedFullPermission(String ntid) throws InterruptedException {
		
		DashboardPage dp = new DashboardPage();
	 	MainProfilePage profile= dp.gotoWorkONProfile();
	 	profile.switchToProfilePage();
	 	SubstitutePage substitute= profile.gotoSubstituePage();
	 	
	 	//then adding a new user
	 	substitute.addUser();
	 	substitute.addApprover(ntid);
	 	
	 	//select view permission
	 	
	 	
	 	substitute.clickSaveButton();
	 	
	 	Thread.sleep(5000);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Added as a substitue to "+ntid);
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
		
	}
	
}
