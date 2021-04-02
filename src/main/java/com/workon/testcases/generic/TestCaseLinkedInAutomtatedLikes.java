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

	/*
	 * @Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority =
	 * 1) public void linkedInLike(String ntid) throws InterruptedException {
	 * 
	 * LinkedInLoginPage login = new LinkedInLoginPage(); LinkedInHomePage homepage
	 * = login.doLogin();
	 * 
	 * homepage.clickOnLikeButton();
	 * 
	 * homepage.navigateToConnectPage();
	 * 
	 * homepage.clickOnConnectButtonOneByOne();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * }
	 */

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class, priority = 1)
	public void sendMessage(String ntid) throws InterruptedException {

		LinkedInLoginPage login = new LinkedInLoginPage();
		LinkedInHomePage homepage = login.doLogin();

		homepage.clickOnLikeButton();
		

		  homepage.scrollNTimes(4);
		  Thread.sleep(7000);
		  homepage.clickOnLikeButton();
		  
		//homepage.navigateToMessagePage();

		
		  homepage.scrollNTimes(2);
		  Thread.sleep(7000);
	
		//homepage.sendMessageToConnection();
		

	}

}
