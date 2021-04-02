package com.workon.pages.locators.ap8d;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AP8DRequestCreationLocators {

	
	@FindBy(xpath = "//a[contains(text(),'Application Details')]")
	private WebElement applicationDetailsElement;
	
	
	
	@FindBy(xpath = "//span[contains(text(),'8d Report Number*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	private WebElement reportNumber;
	
	
	@FindBy(xpath = "//span[contains(text(),'Approval For*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	private WebElement internalElement;
	
	
	@FindBy(xpath = "//label[contains(text(),'Comments*')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//textarea")
	private WebElement commentElment;


	@FindBy(xpath="//a[text()='workflow']")
	private WebElement workflowTabElement;	
	
	@FindBy(xpath = "//button[contains(text(),'Add an approver')]")
	private WebElement addApproverBtn;

	@FindBy(css = "#NameFilterField")
	private WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;

	
	//getters and setters for each of the private field --> applicationDetailsElement
	public WebElement getApplicationDetailsElement() {
		return applicationDetailsElement;
	}

	public void setApplicationDetailsElement(WebElement applicationDetailsElement) {
		this.applicationDetailsElement = applicationDetailsElement;
	}
	
	
	@FindBy(xpath="//td[@id='wfregisterSearchList:1:action']//a[@title='Maintain the master data']")
	private WebElement masterDataElementAp8d;
	
	//getters and setters for the reportNumber
	
	public WebElement getReportNumber() {
		return reportNumber;
	}
	
	public void setReportNumber(WebElement reportNumber) {
		this.reportNumber=reportNumber;
	}

	public WebElement getInternalElement() {
		return internalElement;
	}

	public void setInternalElement(WebElement internalElement) {
		this.internalElement = internalElement;
	}

	public WebElement getCommentElment() {
		return commentElment;
	}

	public void setCommentElment(WebElement commentElment) {
		this.commentElment = commentElment;
	}

	/**
	 * @return the workflowTabElement
	 */
	public WebElement getWorkflowTabElement() {
		return workflowTabElement;
	}

	/**
	 * @param workflowTabElement the workflowTabElement to set
	 */
	public void setWorkflowTabElement(WebElement workflowTabElement) {
		this.workflowTabElement = workflowTabElement;
	}

	/**
	 * @return the addApproverBtn
	 */
	public WebElement getAddApproverBtn() {
		return addApproverBtn;
	}

	/**
	 * @param addApproverBtn the addApproverBtn to set
	 */
	public void setAddApproverBtn(WebElement addApproverBtn) {
		this.addApproverBtn = addApproverBtn;
	}

	/**
	 * @return the enterNtid
	 */
	public WebElement getEnterNtid() {
		return enterNtid;
	}

	/**
	 * @param enterNtid the enterNtid to set
	 */
	public void setEnterNtid(WebElement enterNtid) {
		this.enterNtid = enterNtid;
	}

	/**
	 * @return the selectNtid
	 */
	public WebElement getSelectNtid() {
		return selectNtid;
	}

	/**
	 * @param selectNtid the selectNtid to set
	 */
	public void setSelectNtid(WebElement selectNtid) {
		this.selectNtid = selectNtid;
	}

	/**
	 * @return the masterDataElementAp8d
	 */
	public WebElement getMasterDataElementAp8d() {
		return masterDataElementAp8d;
	}

	/**
	 * @param masterDataElementAp8d the masterDataElementAp8d to set
	 */
	public void setMasterDataElementAp8d(WebElement masterDataElementAp8d) {
		this.masterDataElementAp8d = masterDataElementAp8d;
	}

	
	
	



}
