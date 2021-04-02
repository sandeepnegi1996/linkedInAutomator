package com.workon.testcases.generic;

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

public class TestCase_WPDIntegrationGroups extends TestBase {


		@BeforeMethod
		public void beforeClass() {
			String testName = "TestCase_WPDIntegrationGroups";

			if (!TestUtil.isTestRunnable(testName, Page.excel)) {
				throw new SkipException("Skipping the test" + testName.toUpperCase());
			}

		}


		@Test(dataProvider = "wpdGroupProvider", dataProviderClass = DP.class)
		public void rbgaRequestCreation(String wpdGroup) throws InterruptedException {

			LoginPage login = new LoginPage();
			DashboardPage dp = login.doLogin();

			SearchPage sp = dp.gotoSearchBox();
			RBGARequestCreation rbga = sp.gotoRBGA();
			rbga.switchToRbgaRequestCreation();
			rbga.clickCheckBoxElement();
			rbga.typeBriefDescription();
			rbga.typeLocation();
			rbga.typeFullDescription();
			rbga.clickOnWorkflowTab();
			rbga.clickfirstApproverButton();
			rbga.addApprover(wpdGroup);

			String actualUser = wpdGroup;
			Log.info("Actual user added is " + actualUser);

			boolean actual = true;

			boolean expected = rbga.ExpectedWpdGroup();

			Log.info("Expected is " + expected);

			Assert.assertEquals(actual, expected);

			SearchRequestPage searchRequestPage = new SearchRequestPage();
			
			searchRequestPage.clickOnSaveAsDraft();
			Thread.sleep(10000);
			rbga.displayRequestKey();

			System.setProperty("org.uncommons.reportng.escape-output", "false");
			Reporter.log(Page.getRequestKey());
			String requestUrl = Page.getCurrentURL();
			Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

		}

}
