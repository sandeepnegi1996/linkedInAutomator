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

public class TestCaseVerifyButtonsAfterRequestCreationEmeaQ2 extends TestBase {

	@BeforeMethod
	public void setTestName() {

		String testName = "TestCaseVerifyButtonsAfterRequestCreationEmeaQ2";

		if (!TestUtil.isTestRunnable(testName, Page.excel)) {
			throw new SkipException("Skipping the test" + testName.toUpperCase());
		}

	}

	@Test(dataProvider = "currentLoginUser", dataProviderClass = DP.class, priority = 1)
	public void verifyButtonsAfterRequestCreationEmeaQ2(String approver1) throws InterruptedException {

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
		rbga.addApprover(approver1);
		rbga.clickOnSubmitButton();
		rbga.displayRequestKey();

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(Page.getRequestKey());
		String requestUrl = Page.getCurrentURL();
		Reporter.log("<a target=\"_blank\" href=\"" + requestUrl + "\">Request Url</a>");

	}

	@Test(priority = 2)
	public void verifyCopyButtonPresence() {
		SearchRequestPage searchRequestPage = new SearchRequestPage();
		boolean copyButtonPresence = searchRequestPage.isCopyButtonPresentSecond();

		Assert.assertEquals(copyButtonPresence, true, "Copy button is Not Present");

		Log.info("copyButtonPresence status:   " + copyButtonPresence);
	}

	@Test(priority = 3)
	public void verifyApprovalPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();
		boolean approvalPresence = searchRequestPage.isApprovalsTabPresent();

		Assert.assertEquals(approvalPresence, true);

