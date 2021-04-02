package com.workon.pages.locators.apmaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class APMAZERequestCreationLocators {
	
	@FindBy(xpath="//a[contains(text(),'Request Data')]")
	private WebElement requestDataElement;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Subject')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	private WebElement subjectElement;
	
	@FindBy(xpath="//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement summary;
	
	
	@FindBy(xpath="//span[contains(text(),'Phone')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	private WebElement phoneNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Part Name *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement partName;
	
	@FindBy(xpath="//label[contains(text(),'Priority')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	private WebElement priorityDropDown;
	
	@FindBy(xpath="//div[@class='rb_WorkON_FieldContainer']//div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create rb_WorkON_ValueArea_Wide']//select")
	private WebElement rbtaElement;
	
	@FindBy(xpath="//label[contains(text(),'Business')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement business;
	
	
	@FindBy(xpath="//label[contains(text(),'Line or Process *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement process;
	
	
	@FindBy(xpath="//label[contains(text(),'Machine Name *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement machine;
	
	
	@FindBy(xpath="//label[contains(text(),'Maximum Stock *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement maximumStock;
	
	
	@FindBy(xpath="//label[contains(text(),'Reorder point *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement reorderPoint;
	
	@FindBy(xpath="//label[contains(text(),'Description (Brand,Models) *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	private WebElement description;
	
	@FindBy(xpath="//label[contains(text(),'Reason (M-FMEA) *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement reason;
	
	@FindBy(xpath="//label[contains(text(),'Delivery Time *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement delivery;
	
	
	@FindBy(xpath="//label[contains(text(),'Description / Remarks')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	private WebElement descriptionTextArea;
	
	
	@FindBy(xpath="//img[@class='ApprovalListGridControlButton_Edit']")
	private WebElement editPosition;
	
	@FindBy(xpath="//input[@id='NameFilterField']")
	private WebElement enterNTid;
	
	@FindBy(xpath="//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-name x-grid3-cell-first')]")
	private WebElement selectNTIDApmazeXPath;


	@FindBy(xpath="//b[normalize-space()='Key:']")
	private WebElement apmazeRequestKeyElement;

	/**
	 * @return the requestDataElement
	 */
	public WebElement getRequestDataElement() {
		return requestDataElement;
	}

	/**
	 * @param requestDataElement the requestDataElement to set
	 */
	public void setRequestDataElement(WebElement requestDataElement) {
		this.requestDataElement = requestDataElement;
	}

	/**
	 * @return the subjectElement
	 */
	public WebElement getSubjectElement() {
		return subjectElement;
	}

	/**
	 * @param subjectElement the subjectElement to set
	 */
	public void setSubjectElement(WebElement subjectElement) {
		this.subjectElement = subjectElement;
	}

	/**
	 * @return the summary
	 */
	public WebElement getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(WebElement summary) {
		this.summary = summary;
	}

	/**
	 * @return the phoneNumber
	 */
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the partName
	 */
	public WebElement getPartName() {
		return partName;
	}

	/**
	 * @param partName the partName to set
	 */
	public void setPartName(WebElement partName) {
		this.partName = partName;
	}

	/**
	 * @return the priorityDropDown
	 */
	public WebElement getPriorityDropDown() {
		return priorityDropDown;
	}

	/**
	 * @param priorityDropDown the priorityDropDown to set
	 */
	public void setPriorityDropDown(WebElement priorityDropDown) {
		this.priorityDropDown = priorityDropDown;
	}

	/**
	 * @return the rbtaElement
	 */
	public WebElement getRbtaElement() {
		return rbtaElement;
	}

	/**
	 * @param rbtaElement the rbtaElement to set
	 */
	public void setRbtaElement(WebElement rbtaElement) {
		this.rbtaElement = rbtaElement;
	}

	/**
	 * @return the business
	 */
	public WebElement getBusiness() {
		return business;
	}

	/**
	 * @param business the business to set
	 */
	public void setBusiness(WebElement business) {
		this.business = business;
	}

	/**
	 * @return the process
	 */
	public WebElement getProcess() {
		return process;
	}

	/**
	 * @param process the process to set
	 */
	public void setProcess(WebElement process) {
		this.process = process;
	}

	/**
	 * @return the machine
	 */
	public WebElement getMachine() {
		return machine;
	}

	/**
	 * @param machine the machine to set
	 */
	public void setMachine(WebElement machine) {
		this.machine = machine;
	}

	/**
	 * @return the maximumStock
	 */
	public WebElement getMaximumStock() {
		return maximumStock;
	}

	/**
	 * @param maximumStock the maximumStock to set
	 */
	public void setMaximumStock(WebElement maximumStock) {
		this.maximumStock = maximumStock;
	}

	/**
	 * @return the reorderPoint
	 */
	public WebElement getReorderPoint() {
		return reorderPoint;
	}

	/**
	 * @param reorderPoint the reorderPoint to set
	 */
	public void setReorderPoint(WebElement reorderPoint) {
		this.reorderPoint = reorderPoint;
	}

	/**
	 * @return the description
	 */
	public WebElement getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(WebElement description) {
		this.description = description;
	}

	/**
	 * @return the reason
	 */
	public WebElement getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(WebElement reason) {
		this.reason = reason;
	}

	/**
	 * @return the delivery
	 */
	public WebElement getDelivery() {
		return delivery;
	}

	/**
	 * @param delivery the delivery to set
	 */
	public void setDelivery(WebElement delivery) {
		this.delivery = delivery;
	}

	/**
	 * @return the descriptionTextArea
	 */
	public WebElement getDescriptionTextArea() {
		return descriptionTextArea;
	}

	/**
	 * @param descriptionTextArea the descriptionTextArea to set
	 */
	public void setDescriptionTextArea(WebElement descriptionTextArea) {
		this.descriptionTextArea = descriptionTextArea;
	}

	/**
	 * @return the editPosition
	 */
	public WebElement getEditPosition() {
		return editPosition;
	}

	/**
	 * @param editPosition the editPosition to set
	 */
	public void setEditPosition(WebElement editPosition) {
		this.editPosition = editPosition;
	}

	/**
	 * @return the enterNTid
	 */
	public WebElement getEnterNTid() {
		return enterNTid;
	}

	/**
	 * @param enterNTid the enterNTid to set
	 */
	public void setEnterNTid(WebElement enterNTid) {
		this.enterNTid = enterNTid;
	}

	/**
	 * @return the selectNTIDApmazeXPath
	 */
	public WebElement getSelectNTIDApmazeXPath() {
		return selectNTIDApmazeXPath;
	}

	/**
	 * @param selectNTIDApmazeXPath the selectNTIDApmazeXPath to set
	 */
	public void setSelectNTIDApmazeXPath(WebElement selectNTIDApmazeXPath) {
		this.selectNTIDApmazeXPath = selectNTIDApmazeXPath;
	}

	/**
	 * @return the apmazeRequestKeyElement
	 */
	public WebElement getApmazeRequestKeyElement() {
		return apmazeRequestKeyElement;
	}

	/**
	 * @param apmazeRequestKeyElement the apmazeRequestKeyElement to set
	 */
	public void setApmazeRequestKeyElement(WebElement apmazeRequestKeyElement) {
		this.apmazeRequestKeyElement = apmazeRequestKeyElement;
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
