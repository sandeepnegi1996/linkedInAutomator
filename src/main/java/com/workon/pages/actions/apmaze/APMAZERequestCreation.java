package com.workon.pages.actions.apmaze;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.apmaze.APMAZERequestCreationLocators;

public class APMAZERequestCreation extends Page {

	private APMAZERequestCreationLocators apmazeRequestCreationLocators;

	public APMAZERequestCreation() {
		this.apmazeRequestCreationLocators = new APMAZERequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.apmazeRequestCreationLocators);

	}

	
	public void switchtoRequestCreationTab() {
		switchToAnyTab(driver, 2);
	}

	public void clickRequestDataElement() {
		
		click(apmazeRequestCreationLocators.getRequestDataElement());

	}

	public void typeSubject() {
		String subject= prop.getProperty("subject");
		
		
		type(apmazeRequestCreationLocators.getSubjectElement(),subject);

	}

	public void typeSummary() {
		String summary= prop.getProperty("summary");
		type(apmazeRequestCreationLocators.getSummary(), summary);
	}

	public void typePhoneNumber() {
		String phoneNumber= prop.getProperty("phoneNumber");
		type(apmazeRequestCreationLocators.getPhoneNumber(),phoneNumber);

	}

	public void typePartName() {
		String partName= prop.getProperty("partName");
		type(apmazeRequestCreationLocators.getPartName(),partName);

	}

	public void selectPriority() {
		String priorityDropdown= prop.getProperty("priorityDropdown");
		selectOption(apmazeRequestCreationLocators.getPriorityDropDown(),priorityDropdown);

	}

	public void selectRBTAElement() {
		String rbtaElement= prop.getProperty("rbtaElement");
		selectOption(apmazeRequestCreationLocators.getRbtaElement(),rbtaElement);

	}

	public void typeBusinessEntry() {
		String business= prop.getProperty("business");
		type(apmazeRequestCreationLocators.getBusiness(),business);
	}

	public void typeProcessName() {
		String process= prop.getProperty("process");
		type(apmazeRequestCreationLocators.getProcess(),process);

	}

	public void typeMachineName() {
		String machine= prop.getProperty("machine");
		type(apmazeRequestCreationLocators.getMachine(),machine);

	}

	public void typeMaximumStock() {
		String maximumStock= prop.getProperty("maximumStock");
		type(apmazeRequestCreationLocators.getMaximumStock(),maximumStock);

	}

	public void typeReorderPoint() {
		String reorderPoint= prop.getProperty("reorderPoint");
		type(apmazeRequestCreationLocators.getReorderPoint(),reorderPoint);

	}

	public void typeDescription() {
		String description= prop.getProperty("description");
		type(apmazeRequestCreationLocators.getDescription(),description);

	}

	public void typeReason() {
		String reason= prop.getProperty("reason");
		type(apmazeRequestCreationLocators.getReason(),reason);

	}

	public void typeDelivery() {
		String delivery= prop.getProperty("delivery");
		type(apmazeRequestCreationLocators.getDelivery(),delivery);

	}

	public void typeDesciptionTextArea() {
		String descriptionTextArea= prop.getProperty("descriptionTextArea");
		type(apmazeRequestCreationLocators.getDescriptionTextArea(),descriptionTextArea);

	}

	// click on the workflow tab

	public void clickEditApproval() {
		click(apmazeRequestCreationLocators.getEditPosition());

	}

	public void addApprover(String ntid) {
		
		
		type(apmazeRequestCreationLocators.getEnterNTid(),ntid);

		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		
		click(apmazeRequestCreationLocators.getSelectNTIDApmazeXPath());

	}

	public void displayRequestKeyApmaze() {
		
		click(apmazeRequestCreationLocators.getApmazeRequestKeyElement());
		
	}

}
