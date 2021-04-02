package com.workon.pages.actions.apga;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.apga.APGARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class APGARequestCreation extends Page {

	private APGARequestCreationLocators apga;

	public APGARequestCreation() {

		this.apga = new APGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.apga);

	}


	public void switchToRequestCreation() {
		switchToAnyTab(driver, 2);
	}

	public void clickCheckBoxElement() {
		
	
		WebElement element=waitForElementToBePresent(apga.getCheckboxElement());
		waitForSeconds(5);
		click(apga.getCheckboxElement());

		
	}

	public void selectRGB() {

		String rgbInfo = prop.getProperty("rgbInfo");

		
		
		WebElement element2=waitForElementToBePresent(apga.getRgbElement());
		waitForSeconds(5);
		selectOption(apga.getRgbElement(), rgbInfo);
		waitForSeconds(5);

	}

	public void selectPredefinedWorkflow() {

		String predefinedWorkflow = prop.getProperty("prediendWorkflow");

		
		WebElement element2=waitForElementToBePresent(apga.getPredinedWorkflow());
		waitForSeconds(5);

		selectOption(apga.getPredinedWorkflow(), predefinedWorkflow);
		waitForSeconds(5);

	}

	public void typeBriefDecription() {
		
		

		String briefDescription = prop.getProperty("briefDescription");
		waitForSeconds(5);

		type(apga.getPredinedWorkflow(), briefDescription);
		waitForSeconds(5);

	}

	public void typeComment() {

		waitForSeconds(5);
		String comment = prop.getProperty("comment");

		type(apga.getComments(), comment);
		waitForSeconds(5);
		

	}

	public void clickApprovalGridList(String ntid) {

		boolean isPresent = isElementPresent(By.xpath("//img[@class='ApprovalListGridControlButton_Edit']"));

		if (isPresent) {

			List<WebElement> list = apga.getApprovalGridList();

			for (WebElement element : list) {
				Log.info("clicking inthe approval grid list");

				click(element);

				waitForSeconds(3);
				addApprover(ntid);

			}

		}
	}

	public void addApprover(String ntid) {

		type(apga.getEnterNtid(), ntid);
		waitForSeconds(5);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(apga.getSelectNtid());
		waitForSeconds(5);

	}

	public void clickOnApplicationDetails() {

		waitForSeconds(5);
		click(apga.getApplicationDetails());
		waitForSeconds(5);

	}

}
