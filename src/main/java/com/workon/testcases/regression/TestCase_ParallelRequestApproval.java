package com.workon.testcases.regression;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.dataprovider.DP;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.pages.actions.login.LoginPage;
import com.workon.pages.actions.stga.STGA_RequestCreation;
import com.workon.utilities.loggers.Log;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_ParallelRequestApproval {

	@BeforeMethod
	public void beforeClass() {

		String testName = "TestCase_ParallelRequestApproval";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

		Log.info("******    opening browser      ********");
	}


	@Test(dataProvider = "parallelApproverProvider", dataProviderClass = DP.class)
	public void stgaParallelApproval(String approver1, String approver2) throws InterruptedException {

		LoginPage login = new LoginPage();
		DashboardPage dp = login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		STGA_RequestCreation st = sp.gotoSTGA();

		st.switchToRequestCreationTab();
		st.typeSuject();
		st.typeSummary();
		st.selectOptionProcess();
		st.selectOptionSubProcess();
		st.typeTopic();
		st.typeDescription();
		st.deleteAdditionaFieldsAlreadyExisting();
		st.clickOnWorkflowTab();
		st.deleteApprovalList();

		st.addApprover(login.currentLoggedInUser());
		// adding first approver for the parallel process
		st.addApprover(approver1);

		// Adding the second approver for the parallel process
		st.addApprover(approver2);

		st.clickOnSubmitButton();
		st.displayRequestKey();

		// here we will be checking the approval button is present or not and the we can
		// click on the approver button

		Assert.assertEquals(true, st.isApproverButtonPresent());
		st.clickApproverButton();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}
}
