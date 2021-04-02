package com.workon.testcases.latestregression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.base.TestBase;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseVerifyDateFormatEmeaRbga extends TestBase {
	
	@Test(dataProvider="ntidProvider",dataProviderClass=DP.class)
	public void verifyDateFormatEmeaRbga(String ntid) throws InterruptedException {
		
		Log.startTestCase("Verify Date Format EMEA Q2 RBGA");

		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		RBGARequestCreation rbga = sp.gotoRBGA();
		rbga.switchToRbgaRequestCreation();
		rbga.clickCheckBoxElement();
		rbga.typeBriefDescription();
		rbga.typeLocation();
		rbga.typeFullDescription();
		rbga.clickOnWorkflowTab();
		rbga.clickfirstApproverButton();
		rbga.addApprover(ntid);

		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();
		
		SearchRequestPage search=new SearchRequestPage();

		// verify key is present
		Assert.assertEquals(search.isKeyPresent(), true);


		// Assert Date

		String createdDate = search.getCreatedDate();
		Log.info(createdDate);

		
		String currentDate = search.getCurrentDate();
		Log.info(currentDate);
		
		boolean isDateContains=createdDate.contains(currentDate);
	
		Assert.assertEquals(isDateContains, true,"date format is not correct");
		
		//verify the created date contains the timezone
		
		boolean isDateContainsTimeZone=createdDate.contains("GMT+02:00");
		Assert.assertEquals(isDateContainsTimeZone, true,"created date does not contains timezone");
		
		
		
		
		
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");
		
		
		
	}

	@BeforeMethod
	public void setTestName(){
		
		
		String testName = "TestCaseVerifyDateFormatEmeaRbga";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
		
	}
}
