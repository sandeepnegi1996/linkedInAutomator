package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.userselfservice.MainProfilePage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseTextUpdateProductBacklogItem6548 extends TestBase {

	@BeforeMethod
	public void beforeClass(){
		String testName = "TestCaseTextUpdateProductBacklogItem6548";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(priority=1)
	public void verifyEmailconfigurationTextPresent() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		MainProfilePage profile = dp.gotoWorkONProfile();
		profile.switchToProfilePage();

		profile.gotoEmailSettingsPage();
		Thread.sleep(2000);
		
		boolean actual=profile.isEmailConfigurationTextPresent();
		Assert.assertEquals(actual, true,"email configuration text is present");
		
	}
	
	@Test(priority=2)
	public void verifyTextUpdatedValueUserSelfService() throws InterruptedException {

		MainProfilePage profile = new MainProfilePage();

		profile.gotoEmailSettingsPage();
		
		Thread.sleep(2000);
		
		String actual=profile.isEmailConfigurationTextUpdated();
		String expected="In this tab a user can select if he/she wants to receive mails when being a CC/Substitute/Assignee recipient for each project / default to all projects.";
		
		Assert.assertEquals(actual, expected,"updated text is not present in the email settings tab");
		
		Log.info("actual text in the page is "+actual);
		
	}
	
	
	//verify the presence of AsCC, AsSubstitute and AsAssignee in the email settings
	@Test(priority=3)
	public void verifyTextUpdatedAsCCAsSubstituteAsAssignee() throws InterruptedException {

		MainProfilePage profile = new MainProfilePage();

		profile.gotoEmailSettingsPage();
		
		Thread.sleep(2000);
		
		boolean actualAsCc=profile.isAsCCTextPresent();
		Assert.assertEquals(actualAsCc, true,"As CC text is not present");

		boolean actualAsSubstitute=profile.isAsSubstitutePresent();
		Assert.assertEquals(actualAsSubstitute, true,"As  substitute text is not present");
		
		boolean actualAsAssignee=profile.isAsAssigneePresent();
		Assert.assertEquals(actualAsAssignee, true,"As Assignee text is not present");
		
		
		
		
	}
	

}
