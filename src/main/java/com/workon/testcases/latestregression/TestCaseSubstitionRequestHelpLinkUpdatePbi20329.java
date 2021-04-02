package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.userselfservice.IActForPage;
import com.workon.pages.actions.userselfservice.MainProfilePage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseSubstitionRequestHelpLinkUpdatePbi20329 extends TestBase {

	@BeforeMethod
	public void beforeClass(){
		String testName = "TestCaseSubstitionRequestHelpLinkUpdatePbi20329";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(priority=1)
	public void verifySubstituteRequestHelpLink() throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		MainProfilePage profile = dp.gotoWorkONProfile();
		profile.switchToProfilePage();

		IActForPage iActForPage = profile.gotoIActForPage();


		String actualLinkValue = iActForPage.getHelpLinkValue();
		
		Log.info("Actual link present in the I act For Tab substitute Help Link" +actualLinkValue);

		String expectedLinkValue = "https://inside-docupedia.bosch.com/confluence/display/workonend/Substition+Request";

		Assert.assertEquals(actualLinkValue, expectedLinkValue, "link is not matching");

	}
	
	@Test(priority=2)
	public void verifyLinkOpenInNewPage() {
		
		
		IActForPage iActForPage = new IActForPage();

		String actual = iActForPage.getPropertyValueTarget();
		
		Log.info("Actual Target Value present :  " +actual);

		String expected = "_blank";

		Assert.assertEquals(actual, expected, "Target value is not _blank");
		
		
	}
	
	

}
