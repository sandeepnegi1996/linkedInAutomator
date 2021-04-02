package com.workon.pages.locators.rbubkpa;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RBUBKPARequestCreationLocators {
	
	

	@FindBy(xpath="//span[contains(text(),' Subject *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input[@type='text']")
	private WebElement subject;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement summary;
	

	@FindBy(xpath="//label[contains(text(),'Responsible buyer identical with applicant?')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//table[@class='workonstdtable']//tbody//tr//td//input[@type='checkbox']")
	private WebElement responsibleBuyer;
	
	
	

	@FindBy(xpath="//label[contains(text(),'Phone *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement phoneNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Buyer Code*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement buyersCode;
	
	
	@FindBy(xpath="//label[contains(text(),'Group*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	private WebElement group;
	
	
	@FindBy(xpath="//label[contains(text(),'Purchasing Approval type*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	private WebElement purchasingApprovaType;
	
	
	@FindBy(xpath="//label[contains(text(),'Material Group')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	private WebElement materialGroup;
	
	
	@FindBy(xpath="//label[contains(text(),'Part Number*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	private WebElement partNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Plant specific vendor Code*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea[@class='textarea']")
	private WebElement plantSpecificVendorCode;
	
	
	
	@FindBy(xpath = "//td//div//span//img[@class='ApprovalListGridControlButton_Delete']")
	private List<WebElement> deleteApprovalBtn;
	
	@FindBy(xpath="//button[contains(text(),'Add an approver')]")
	private  List<WebElement> approverBtn;
	
	
	@FindBy(css="#NameFilterField")
	private WebElement enterNtid;
	
	@FindBy(xpath="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;

	/**
	 * @return the subject
	 */
	public WebElement getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(WebElement subject) {
		this.subject = subject;
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
	 * @return the responsibleBuyer
	 */
	public WebElement getResponsibleBuyer() {
		return responsibleBuyer;
	}

	/**
	 * @param responsibleBuyer the responsibleBuyer to set
	 */
	public void setResponsibleBuyer(WebElement responsibleBuyer) {
		this.responsibleBuyer = responsibleBuyer;
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
	 * @return the buyersCode
	 */
	public WebElement getBuyersCode() {
		return buyersCode;
	}

	/**
	 * @param buyersCode the buyersCode to set
	 */
	public void setBuyersCode(WebElement buyersCode) {
		this.buyersCode = buyersCode;
	}

	/**
	 * @return the group
	 */
	public WebElement getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(WebElement group) {
		this.group = group;
	}

	/**
	 * @return the purchasingApprovaType
	 */
	public WebElement getPurchasingApprovaType() {
		return purchasingApprovaType;
	}

	/**
	 * @param purchasingApprovaType the purchasingApprovaType to set
	 */
	public void setPurchasingApprovaType(WebElement purchasingApprovaType) {
		this.purchasingApprovaType = purchasingApprovaType;
	}

	/**
	 * @return the partNumber
	 */
	public WebElement getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(WebElement partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the plantSpecificVendorCode
	 */
	public WebElement getPlantSpecificVendorCode() {
		return plantSpecificVendorCode;
	}

	/**
	 * @param plantSpecificVendorCode the plantSpecificVendorCode to set
	 */
	public void setPlantSpecificVendorCode(WebElement plantSpecificVendorCode) {
		this.plantSpecificVendorCode = plantSpecificVendorCode;
	}

	/**
	 * @return the deleteApprovalBtn
	 */
	public List<WebElement> getDeleteApprovalBtn() {
		return deleteApprovalBtn;
	}

	/**
	 * @param deleteApprovalBtn the deleteApprovalBtn to set
	 */
	public void setDeleteApprovalBtn(List<WebElement> deleteApprovalBtn) {
		this.deleteApprovalBtn = deleteApprovalBtn;
	}

	/**
	 * @return the approverBtn
	 */
	public List<WebElement> getApproverBtn() {
		return approverBtn;
	}

	/**
	 * @param approverBtn the approverBtn to set
	 */
	public void setApproverBtn(List<WebElement> approverBtn) {
		this.approverBtn = approverBtn;
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
	

	
	
	
	
	
}
