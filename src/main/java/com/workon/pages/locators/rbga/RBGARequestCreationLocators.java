package com.workon.pages.locators.rbga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RBGARequestCreationLocators {

	
	@FindBy(xpath = "//label[contains(text(),'I have read and agreed the usage agreement above.')]//preceding-sibling::input[@type='checkbox']")
	private WebElement checkboxElement;
	
	@FindBy(xpath="//span[contains(text(),'Brief Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	private WebElement briefDescriptionElement;
	
	@FindBy(xpath="//span[contains(text(),'Description:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//textarea[@class='textarea']")
	private WebElement descriptionElement;
	
	@FindBy(xpath = "//button[contains(text(),'Add an approver')]")
	private List<WebElement> AddApproverBtn;

	@FindBy(css = "#NameFilterField")
	private WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;
	
	

	
	
	//=================================================================
	
	@FindBy(xpath="//a[contains(text(),'Approve')]")
	private WebElement approverBtn;
	
	
	
	
	// ================================================================

	@FindBy(xpath = "//div[@title='Close Feedback']//input[@value='x']")
	private WebElement feedbackCloseBtn;

	@FindBy(xpath = "//div[@id='btnFdBk']")
	private WebElement feedbackbtn;

	
	@FindBy(xpath = "//span[contains(text(),'Location:*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	private WebElement location;
	
	
	
	@FindBy(css="td[id='ext-gen38'] table[id='add']")
	private WebElement AddBtn;

	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-0']")
	private WebElement field;

	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-1']")
	private WebElement details;

	@FindBy(xpath = "//img[@class='DynamicGridControlButton_Delete']")
	private WebElement duplicateSelectedRowButton;

	
	@FindBy(xpath="//td[@id='wfregisterSearchList:2:action']//a[@title='Maintain the master data']")
	private WebElement masterDataElement;

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
	 * @return the briefDescriptionElement
	 */
	public WebElement getBriefDescriptionElement() {
		return briefDescriptionElement;
	}

	/**
	 * @param briefDescriptionElement the briefDescriptionElement to set
	 */
	public void setBriefDescriptionElement(WebElement briefDescriptionElement) {
		this.briefDescriptionElement = briefDescriptionElement;
	}

	/**
	 * @return the descriptionElement
	 */
	public WebElement getDescriptionElement() {
		return descriptionElement;
	}

	/**
	 * @param descriptionElement the descriptionElement to set
	 */
	public void setDescriptionElement(WebElement descriptionElement) {
		this.descriptionElement = descriptionElement;
	}

	/**
	 * @return the addApproverBtn
	 */
	public List<WebElement> getAddApproverBtn() {
		return AddApproverBtn;
	}

	/**
	 * @param addApproverBtn the addApproverBtn to set
	 */
	public void setAddApproverBtn(List<WebElement> addApproverBtn) {
		AddApproverBtn = addApproverBtn;
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
	 * @return the approverBtn
	 */
	public WebElement getApproverBtn() {
		return approverBtn;
	}

	/**
	 * @param approverBtn the approverBtn to set
	 */
	public void setApproverBtn(WebElement approverBtn) {
		this.approverBtn = approverBtn;
	}

	/**
	 * @return the feedbackCloseBtn
	 */
	public WebElement getFeedbackCloseBtn() {
		return feedbackCloseBtn;
	}

	/**
	 * @param feedbackCloseBtn the feedbackCloseBtn to set
	 */
	public void setFeedbackCloseBtn(WebElement feedbackCloseBtn) {
		this.feedbackCloseBtn = feedbackCloseBtn;
	}

	/**
	 * @return the addBtn
	 */
	public WebElement getAddBtn() {
		return AddBtn;
	}

	/**
	 * @param addBtn the addBtn to set
	 */
	public void setAddBtn(WebElement addBtn) {
		AddBtn = addBtn;
	}

	/**
	 * @return the field
	 */
	public WebElement getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(WebElement field) {
		this.field = field;
	}

	/**
	 * @return the details
	 */
	public WebElement getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(WebElement details) {
		this.details = details;
	}

	/**
	 * @return the duplicateSelectedRowButton
	 */
	public WebElement getDuplicateSelectedRowButton() {
		return duplicateSelectedRowButton;
	}

	/**
	 * @param duplicateSelectedRowButton the duplicateSelectedRowButton to set
	 */
	public void setDuplicateSelectedRowButton(WebElement duplicateSelectedRowButton) {
		this.duplicateSelectedRowButton = duplicateSelectedRowButton;
	}

	/**
	 * @return the feedbackbtn
	 */
	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}

	/**
	 * @param feedbackbtn the feedbackbtn to set
	 */
	public void setFeedbackbtn(WebElement feedbackbtn) {
		this.feedbackbtn = feedbackbtn;
	}

	/**
	 * @return the location
	 */
	public WebElement getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(WebElement location) {
		this.location = location;
	}

	/**
	 * @return the masterDataElement
	 */
	public WebElement getMasterDataElement() {
		return masterDataElement;
	}

	/**
	 * @param masterDataElement the masterDataElement to set
	 */
	public void setMasterDataElement(WebElement masterDataElement) {
		this.masterDataElement = masterDataElement;
	}


	

}
