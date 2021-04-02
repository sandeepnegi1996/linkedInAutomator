package com.workon.pages.locators.rblvap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RBLVAPRequestCreationLocators {
	
	@FindBy(xpath="//input[@id='customfield_16554']")
	private WebElement subjectElement;
	
	
	
	
	@FindBy(xpath="//select[@id='customfield_11903']")
	private WebElement organizationArea;



	@FindBy(xpath="//button[normalize-space()='Duplicate selected row']")
	private WebElement duplicateSelectedRowElement;



	@FindBy(xpath="//input[@id='ext-comp-1011']")
	private WebElement reasonForAbsenceElement;
	
	
	

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
	 * @return the organizationArea
	 */
	public WebElement getOrganizationArea() {
		return organizationArea;
	}

	/**
	 * @param organizationArea the organizationArea to set
	 */
	public void setOrganizationArea(WebElement organizationArea) {
		this.organizationArea = organizationArea;
	}

	/**
	 * @return the duplicateSelectedRowElement
	 */
	public WebElement getDuplicateSelectedRowElement() {
		return duplicateSelectedRowElement;
	}

	/**
	 * @param duplicateSelectedRowElement the duplicateSelectedRowElement to set
	 */
	public void setDuplicateSelectedRowElement(WebElement duplicateSelectedRowElement) {
		this.duplicateSelectedRowElement = duplicateSelectedRowElement;
	}

	/**
	 * @return the reasonForAbsenceElement
	 */
	public WebElement getReasonForAbsenceElement() {
		return reasonForAbsenceElement;
	}

	/**
	 * @param reasonForAbsenceElement the reasonForAbsenceElement to set
	 */
	public void setReasonForAbsenceElement(WebElement reasonForAbsenceElement) {
		this.reasonForAbsenceElement = reasonForAbsenceElement;
	}

}