		Log.info("Approvals tab status:   " + approvalPresence);
	}

	@Test(priority = 4)
	public void verifyCommentsTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean commentsTabPresence = searchRequestPage.isCommentsTabPresent();

		Assert.assertEquals(commentsTabPresence, true);

		Log.info("comment tab status:   " + commentsTabPresence);

	}

	@Test(priority = 5)
	public void verifyHistoryTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean changeHistoryTabPresence = searchRequestPage.isChangeHistoryTabPresent();
		Assert.assertEquals(changeHistoryTabPresence, true);

		Log.info("change history tab status:   " + changeHistoryTabPresence);

	}

	@Test(priority = 6)
	public void verifyAllTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean AllTabPresence = searchRequestPage.isAllTabPresent();
		Assert.assertEquals(AllTabPresence, true);

		Log.info("all tab status: " + AllTabPresence);

	}

	@Test(priority = 7)
	public void verifyPrivacyNotePresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();
		boolean privacyNotePresence = searchRequestPage.isPrivacyNotePresent();

		Assert.assertEquals(privacyNotePresence, true);

		Log.info("Search bar status:   " + privacyNotePresence);

	}

	@Test(priority = 8)
	public void verifyCommentButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();
		boolean commentButtonPresence = searchRequestPage.iscommentButtonPresent();

		Assert.assertEquals(commentButtonPresence, true);

		Log.info("commentButtonPresence status:   " + commentButtonPresence);

	}

	@Test(priority = 9)
	public void verifyEditButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean editButtonPresence = searchRequestPage.isEditButtonPresent();

		Assert.assertEquals(editButtonPresence, true);

		Log.info("editButtonPresence status:   " + editButtonPresence);

	}

	@Test(priority = 10)
	public void verifyPrintButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean printButtonPresence = searchRequestPage.isPrintButtonPresent();

		Assert.assertEquals(printButtonPresence, true);

		Log.info("printButtonPresence status:   " + printButtonPresence);

	}

	// Presence of Tabs :- // Request Data , Workflow , Settings , Template

	@Test(priority = 14)
	public void verifyrequestTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean requestDataTabPresence = searchRequestPage.isRequestDataTabPresent();

		Assert.assertEquals(requestDataTabPresence, true);

		Log.info("requestDataTabPresence status:   " + requestDataTabPresence);

	}

	@Test(priority = 15)
	public void verifyWorkflowTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean workflowTabPresence = searchRequestPage.isWorkflowTabPresent();
		Assert.assertEquals(workflowTabPresence, true);
		Log.info("workflowTabPresence status:   " + workflowTabPresence);
	}

	@Test(priority = 16)
	public void verifySettingsTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean settingsTabPresence = searchRequestPage.isSettingsTabPresent();

		Assert.assertEquals(settingsTabPresence, true);

		Log.info("settingsTabPresence status:   " + settingsTabPresence);

	}

	@Test(priority = 16)
	public void verifyTemplateTabPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean templateTabPresence = searchRequestPage.isTemplateTabPresent();

		Assert.assertEquals(templateTabPresence, true);

		Log.info("templateTabPresence status:   " + templateTabPresence);

	}

	@Test(priority = 17)
	public void verifySettingsButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean settingsButtonPresence = searchRequestPage.isSettingsButtonPresent();

		Assert.assertEquals(settingsButtonPresence, true);

		Log.info("settingsButtonPresence status:   " + settingsButtonPresence);

	}

	@Test(priority = 18)
	public void verifyHelpButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean helpButtonPresence = searchRequestPage.isHelpButtonPresent();

		Assert.assertEquals(helpButtonPresence, true);

		Log.info("helpButtonPresence status:   " + helpButtonPresence);

	}
	// after request creation we are verifying whether the add attachment,manage
	// attachment , download all is present or not

	@Test(priority = 19)
	public void verifyAddAttachmentButtonPresence() {
		SearchRequestPage searchRequestPage = new SearchRequestPage();

		searchRequestPage.clickRequestDataTab();

		// Add Attachment button

		boolean addAttachmentButtonPresence = searchRequestPage.isAttachmentButtonPresent();

		Assert.assertEquals(addAttachmentButtonPresence, true);

		Log.info("AddAttachmentButtonPresence status:   " + addAttachmentButtonPresence);

		// Manage Attachment button

		boolean manageAttachmentButtonPresence = searchRequestPage.isManageAttachmentButtonPresent();

		Assert.assertEquals(manageAttachmentButtonPresence, true);

		Log.info("manageAttachmentButtonPresence status:   " + manageAttachmentButtonPresence);

		// Download All Attachments button
		boolean downloadAttachmentButtonPresence = searchRequestPage.isdownloadAttachmentButtonPresent();

		Assert.assertEquals(downloadAttachmentButtonPresence, true);

		Log.info("downloadAttachmentButtonPresence status:   " + downloadAttachmentButtonPresence);

	}

	@Test(priority = 11)
	public void verifyApproveButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean approveButtonPresence = searchRequestPage.isApproveButtonPresent();

		Assert.assertEquals(approveButtonPresence, true);

		Log.info("approveButtonPresence status: " + approveButtonPresence);
	}

	@Test(priority = 12)
	public void verifyApproveWithCommentButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean approveCommentButtonPresence = searchRequestPage.isApproveCommentButtonPresent();

		Assert.assertEquals(approveCommentButtonPresence, true);

		Log.info("approveCommentButtonPresence status: " + approveCommentButtonPresence);

	}

	@Test(priority = 13)
	public void verifyRejectButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean rejectButtonPresence = searchRequestPage.isRejectButtonPresent();

		Assert.assertEquals(rejectButtonPresence, true);

		Log.info("rejectButtonPresence status:   " + rejectButtonPresence);

	}

	@Test(priority = 14)
	public void verifySendBackToApplicantButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean sendBackToApplicantButtonPresence = searchRequestPage.isSendBackToApplicantButtonPresent();

		Assert.assertEquals(sendBackToApplicantButtonPresence, true);

		Log.info("sendBackToApplicantButtonPresence status:   " + sendBackToApplicantButtonPresence);

	}

	
	@Test(priority = 14)
	public void verifyWithdrawButtonPresence() {

		SearchRequestPage searchRequestPage = new SearchRequestPage();

		boolean withdrawButtonPresence = searchRequestPage.isWithdrawButtonPresent();

		Assert.assertEquals(withdrawButtonPresence, true);

		Log.info("withdrawButtonPresence status:   " + withdrawButtonPresence);

	

	}
	  	 

}
