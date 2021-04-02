package com.workon.testcases.generic;

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
import com.workon.pages.actions.rbubkpa.RBUBKPA_RequestCreation;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_RBUBKPARequestCreation extends TestBase{

	@BeforeMethod
	public void beforeClass() {

		String testName = "TestCase_RBUBKPARequestCreation";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void rbubkpaRequestCreation(String ntid) throws InterruptedException {

		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		RBUBKPA_RequestCreation rbubkpa = sp.gotoRBUBKPA();

		rbubkpa.switchToRBUBKPARequestCreation();
		rbubkpa.typeSubject();
		rbubkpa.typeSummary();
		rbubkpa.clickOnResposibleBuyer();
		rbubkpa.typePhoneNumber();
		rbubkpa.typeBuyersCode();
		rbubkpa.selectGroup();
		rbubkpa.selectPurchasingApprovalType();
		rbubkpa.typePartNumber();
		rbubkpa.typePlantSpecificVendorCode();
		rbubkpa.clickOnWorkflowTab();
		rbubkpa.deletingApproverList();
		rbubkpa.clickFirstAddApproverButton();
		rbubkpa.addApprover(ntid);
		rbubkpa.clickOnSubmitButton();
		Thread.sleep(10000);
		rbubkpa.displayRequestKey();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

}
