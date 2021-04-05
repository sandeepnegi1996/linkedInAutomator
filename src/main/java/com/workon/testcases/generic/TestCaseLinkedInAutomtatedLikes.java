package com.workon.testcases.generic;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.LinkedInHomePage;
import com.workon.pages.actions.LinkedInLoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseLinkedInAutomtatedLikes extends TestBase {

	@BeforeMethod
	public void beforeClass() {
		String testName = "TestCaseLinkedInAutomtatedLikes";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 1, enabled = false)
	public void sendConnectionRequest(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		homepage.navigateToConnectPage();
		homepage.scrollNTimes(5);

		Thread.sleep(2000);

		homepage.clickOnConnectButtonOneByOne();
		homepage.scrollNTimes(5);

		Thread.sleep(2000);

		homepage.clickOnConnectButtonOneByOne();

		Thread.sleep(3000);

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 2, enabled = false)
	public void sendMessage(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		homepage.navigateToMessagePage();

		/*
		 * homepage.scrollNTimes(1); Thread.sleep(3000);
		 */
		homepage.sendMessageToConnection();

		// last message send to 45

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 3, enabled = true)
	public void sendCommentOnPost(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		homepage.scrollNTimes(5);

		Thread.sleep(2000);

		homepage.makeComment();

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 4, enabled = false)
	public void completeLinkedInAutomation(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		homepage.scrollNTimes(5);

		Thread.sleep(2000);

		homepage.clickOnLikeButton();

		homepage.scrollNTimes(2);

		Thread.sleep(2000);

		homepage.makeComment();

		homepage.scrollNTimes(2);

		Thread.sleep(2000);

		// go to connection page

		homepage.navigateToConnectPage();

		homepage.clickOnConnectButtonOneByOne();

		homepage.scrollNTimes(2);

		Thread.sleep(2000);

	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 5, enabled = false)
	public void commentInterestedInAutomationTestingProfile(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		Thread.sleep(2000);

		homepage.navigateToHashtagAutomationTestingPage();

		homepage.scrollNTimes(5);

		Thread.sleep(2000);

		homepage.makeCommentInterested();
		Thread.sleep(2000);

	}

}
