package com.workon.pages.actions.cnterm;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;

import com.workon.pages.locators.cnterm.CNTERMRequestCreationLocators;

public class CNTERMRequestCreation extends Page {

	

	private CNTERMRequestCreationLocators cnterm;

	public CNTERMRequestCreation() {

		this.cnterm = new CNTERMRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.cnterm);

	}

	public void switchToRbgaRequestCreation()  {
		switchToAnyTab(driver, 2);
	}
	
	//fill the personnel number
	public void enterPersonnelNumber() {
		
		type(cnterm.getPersonnelNumber(),"Testing number");
	}
	
	//fill the employee number 
	public void enterEmployeeName() {
		
		type(cnterm.getEmployeeName(),"Testing name");
		
		
	}

	public void switchToCNTERMRequestCreation() {
		switchToAnyTab(driver,2);
		
	}
	
	
	//gotoworkflow
	
	
	
	
	
}
