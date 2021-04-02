package com.workon.pages.locators.stga;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class STGARequestCreationLocators {

	@FindBy(xpath = "//a[contains(text(),'Request Data')]")
	private WebElement requestDataElement;

	@FindBy(xpath = "//label[contains(text(),'Subject')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement subjectElement;

	@FindBy(xpath = "//label[contains(text(),'Summary')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//input[@type='text']")
	private WebElement summary;

	@FindBy(xpath = "//span[contains(text(),'Process *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
	private WebElement process;

	@FindBy(xpath = "//label[contains(text(),'Subprocess *')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select")
	private WebElement subprocess;

	@FindBy(xpath = "//span[contains(text(),'Topic *')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
	private WebElement topic;

	@FindBy(xpath = "//label[contains(text(),'Description / Notes')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//textarea")
	private WebElement description;

	@FindBy(xpath = "//img[contains(@class,'DynamicGridControlButton_Delete')]//parent::a")
	private List<WebElement> deleteAdditionalFieldsBtn;

	@FindBy(xpath = "//td//div//span//img[@class='ApprovalListGridControlButton_Delete']")
	private List<WebElement> deleteApprovalBtn;

	@FindBy(xpath = "//button[contains(text(),'Add an approver')]")
	private List<WebElement> approverBtn;

	@FindBy(css = "#NameFilterField")
	private WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;

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
	 * @return the subprocess
	 */
	public WebElement getSubprocess() {
		return subprocess;
	}

	/**
	 * @param subprocess the subprocess to set
	 */
	public void setSubprocess(WebElement subprocess) {
		this.subprocess = subprocess;
	}

	/**
	 * @return the topic
	 */
	public WebElement getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(WebElement topic) {
		this.topic = topic;
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
	 * @return the deleteAdditionalFieldsBtn
	 */
	public List<WebElement> getDeleteAdditionalFieldsBtn() {
		return deleteAdditionalFieldsBtn;
	}

	/**
	 * @param deleteAdditionalFieldsBtn the deleteAdditionalFieldsBtn to set
	 */
	public void setDeleteAdditionalFieldsBtn(List<WebElement> deleteAdditionalFieldsBtn) {
		this.deleteAdditionalFieldsBtn = deleteAdditionalFieldsBtn;
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
