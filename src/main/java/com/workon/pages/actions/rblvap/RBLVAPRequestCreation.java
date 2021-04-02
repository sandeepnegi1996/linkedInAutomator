package com.workon.pages.actions.rblvap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.rblvap.RBLVAPRequestCreationLocators;

public class RBLVAPRequestCreation extends Page{

	private RBLVAPRequestCreationLocators rblvap;

	public RBLVAPRequestCreation() {

		this.rblvap = new RBLVAPRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.rblvap);

	}
	public void switchToRblvapRequestCreation() {

		switchToAnyTab(driver, 2);
	}
	
	public void typeSubject() {
		type(rblvap.getSubjectElement(), "Testing subject is working");

	}
	
	public void selectOrganizationalArea() {
		
		selectOption(rblvap.getOrganizationArea(),"DC");
	}
	public void clickOnDuplicateSelectedRowButton() {
		click(rblvap.getDuplicateSelectedRowElement());
	}
	public void typeReasonForAbsence() {
		
		type(rblvap.getReasonForAbsenceElement(),"Medical examination day");
	}
	
	

}
