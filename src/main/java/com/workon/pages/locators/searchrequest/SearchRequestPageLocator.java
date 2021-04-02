package com.workon.pages.locators.searchrequest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchRequestPageLocator {

	@FindBy(xpath = "//td[@class='nav status']")
	private List<WebElement> statusList;
	
	
	
	//td[@class='nav issuekey']//a
	
	
	@FindBy(xpath = "//td[@class='nav issuekey']//a")
	private List<WebElement> issueKeyList;
	
	
	
	@FindBy(xpath="//textarea")
	private WebElement textareaElement;
	
	//span[contains(text(),'Please enter the comments!')]//following-sibling::div//input//following-sibling::textarea
	
	
	@FindBy(xpath="//span[contains(text(),'Please enter the comments!')]//following-sibling::div//input//following-sibling::textarea")
	private WebElement commentBoxElement;
	
	//button[contains(text(),'OK')]
	

	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement okButtonElement;
	
	
	//input[@type='submit' and @name='Create']
	
	@FindBy(xpath="//input[@type='submit' and @name='Create']")
	private WebElement createButtonElement;
	
	
	
	//input[@id='createFromDraftButton']
	
	
	@FindBy(xpath="//input[@id='createFromDraftButton']")
	private WebElement createDraftButtonElement;
	
	
	//below elements are first checked whether they are present or not
	//SaveAsDraftButton
	
	
	  @FindBy(css="#saveAsDraftButton") 
	  private WebElement saveAsDraftButtonElement;
	  
	  
	  //WorkOnSubmitButton
	  
	  @FindBy(css="#WorkOnSubmitButton") private WebElement
	  workONSubmitButtonElement;
	  
	  
	  
	  //cancelCreateButton //This is the cancel button with id as
	 // cancelCreateButton
	  
	  @FindBy(css="#WorkOnSubmitButton") private WebElement
	  cancelCreateButtonElement;
	 
	//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a"
	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	private WebElement requestKeyElement;
	
	
	
	//b[contains(text(),'Status:')]//parent::td
	
	@FindBy(xpath="//b[contains(text(),'Status:')]//parent::td")
	private WebElement requestStatusElement;
	
	
	
	//b[contains(text(),'Applicant:')]//parent::td
	//Applicant Name
	@FindBy(xpath="//b[contains(text(),'Applicant:')]//parent::td")
	private WebElement applicantNameElement;
	
	
	
	
	
	@FindBy(css="#creationDate")
	private WebElement createdDateElementElement;
	
	
	
	
	@FindBy(xpath="//b[contains(text(),'Priority:')]//parent::td")
	private WebElement priorityDateElement;
	
	
	
	//DeleteDraft
	@FindBy(xpath="//a[contains(text(),'Delete Draft")
	private WebElement deleteDraftElement;
	
	
	
	
	//CopyButtonElement
	@FindBy(xpath="//a[contains(text(),'Copy')]")
	private WebElement copyButtonElement;
	
	
	
	//a[contains(text(),'Print')]
	@FindBy(xpath="//a[contains(text(),'Print')]")
	private WebElement printButtonElement;



	//a[contains(text(),'Suspend')]
	@FindBy(xpath="//a[contains(text(),'Suspend')]")
	private WebElement suspendButtonElement;
	
	
	//span[contains(text(),'Please enter a reason for suspending this request:')]//following-sibling::div//input//following-sibling::textarea")
	

	@FindBy(xpath="//span[contains(text(),'Please enter a reason for suspending this request:')]//following-sibling::div//input//following-sibling::textarea")
	private WebElement suspendReasonTextareaElement;



	@FindBy(xpath="//a[contains(text(),'Resume')]")
	private WebElement resumeButtonElement;


	@FindBy(xpath="//span[contains(text(),'Please enter a reason for resuming this request:')]//following-sibling::div//input//following-sibling::textarea")
	private WebElement resumeReasonTextareaElement;



	@FindBy(xpath="//a[contains(text(),'Forward')]")
	private WebElement forwardButtonElement;



	
	//textarea[@id='comment']
	@FindBy(xpath="//textarea[@id='comment']")
	private WebElement commentBoxAfterForward;


	//div[@id='pickButton:system.field.boschassignee']
	@FindBy(xpath="//div[@id='pickButton:system.field.boschassignee']")
	private WebElement userpicker;


	
	//now we need to find the xpath for everyone
	
	
	@FindBy(xpath="//a[normalize-space()='Approvals']")
	private WebElement approvalsTab;


	@FindBy(xpath="//a[normalize-space()='Comments']")
	private WebElement commentsTab;


	@FindBy(xpath="//a[normalize-space()='Change History']")
	private WebElement changeHistoryTab;


	@FindBy(xpath="//a[normalize-space()='All']")
	private WebElement allTab;


	@FindBy(xpath="//a[normalize-space()='Privacy Note']")
	private WebElement privacyNoteTab;






	@FindBy(xpath="//a[normalize-space()='Copy']")
	private WebElement copyButtonSecond;


	@FindBy(xpath="//a[normalize-space()='Comment']")
	private WebElement commentButton;


	@FindBy(xpath="//a[normalize-space()='Edit']")
	private WebElement editButton;


	@FindBy(xpath="//a[normalize-space()='Print']")
	private WebElement printButton;






	@FindBy(xpath="//a[normalize-space()='Approve']")
	private WebElement approveButton;
	
	@FindBy(xpath="//a[normalize-space()='Approve (with comment)']")
	private WebElement approveWithCommentButton;
	
	@FindBy(xpath="//a[normalize-space()='Reject']")
	private WebElement rejectButton;
	
	@FindBy(xpath="//a[normalize-space()='Send back to applicant']")
	private WebElement sendBackButton;
	
	
	@FindBy(xpath="//a[normalize-space()='Withdraw request']")
	private WebElement withdrawButton;



	
	
	//Tabs
	
	@FindBy(xpath="//a[normalize-space()='Request data']")
	private WebElement requestDataTab;


	@FindBy(xpath="//a[normalize-space()='Workflow']")
	private WebElement workflowTab;


	@FindBy(xpath="//ul[@id='tabPanel-hideTabs']//a[contains(text(),'Settings')]")
	private WebElement settingsTab;


	@FindBy(xpath="//a[normalize-space()='Template']")
	private WebElement templateTab;


	@FindBy(xpath="//button[normalize-space()='Add Attachment']")
	private WebElement addAttachmentButton;


	@FindBy(xpath="//button[normalize-space()='Manage Attachment']")
	private WebElement manageAttachmentButton;


	@FindBy(xpath="//button[normalize-space()='Download All Attachments']")
	private WebElement downloadAllAttachment;


	@FindBy(xpath="//a[@title='User Settings']//img")
	private WebElement settingsButton;


	//a[normalize-space()='Help']
	@FindBy(xpath="//a[normalize-space()='Help']")
	private WebElement helpButton;


	@FindBy(xpath="//a[normalize-space()='Application Details']")
	private WebElement applicationDetailsTab;



	@FindBy(xpath="//a[normalize-space()='< WorkON Dashboard']")
	private WebElement dashboardLinkElement;

	
	@FindBy(xpath="//a[normalize-space()='WorkON Dashboard >']")
	private WebElement dashboardLinkElementSingleRequest;
	
	/**
	 * @return the statusList
	 */
	public List<WebElement> getStatusList() {
		return statusList;
	}


	/**
	 * @param statusList the statusList to set
	 */
	public void setStatusList(List<WebElement> statusList) {
		this.statusList = statusList;
	}


	/**
	 * @return the issueKeyList
	 */
	public List<WebElement> getIssueKeyList() {
		return issueKeyList;
	}


	/**
	 * @param issueKeyList the issueKeyList to set
	 */
	public void setIssueKeyList(List<WebElement> issueKeyList) {
		this.issueKeyList = issueKeyList;
	}


	/**
	 * @return the commentBoxElement
	 */
	public WebElement getCommentBoxElement() {
		return commentBoxElement;
	}


	/**
	 * @param commentBoxElement the commentBoxElement to set
	 */
	public void setCommentBoxElement(WebElement commentBoxElement) {
		this.commentBoxElement = commentBoxElement;
	}


	/**
	 * @return the okButtonElement
	 */
	public WebElement getOkButtonElement() {
		return okButtonElement;
	}


	/**
	 * @param okButtonElement the okButtonElement to set
	 */
	public void setOkButtonElement(WebElement okButtonElement) {
		this.okButtonElement = okButtonElement;
	}


	/**
	 * @return the createButtonElement
	 */
	public WebElement getCreateButtonElement() {
		return createButtonElement;
	}


	/**
	 * @param createButtonElement the createButtonElement to set
	 */
	public void setCreateButtonElement(WebElement createButtonElement) {
		this.createButtonElement = createButtonElement;
	}


	/**
	 * @return the createDraftButtonElement
	 */
	public WebElement getCreateDraftButtonElement() {
		return createDraftButtonElement;
	}


	/**
	 * @param createDraftButtonElement the createDraftButtonElement to set
	 */
	public void setCreateDraftButtonElement(WebElement createDraftButtonElement) {
		this.createDraftButtonElement = createDraftButtonElement;
	}


	/**
	 * @return the saveAsDraftButtonElement
	 */
	public WebElement getSaveAsDraftButtonElement() {
		return saveAsDraftButtonElement;
	}


	/**
	 * @param saveAsDraftButtonElement the saveAsDraftButtonElement to set
	 */
	public void setSaveAsDraftButtonElement(WebElement saveAsDraftButtonElement) {
		this.saveAsDraftButtonElement = saveAsDraftButtonElement;
	}


	/**
	 * @return the copyButtonElement
	 */
	public WebElement getCopyButtonElement() {
		return copyButtonElement;
	}


	/**
	 * @param copyButtonElement the copyButtonElement to set
	 */
	public void setCopyButtonElement(WebElement copyButtonElement) {
		this.copyButtonElement = copyButtonElement;
	}


	/**
	 * @return the printButtonElement
	 */
	public WebElement getPrintButtonElement() {
		return printButtonElement;
	}


	/**
	 * @param printButtonElement the printButtonElement to set
	 */
	public void setPrintButtonElement(WebElement printButtonElement) {
		this.printButtonElement = printButtonElement;
	}


	/**
	 * @return the suspendButtonElement
	 */
	public WebElement getSuspendButtonElement() {
		return suspendButtonElement;
	}


	/**
	 * @param suspendButtonElement the suspendButtonElement to set
	 */
	public void setSuspendButtonElement(WebElement suspendButtonElement) {
		this.suspendButtonElement = suspendButtonElement;
	}


	/**
	 * @return the suspendReasonTextareaElement
	 */
	public WebElement getSuspendReasonTextareaElement() {
		return suspendReasonTextareaElement;
	}


	/**
	 * @param suspendReasonTextareaElement the suspendReasonTextareaElement to set
	 */
	public void setSuspendReasonTextareaElement(WebElement suspendReasonTextareaElement) {
		this.suspendReasonTextareaElement = suspendReasonTextareaElement;
	}


	/**
	 * @return the resumeButtonElement
	 */
	public WebElement getResumeButtonElement() {
		return resumeButtonElement;
	}


	/**
	 * @param resumeButtonElement the resumeButtonElement to set
	 */
	public void setResumeButtonElement(WebElement resumeButtonElement) {
		this.resumeButtonElement = resumeButtonElement;
	}


	/**
	 * @return the resumeReasonTextareaElement
	 */
	public WebElement getResumeReasonTextareaElement() {
		return resumeReasonTextareaElement;
	}


	/**
	 * @param resumeReasonTextareaElement the resumeReasonTextareaElement to set
	 */
	public void setResumeReasonTextareaElement(WebElement resumeReasonTextareaElement) {
		this.resumeReasonTextareaElement = resumeReasonTextareaElement;
	}


	/**
	 * @return the forwardButtonElement
	 */
	public WebElement getForwardButtonElement() {
		return forwardButtonElement;
	}


	/**
	 * @param forwardButtonElement the forwardButtonElement to set
	 */
	public void setForwardButtonElement(WebElement forwardButtonElement) {
		this.forwardButtonElement = forwardButtonElement;
	}


	/**
	 * @return the commentBoxAfterForward
	 */
	public WebElement getCommentBoxAfterForward() {
		return commentBoxAfterForward;
	}


	/**
	 * @param commentBoxAfterForward the commentBoxAfterForward to set
	 */
	public void setCommentBoxAfterForward(WebElement commentBoxAfterForward) {
		this.commentBoxAfterForward = commentBoxAfterForward;
	}


	/**
	 * @return the userpicker
	 */
	public WebElement getUserpicker() {
		return userpicker;
	}


	/**
	 * @param userpicker the userpicker to set
	 */
	public void setUserpicker(WebElement userpicker) {
		this.userpicker = userpicker;
	}


	/**
	 * @return the approvalsTab
	 */
	public WebElement getApprovalsTab() {
		return approvalsTab;
	}


	/**
	 * @param approvalsTab the approvalsTab to set
	 */
	public void setApprovalsTab(WebElement approvalsTab) {
		this.approvalsTab = approvalsTab;
	}


	/**
	 * @return the commentsTab
	 */
	public WebElement getCommentsTab() {
		return commentsTab;
	}


	/**
	 * @param commentsTab the commentsTab to set
	 */
	public void setCommentsTab(WebElement commentsTab) {
		this.commentsTab = commentsTab;
	}


	/**
	 * @return the changeHistoryTab
	 */
	public WebElement getChangeHistoryTab() {
		return changeHistoryTab;
	}


	/**
	 * @param changeHistoryTab the changeHistoryTab to set
	 */
	public void setChangeHistoryTab(WebElement changeHistoryTab) {
		this.changeHistoryTab = changeHistoryTab;
	}


	/**
	 * @return the allTab
	 */
	public WebElement getAllTab() {
		return allTab;
	}


	/**
	 * @param allTab the allTab to set
	 */
	public void setAllTab(WebElement allTab) {
		this.allTab = allTab;
	}


	/**
	 * @return the privacyNoteTab
	 */
	public WebElement getPrivacyNoteTab() {
		return privacyNoteTab;
	}


	/**
	 * @param privacyNoteTab the privacyNoteTab to set
	 */
	public void setPrivacyNoteTab(WebElement privacyNoteTab) {
		this.privacyNoteTab = privacyNoteTab;
	}


	/**
	 * @return the copyButtonSecond
	 */
	public WebElement getCopyButtonSecond() {
		return copyButtonSecond;
	}


	/**
	 * @param copyButtonSecond the copyButtonSecond to set
	 */
	public void setCopyButtonSecond(WebElement copyButtonSecond) {
		this.copyButtonSecond = copyButtonSecond;
	}


	/**
	 * @return the commentButton
	 */
	public WebElement getCommentButton() {
		return commentButton;
	}


	/**
	 * @param commentButton the commentButton to set
	 */
	public void setCommentButton(WebElement commentButton) {
		this.commentButton = commentButton;
	}


	/**
	 * @return the editButton
	 */
	public WebElement getEditButton() {
		return editButton;
	}


	/**
	 * @param editButton the editButton to set
	 */
	public void setEditButton(WebElement editButton) {
		this.editButton = editButton;
	}


	/**
	 * @return the printButton
	 */
	public WebElement getPrintButton() {
		return printButton;
	}


	/**
	 * @param printButton the printButton to set
	 */
	public void setPrintButton(WebElement printButton) {
		this.printButton = printButton;
	}


	/**
	 * @return the approveButton
	 */
	public WebElement getApproveButton() {
		return approveButton;
	}


	/**
	 * @param approveButton the approveButton to set
	 */
	public void setApproveButton(WebElement approveButton) {
		this.approveButton = approveButton;
	}


	/**
	 * @return the approveWithCommentButton
	 */
	public WebElement getApproveWithCommentButton() {
		return approveWithCommentButton;
	}


	/**
	 * @param approveWithCommentButton the approveWithCommentButton to set
	 */
	public void setApproveWithCommentButton(WebElement approveWithCommentButton) {
		this.approveWithCommentButton = approveWithCommentButton;
	}


	/**
	 * @return the rejectButton
	 */
	public WebElement getRejectButton() {
		return rejectButton;
	}


	/**
	 * @param rejectButton the rejectButton to set
	 */
	public void setRejectButton(WebElement rejectButton) {
		this.rejectButton = rejectButton;
	}


	/**
	 * @return the sendBackButton
	 */
	public WebElement getSendBackButton() {
		return sendBackButton;
	}


	/**
	 * @param sendBackButton the sendBackButton to set
	 */
	public void setSendBackButton(WebElement sendBackButton) {
		this.sendBackButton = sendBackButton;
	}


	/**
	 * @return the withdrawButton
	 */
	public WebElement getWithdrawButton() {
		return withdrawButton;
	}


	/**
	 * @param withdrawButton the withdrawButton to set
	 */
	public void setWithdrawButton(WebElement withdrawButton) {
		this.withdrawButton = withdrawButton;
	}


	/**
	 * @return the requestDataTab
	 */
	public WebElement getRequestDataTab() {
		return requestDataTab;
	}


	/**
	 * @param requestDataTab the requestDataTab to set
	 */
	public void setRequestDataTab(WebElement requestDataTab) {
		this.requestDataTab = requestDataTab;
	}


	/**
	 * @return the workflowTab
	 */
	public WebElement getWorkflowTab() {
		return workflowTab;
	}


	/**
	 * @param workflowTab the workflowTab to set
	 */
	public void setWorkflowTab(WebElement workflowTab) {
		this.workflowTab = workflowTab;
	}


	/**
	 * @return the settingsTab
	 */
	public WebElement getSettingsTab() {
		return settingsTab;
	}


	/**
	 * @param settingsTab the settingsTab to set
	 */
	public void setSettingsTab(WebElement settingsTab) {
		this.settingsTab = settingsTab;
	}


	/**
	 * @return the templateTab
	 */
	public WebElement getTemplateTab() {
		return templateTab;
	}


	/**
	 * @param templateTab the templateTab to set
	 */
	public void setTemplateTab(WebElement templateTab) {
		this.templateTab = templateTab;
	}


	/**
	 * @return the addAttachmentButton
	 */
	public WebElement getAddAttachmentButton() {
		return addAttachmentButton;
	}


	/**
	 * @param addAttachmentButton the addAttachmentButton to set
	 */
	public void setAddAttachmentButton(WebElement addAttachmentButton) {
		this.addAttachmentButton = addAttachmentButton;
	}


	/**
	 * @return the manageAttachmentButton
	 */
	public WebElement getManageAttachmentButton() {
		return manageAttachmentButton;
	}


	/**
	 * @param manageAttachmentButton the manageAttachmentButton to set
	 */
	public void setManageAttachmentButton(WebElement manageAttachmentButton) {
		this.manageAttachmentButton = manageAttachmentButton;
	}


	/**
	 * @return the downloadAllAttachment
	 */
	public WebElement getDownloadAllAttachment() {
		return downloadAllAttachment;
	}


	/**
	 * @param downloadAllAttachment the downloadAllAttachment to set
	 */
	public void setDownloadAllAttachment(WebElement downloadAllAttachment) {
		this.downloadAllAttachment = downloadAllAttachment;
	}


	/**
	 * @return the settingsButton
	 */
	public WebElement getSettingsButton() {
		return settingsButton;
	}


	/**
	 * @param settingsButton the settingsButton to set
	 */
	public void setSettingsButton(WebElement settingsButton) {
		this.settingsButton = settingsButton;
	}


	/**
	 * @return the helpButton
	 */
	public WebElement getHelpButton() {
		return helpButton;
	}


	/**
	 * @param helpButton the helpButton to set
	 */
	public void setHelpButton(WebElement helpButton) {
		this.helpButton = helpButton;
	}


	/**
	 * @return the applicationDetailsTab
	 */
	public WebElement getApplicationDetailsTab() {
		return applicationDetailsTab;
	}


	/**
	 * @param applicationDetailsTab the applicationDetailsTab to set
	 */
	public void setApplicationDetailsTab(WebElement applicationDetailsTab) {
		this.applicationDetailsTab = applicationDetailsTab;
	}


	/**
	 * @return the dashboardLinkElement
	 */
	public WebElement getDashboardLinkElement() {
		return dashboardLinkElement;
	}


	/**
	 * @param dashboardLinkElement the dashboardLinkElement to set
	 */
	public void setDashboardLinkElement(WebElement dashboardLinkElement) {
		this.dashboardLinkElement = dashboardLinkElement;
	}


	/**
	 * @return the dashboardLinkElementSingleRequest
	 */
	public WebElement getDashboardLinkElementSingleRequest() {
		return dashboardLinkElementSingleRequest;
	}


	/**
	 * @param dashboardLinkElementSingleRequest the dashboardLinkElementSingleRequest to set
	 */
	public void setDashboardLinkElementSingleRequest(WebElement dashboardLinkElementSingleRequest) {
		this.dashboardLinkElementSingleRequest = dashboardLinkElementSingleRequest;
	}



	











	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
