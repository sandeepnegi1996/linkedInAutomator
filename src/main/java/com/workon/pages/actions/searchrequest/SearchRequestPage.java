package com.workon.pages.actions.searchrequest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.searchrequest.SearchRequestPageLocator;
import com.workon.utilities.loggers.Log;

public class SearchRequestPage extends Page {

	private SearchRequestPageLocator searchrequestpagelocator = null;

	public SearchRequestPage() {

		this.searchrequestpagelocator = new SearchRequestPageLocator();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);

		PageFactory.initElements(factory, this.searchrequestpagelocator);
	}

	// methods from RBGARequestSearching

	public void switchToRequestSearching() {
		switchToAnyTab(driver, 2);
	}

	// This method returns the row from the list which has status as "Draft"
	public int requestWithStatusAsDraft() {


		String firstStatus = "";
		for (int i = 0; i < searchrequestpagelocator.getStatusList().size(); i++) {

			firstStatus = searchrequestpagelocator.getStatusList().get(i).getText();
			if (firstStatus.equals("Draft")) {
				Log.info("returned Row is " + i);
				return i;
			}
		}
		return 0;

	}

	// Based on above method this function will open the request with Status as
	// Draft
	public void openRequestWithStatusDraft(int rowNumber) {


		Log.info("clicked on the row with key as " + searchrequestpagelocator.getIssueKeyList().get(rowNumber).getText());
		WebElement element = searchrequestpagelocator.getIssueKeyList().get(rowNumber);
		click(element);

	}

	// Give the row number and this function will get the request key from the list
	// of requests

	public String getRequestKeyWithRowNumber(int rowNumber) {

		Log.info("clicked on the row with key as " + searchrequestpagelocator.getIssueKeyList().get(rowNumber).getText());
		return searchrequestpagelocator.getIssueKeyList().get(rowNumber).getText();

	}

	// Verify Text area Present or not
	public boolean isTextAreaPresent() {
		return isElementPresent(By.xpath("//textarea"));
	}

	// Type the comment in the text area which is present in in isTextAreaPresent
	// --> function
	public void typeComment() {

		type(searchrequestpagelocator.getCommentBoxElement(), "This is the comment before deleting");

	}

	// Click on the Comment
	public void clickOnOkComment() {

		click(searchrequestpagelocator.getOkButtonElement());

	}

	// Input--> Request Key and this function will check in the list of tables
	// whether it is present or not
	public boolean isRequestKeyAvailable(String deletedRequestKey) {


		List<WebElement> keyList = searchrequestpagelocator.getIssueKeyList();

		for (WebElement element : keyList) {
			String currentKey = element.getText();
			if (currentKey.equals(deletedRequestKey)) {
				return true;
			}
		}
		return false;

	}

	// Return the First Request WebElement from the list in the table using issuekey
	public WebElement getFirstRequest() {

		List<WebElement> keyList = searchrequestpagelocator.getIssueKeyList();

		String currentKey = keyList.get(0).getText();
		Log.info(currentKey);
		return keyList.get(0);
	}

	// Opening the First Request
	public void openingFirstRequest() {
		click(getFirstRequest());
	}

	public void clickOnCreateButton() {

		click(searchrequestpagelocator.getCreateButtonElement());
	}

	// Click on the DraftSubmitButton
	public void clickOnDraftSubmitButton() {
		click(searchrequestpagelocator.getCreateDraftButtonElement());
	}

	// After Copying we want to check the request key this function will get the
	// Request Key
	public void displayRequestKeyAfterCopying()  {
		Log.info("Request Key is : " + getRequestKey());
	}

	public boolean isSaveAsDraftPresent() {

		return isElementPresent(By.id("saveAsDraftButton"));

	}

	public boolean isSubmitPresent() {
		return isElementPresent(By.id("WorkOnSubmitButton"));

	}


	public boolean isResetPresent() {
		return isElementPresent(By.id("cancelCreateButton"));

	}

	public void clickOnSaveAsDraft() {


		click(searchrequestpagelocator.getSaveAsDraftButtonElement());
	}

	public boolean isKeyPresent() {
		return isElementPresent(By.xpath("//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a"));
	}

	public String getStatus() {

		return getElementText(By.xpath("//b[contains(text(),'Status:')]//parent::td"));

	}

	// getApplicantName

	public String getApplicantName() {

		return getElementText(By.xpath("//b[contains(text(),'Applicant:')]//parent::td"));
	}

	public String getCurrentAssigneeName() {

		return getElementText(By.xpath("//b[contains(text(),'Current Assignee:')]//parent::td"));

	}


	public String getTrimmedValue(String inputString) {

		String[] splittedArray = inputString.split(":");

		for (int i = 0; i < splittedArray.length; i++) {
			splittedArray[i] = splittedArray[i].trim();
		}

		return splittedArray[1];

	}

	public String getCreatedDate() {

		return getElementText(By.id("creationDate"));

	}

	// get Priority

	public String getPriority() {

		return getElementText(By.xpath("//b[contains(text(),'Priority:')]//parent::td"));
	}

	
	public String getCurrentDate() {
		LocalDate localdate = LocalDate.now();
		
		return localdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

	}

	public static boolean isDeleteDraftButtonPresent() {
		return isElementPresent(By.xpath("//a[contains(text(),'Delete Draft')]"));
	}

	public void clickOnDeleteDraft() {
		click(driver.findElement(By.xpath("//a[contains(text(),'Delete Draft')]")));
	}

	public static boolean isCopyButtonPresent() {
		return isElementPresent(By.xpath("//a[contains(text(),'Copy')]"));
	}

	public void clickOnCopyButton() {
		click(searchrequestpagelocator.getCopyButtonElement());
	}

	public void clickOnPrintButton() {
		click(searchrequestpagelocator.getPrintButtonElement());
	}

	public void switchToPrintPage()   {
		switchToThirdTab(driver);
	}


	public boolean isBoschLogoPresent() {
		
		WebElement element=driver.findElement(By.xpath("//div[@class='boschlogo']//img"));
		waitForElementToBePresent(element);
		return isElementPresent(By.xpath("//div[@class='boschlogo']//img"));
	}

	public boolean isSuspendButtonPresent() {

		return isElementPresent(By.xpath("//a[contains(text(),'Suspend')]"));
	}

	public void clickOnSuspendButton() {
		click(searchrequestpagelocator.getSuspendButtonElement());
	}


	public void clickonSearchButton() {

	}

	public void clickSearchAndHideParameters() {

	}

	public void clickOnDownloadAllResultsToExcel() {

	}

	public void clickOnNext() {

	}

	public void clickDeleteFilter() {

	}

	public void clickResetFilter() {

	}

	public void clickShowHideMoreOptions() {

	}

	public void typeSuspendReason() {

		type(searchrequestpagelocator.getSuspendReasonTextareaElement(), "Testing please ignore suspend reason");

	}

	public boolean isResumeButtonPresent() {
		return isElementPresent(By.xpath("//a[contains(text(),'Resume')]"));
	}

	public void clickOnResumeButton() {
		click(searchrequestpagelocator.getResumeButtonElement());

	}

	public void typeResumeRequestReason() {
		type(searchrequestpagelocator.getResumeReasonTextareaElement(), "Resuming the request please ignore");

	}

	public boolean isForwardButtonPresent() {
		return isElementPresent(By.xpath("//a[contains(text(),'Forward')]"));
	}

	public void clickOnForwardButton() {
		click(searchrequestpagelocator.getForwardButtonElement());

	}

	public boolean isCommentBoxPresent() {
		return isElementPresent(By.xpath("//textarea[@id='comment']"));
	}

	public void typeCommentInForwardForm(String string) {
		type(searchrequestpagelocator.getCommentBoxAfterForward(), string);

	}

	public void clickOnUserPicker() {
		click(searchrequestpagelocator.getUserpicker());

	}

	public boolean isApprovalsTabPresent() {

		WebElement element = searchrequestpagelocator.getApprovalsTab();

		WebElement element2=waitForElementToBePresent(element);


		return element2!=null;

	}

	public boolean isCommentsTabPresent() {
		WebElement element = searchrequestpagelocator.getCommentsTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isChangeHistoryTabPresent() {
		WebElement element = searchrequestpagelocator.getChangeHistoryTab();

		WebElement element2=waitForElementToBePresent(element);
		return element2!=null;
	}

	public boolean isAllTabPresent() {
		WebElement element = searchrequestpagelocator.getAllTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isPrivacyNotePresent() {
		WebElement element = searchrequestpagelocator.getPrivacyNoteTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	//
	
	public  boolean isCopyButtonPresentSecond() {
		WebElement element = searchrequestpagelocator.getCopyButtonSecond();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean iscommentButtonPresent() {
		WebElement element = searchrequestpagelocator.getCommentButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isEditButtonPresent() {
		WebElement element = searchrequestpagelocator.getEditButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isPrintButtonPresent() {
		WebElement element = searchrequestpagelocator.getPrintButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isApproveButtonPresent() {
		WebElement element = searchrequestpagelocator.getApproveButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isApproveCommentButtonPresent() {
		WebElement element = searchrequestpagelocator.getApproveWithCommentButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isRejectButtonPresent() {
		WebElement element = searchrequestpagelocator.getRejectButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isSendBackToApplicantButtonPresent() {
		WebElement element = searchrequestpagelocator.getSendBackButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isWithdrawButtonPresent() {
		WebElement element = searchrequestpagelocator.getWithdrawButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	
	
	// Tabs
	
	
	public boolean isRequestDataTabPresent() {
		WebElement element = searchrequestpagelocator.getRequestDataTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isWorkflowTabPresent() {
		WebElement element = searchrequestpagelocator.getWorkflowTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isSettingsTabPresent() {
		WebElement element = searchrequestpagelocator.getSettingsTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isTemplateTabPresent() {
		WebElement element = searchrequestpagelocator.getTemplateTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public void clickRequestDataTab() {
		
		
		click(searchrequestpagelocator.getRequestDataTab());
		
	}
	
	//this is for AP8D application
	public void clickApplicationDetailsTab() {
		
		
		click(searchrequestpagelocator.getApplicationDetailsTab());
		
	}

	public boolean isAttachmentButtonPresent() {
		WebElement element = searchrequestpagelocator.getAddAttachmentButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isManageAttachmentButtonPresent() {
		WebElement element = searchrequestpagelocator.getManageAttachmentButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isdownloadAttachmentButtonPresent() {
		WebElement element = searchrequestpagelocator.getDownloadAllAttachment();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}
	
	public boolean isSettingsButtonPresent() {
		WebElement element = searchrequestpagelocator.getSettingsButton();

		WebElement element2=waitForElementToBePresent(element);
		
		return element2!=null;
	}

	public boolean isHelpButtonPresent() {
		WebElement element = searchrequestpagelocator.getHelpButton();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isApplicationDetailsTabPresent() {
		WebElement element = searchrequestpagelocator.getApplicationDetailsTab();

		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;
	}

	public boolean isDashboardLinkPresent() {
		
		WebElement element=searchrequestpagelocator.getDashboardLinkElement();
		
		WebElement element2=waitForElementToBePresent(element);
		
		return element2!=null;

	}

	public String  dashboardLinkTargetProperty() {
	
		WebElement element=searchrequestpagelocator.getDashboardLinkElement();
		return element.getAttribute("target");
		
	}

	public String getDashboardLinkLabel() {
		
		
		WebElement element=searchrequestpagelocator.getDashboardLinkElement();
		return element.getText();
	}

	public String getDashboardLinkHref() {
		WebElement element=searchrequestpagelocator.getDashboardLinkElement();
		return element.getAttribute("href");
	}
	
	
	
	//For single request search page
	
public boolean isDashboardLinkPresentSingleRequest() {
		
		WebElement element=searchrequestpagelocator.getDashboardLinkElementSingleRequest();
		
		WebElement element2=waitForElementToBePresent(element);

		return element2!=null;

	}

	public String  dashboardLinkTargetPropertySingleRequest() {
	
		WebElement element=searchrequestpagelocator.getDashboardLinkElementSingleRequest();
		return element.getAttribute("target");
		
	}

	public String getDashboardLinkLabelSingleRequest() {
		
		
		WebElement element=searchrequestpagelocator.getDashboardLinkElementSingleRequest();
		return element.getText();
	}

	public String getDashboardLinkHrefSingleRequest() {
		WebElement element=searchrequestpagelocator.getDashboardLinkElementSingleRequest();
		return element.getAttribute("href");
	}
	

	
	
	

}
