package com.workon.testcases.generic;

import java.io.IOException;

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
import com.workon.pages.actions.stga.STGA_RequestCreation;
import com.workon.utilities.testUtil.TestUtil;

public class TestCaseStgaRequestCreation extends TestBase {

	@BeforeMethod
	public void beforeClass() {
		String testName = "TestCase_STGARequestCreation";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	
	}


	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void createSTGARequest(String ntid) throws InterruptedException {


		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
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
		st.addApprover(ntid);
		st.clickOnSubmitButton();
		Thread.sleep(10000);
		st.displayRequestKey();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}
}
