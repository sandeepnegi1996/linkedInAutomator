package com.workon.pages.locators.apga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class APGARequestCreationLocators {

	@FindBy(xpath = "//label[contains(.,'I have read and agreed the usage agreement above.')]//preceding-sibling::input")
	private WebElement checkboxElement;
	
	
	@FindBy(xpath="//span[contains(text(),'RGB:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select")
	private WebElement rgbElement;
	
	@FindBy(xpath="//span[contains(text(),'Predefined Workflow:*')]//parent::label[contains(@class,'rb_WorkON_LabelArea')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//select")
	private WebElement predinedWorkflow;


	@FindBy(xpath="//label[contains(text(),'Brief Description:*')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input[@type='text']")
	private WebElement briefDescription;


	@FindBy(xpath="//span[contains(text(),'Comments:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//textarea")
	private WebElement comments;
	
	
	@FindBy(xpath="//img[@class='ApprovalListGridControlButton_Edit']")
	private List<WebElement> approvalGridList;
	
	@FindBy(css = "#NameFilterField")
	private WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;
	
	
	@FindBy(xpath="//a[contains(text(),'Application Details')]")
	private WebElement applicationDetails;


	/**
	 * @return the checkboxElement
	 */
	public WebElement getCheckboxElement() {
		return checkboxElement;
	}


	/**
	 * @param checkboxElement the checkboxElement to set
	 */
	public void setCheckboxElement(WebElement checkboxElement) {
		this.checkboxElement = checkboxElement;
	}


	/**
	 * @return the rgbElement
	 */
	public WebElement getRgbElement() {
		return rgbElement;
	}


	/**
	 * @param rgbElement the rgbElement to set
	 */
	public void setRgbElement(WebElement rgbElement) {
		this.rgbElement = rgbElement;
	}


	/**
	 * @return the predinedWorkflow
	 */
	public WebElement getPredinedWorkflow() {
		return predinedWorkflow;
	}


	/**
	 * @param predinedWorkflow the predinedWorkflow to set
	 */
	public void setPredinedWorkflow(WebElement predinedWorkflow) {
		this.predinedWorkflow = predinedWorkflow;
	}


	/**
	 * @return the briefDescription
	 */
	public WebElement getBriefDescription() {
		return briefDescription;
	}


	/**
	 * @param briefDescription the briefDescription to set
	 */
	public void setBriefDescription(WebElement briefDescription) {
		this.briefDescription = briefDescription;
	}


	/**
	 * @return the comments
	 */
	public WebElement getComments() {
		return comments;
	}


	/**
	 * @param comments the comments to set
	 */
	public void setComments(WebElement comments) {
		this.comments = comments;
	}


	/**
	 * @return the approvalGridList
	 */
	public List<WebElement> getApprovalGridList() {
		return approvalGridList;
	}


	/**
	 * @param approvalGridList the approvalGridList to set
	 */
	public void setApprovalGridList(List<WebElement> approvalGridList) {
		this.approvalGridList = approvalGridList;
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
	 * @return the applicationDetails
	 */
	public WebElement getApplicationDetails() {
		return applicationDetails;
	}


	/**
	 * @param applicationDetails the applicationDetails to set
	 */
	public void setApplicationDetails(WebElement applicationDetails) {
		this.applicationDetails = applicationDetails;
	}
}

