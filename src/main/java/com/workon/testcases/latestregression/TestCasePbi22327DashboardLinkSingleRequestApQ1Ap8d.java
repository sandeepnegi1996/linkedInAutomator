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
import com.workon.pages.actions.ap8d.AP8DRequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCasePbi22327DashboardLinkSingleRequestApQ1Ap8d extends TestBase {

	// create request
	// send request
	// then verify the dashboard link button in the search request page for the
	// single request

	@BeforeMethod
	public static void setTestName() {
		String testName = "TestCasePbi22327DashboardLinkSingleRequestApQ1Ap8d";
		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	}

	@Test(priority=1,dataProvider = "currentLoginUser", dataProviderClass = DP.class)
	public void ap8dRequestCreation(String ntid) throws InterruptedException {

		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		AP8DRequestCreation ap8d = sp.gotoAP8D();
		ap8d.switchToRbgaRequestCreation();
		ap8d.clickOnApplicationDetails();
		ap8d.type8dReportNumber();
		ap8d.selectAddApprovalForInternal();
		ap8d.typeComment();
		ap8d.clickOnWorkflowTab();
		ap8d.clickAdd_anApprover();
		ap8d.addApprover(ntid);
		Log.info("Assigned to: "+ntid);
		ap8d.clickOnSubmitButton();
		
		Thread.sleep(10000);
		ap8d.displayRequestKey();
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	// use the same test cases that were used in the search request page

	@Test(priority = 2)
	public void verifyPropertyTargetForDashboardLink() throws InterruptedException {
		Log.startTestCase("Verify the target property Dashboard link");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String targetPropertyValueActual = searchRequestPage.dashboardLinkTargetPropertySingleRequest();

		Log.info("Dashboard link target property value:  " + targetPropertyValueActual);

		Assert.assertEquals(targetPropertyValueActual, "_blank",
				"*** Dashbaord link property target is not blank  ***");

		Log.endTestCase("Verify the target property Dashboard link");

	}

	@Test(priority = 3)
	public void verifyLabelOfDashboardLink() throws InterruptedException {
		Log.startTestCase("verifyLabelOfDashboardLink");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String labelDashboardLink = searchRequestPage.getDashboardLinkLabelSingleRequest();

		Log.info("Dashboard label in Search Request Page:" + labelDashboardLink);

		Assert.assertEquals(labelDashboardLink.trim(), "WorkON Dashboard >",
				"*** Dashbaord Label in Search Request Page  ***");

		Log.endTestCase("verifyLabelOfDashboardLink");

	}

	@Test(priority = 4)
	public void verifyDashboardLinkHref() throws InterruptedException {
		Log.startTestCase("verifyHrefDashboardLink");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String link = searchRequestPage.getDashboardLinkHrefSingleRequest();

		Log.info("Dashboard link in Search Request Page:" + link);

		Assert.assertEquals(link, "https://rb-wam-q.bosch.com/WorkOnDashBoard/search/search.seam",
				"*** Dashbaord link present in Search Request Page  ***");

		Log.endTestCase("verifyHrefDashboardLink");

	}

}
