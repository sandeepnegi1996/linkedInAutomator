package com.workon.pages.actions.rbubkpa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.rbubkpa.RBUBKPARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class RBUBKPA_RequestCreation extends Page {

	private  RBUBKPARequestCreationLocators rbubkpa;

	public RBUBKPA_RequestCreation() {
		this.rbubkpa = new RBUBKPARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.rbubkpa);

	}


	public void switchToRBUBKPARequestCreation() {
		switchToAnyTab(driver, 2);
	}

	public void typeSubject() {
		String subject=prop.getProperty("subject");
		type(rbubkpa.getSubject(),subject);
	}

	public void typeSummary() {
		String summary=prop.getProperty("summary");
		type(rbubkpa.getSummary(),summary);
	}

	public void clickOnResposibleBuyer() {
		
		boolean isPresent=Page.isElementPresent(By.xpath("//label[contains(text(),'Responsible buyer identical with applicant?')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//table[@class='workonstdtable']//tbody//tr//td//input[@type='checkbox']"));
		
		if(isPresent) {
			click(rbubkpa.getResponsibleBuyer());
		}
		
	}

	public void typePhoneNumber() {
		String phoneNumber=prop.getProperty("phoneNumber");
		type(rbubkpa.getPhoneNumber(),phoneNumber);
	}

	public void typeBuyersCode() {
		String buyersCode=prop.getProperty("buyersCode");
		type(rbubkpa.getBuyersCode(),buyersCode);

	}

	public void selectGroup() {
		String groupRBUBKPA=prop.getProperty("groupRBUBKPA");
		
		
		boolean isPresent=Page.isElementPresent(By.xpath("//label[contains(text(),'Group*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select"));
		
		if(isPresent) {
			selectOption(rbubkpa.getGroup(),groupRBUBKPA);
		}
		
		
		
	}

	public void selectPurchasingApprovalType() {
		
		String purchasingApprovalTypeRbubkpa=prop.getProperty("purchasingApprovalTypeRbubkpa");
		
		boolean isPresent=Page.isElementPresent(By.xpath("//label[contains(text(),'Purchasing Approval type*')]//parent::div[@class='rb_WorkON_FieldContainer']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ')]//select"));
		
		if(isPresent) {
			selectOption(rbubkpa.getPurchasingApprovaType(),purchasingApprovalTypeRbubkpa);
			
		}
		
	}

	public void typePartNumber() {
		String partNumber=prop.getProperty("partNumber");
		type(rbubkpa.getPartNumber(),partNumber);
	}

	public void typePlantSpecificVendorCode() {
		String plantSpecificVendor=prop.getProperty("plantSpecificVendor");
		type(rbubkpa.getPlantSpecificVendorCode(),plantSpecificVendor);

	}

	public void deletingApproverList() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		for (WebElement element : rbubkpa.getDeleteApprovalBtn()) {
			List<WebElement> unselectableDiv2 = driver
					.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-6']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			String scriptSetAttr = "arguments[0].setAttribute(arguments[1],arguments[2])";

			js.executeScript(scriptSetAttr, unselectableDiv2.get(0), "unselectable", "off");

			Log.info(" *****   check value of Div property " + unselectableDiv2.get(0).getAttribute("unselectable"));

			click(rbubkpa.getDeleteApprovalBtn().get(0));

			Log.info("DELETE BUTTON IS CLICKED");

			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

			Log.info(" ******   Deleting the existing Approvers in the list *******");

		}

	}


	public void clickFirstAddApproverButton() {

		WebElement firstAddApproverBtn = rbubkpa.getApproverBtn().get(0);
		click(firstAddApproverBtn);

	}

	public void addApprover(String ntid) {

		type(rbubkpa.getEnterNtid(), ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(rbubkpa.getSelectNtid());

	}

}
