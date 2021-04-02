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
import com.workon.pages.actions.apmaze.APMAZERequestCreation;
import com.workon.pages.actions.login.LoginPage;
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_APMAZERequestCreation extends TestBase {

	@BeforeMethod
	public void beforeClass() {
		String testName = "TestCase_APMAZERequestCreation";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}
	
	}

	@Test(dataProvider = "ntidProvider", dataProviderClass = DP.class)
	public void apmazeRequestCreation(String ntid) throws InterruptedException {


		LoginPage login=new LoginPage();
		DashboardPage dp=login.doLogin();
		SearchPage sp = dp.gotoSearchBox();
		APMAZERequestCreation apmaze = sp.gotoAPMAZE();
		apmaze.switchtoRequestCreationTab();
		apmaze.clickRequestDataElement();
		apmaze.typeSubject();
		apmaze.typeSummary();
		apmaze.typePhoneNumber();
		apmaze.typePartName();
		apmaze.selectPriority();
		apmaze.selectRBTAElement();
		apmaze.typeBusinessEntry();
		apmaze.typeProcessName();
		apmaze.typeMachineName();
		apmaze.typeMaximumStock();
		apmaze.typeReorderPoint();
		apmaze.typeDescription();
		apmaze.typeReason();
		apmaze.typeDelivery();
		apmaze.typeDesciptionTextArea();
		apmaze.clickOnWorkflowTab();
		apmaze.clickEditApproval();
		apmaze.addApprover(ntid);
		apmaze.clickOnSubmitButton();
		Thread.sleep(10000);
		apmaze.displayRequestKeyApmaze();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}


}
