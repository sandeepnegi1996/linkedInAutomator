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
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCasePbi22327DashboardLinkSearchPage extends TestBase {

	@BeforeMethod
	public void setTestName() {

		String testName = "TestCasePbi22327DashboardLinkSearchPage";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(priority = 1)
	public void verifyDashboardLinkInSearchRequestPage() throws InterruptedException {
		
		Log.startTestCase("verifyDashboard Link in Search Page EMEA Q2");

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		
		SearchRequestPage searchRequestPage = sp.gotoSearchRequestRbga();

		searchRequestPage.switchToRequestSearching();

		boolean isDashboardLinkPresent = searchRequestPage.isDashboardLinkPresent();

		Log.info("status of the dashboard link in the search request page:  " + isDashboardLinkPresent);

		Assert.assertEquals(isDashboardLinkPresent, true, "*** Dashbaord link is not present  ***");

		Log.endTestCase("verifyDashboard Link in Search Page EMEA Q2");

	}

	@Test(priority = 2)
	public void verifyPropertyTargetForDashboardLink() throws InterruptedException {
		Log.startTestCase("Verify the target property Dashboard link");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String targetPropertyValueActual = searchRequestPage.dashboardLinkTargetProperty();

		Log.info("Dashboard link target property value:  " + targetPropertyValueActual);

		Assert.assertEquals(targetPropertyValueActual, "_blank",
				"*** Dashbaord link property target is not blank  ***");

		Log.endTestCase("Verify the target property Dashboard link");

	}

	@Test(priority = 3)
	public void verifyLabelOfDashboardLink() throws InterruptedException {
		Log.startTestCase("verifyLabelOfDashboardLink");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String labelDashboardLink = searchRequestPage.getDashboardLinkLabel();

		Log.info("Dashboard label in Search Request Page:" + labelDashboardLink);

		Assert.assertEquals(labelDashboardLink.trim(), "< WorkON Dashboard",
				"*** Dashbaord Label in Search Request Page  ***");

		Log.endTestCase("verifyLabelOfDashboardLink");

	}

	@Test(priority = 4)
	public void verifyDashboardLinkHref() throws InterruptedException {
		Log.startTestCase("verifyHrefDashboardLink");

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		String link = searchRequestPage.getDashboardLinkHref();

		Log.info("Dashboard link in Search Request Page:" + link);

		Assert.assertEquals(link, "https://rb-wam-q.bosch.com/WorkOnDashBoard/search/search.seam",
				"*** Dashbaord link present in Search Request Page  ***");

		Log.endTestCase("verifyHrefDashboardLink");

	}

}
