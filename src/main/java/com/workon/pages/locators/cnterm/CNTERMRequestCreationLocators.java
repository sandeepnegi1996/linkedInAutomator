package com.workon.pages.locators.cnterm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNTERMRequestCreationLocators {

	
	
	@FindBy(xpath="//label[contains(text(),'Personnel Number')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	private WebElement personnelNumber;
	
	
	@FindBy(xpath="//label[contains(text(),'Employee Name')]//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	private WebElement employeeName;


	/**
	 * @return the personnelNumber
	 */
	public WebElement getPersonnelNumber() {
		return personnelNumber;
	}


	/**
	 * @param personnelNumber the personnelNumber to set
	 */
	public void setPersonnelNumber(WebElement personnelNumber) {
		this.personnelNumber = personnelNumber;
	}


	/**
	 * @return the employeeName
	 */
	public WebElement getEmployeeName() {
		return employeeName;
	}


	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(WebElement employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
}
