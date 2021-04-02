package com.workon.pages.actions.emeaavg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.emeaavg.EMEAAVGRequestCreationLocators;

public class EMEAAVGRequestCreation extends Page {

	private EMEAAVGRequestCreationLocators emeaavg;

	public EMEAAVGRequestCreation() {

		this.emeaavg = new EMEAAVGRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.emeaavg);

	}

	public void switchToRequestCreationTab() {
		switchToAnyTab(driver,2);

	}

	public void typeReason() {
		String adminAcess = prop.getProperty("adminAcess");
		type(emeaavg.getReasonAdminAcess(),adminAcess);
	}

	public void selectOptionHana() {
		String hanaOption = prop.getProperty("hanaOption");
		selectOption(emeaavg.getSystemTypeOption(),hanaOption);
	}

	public void selectOptionEmea() {
		String emeaOption = prop.getProperty("emeaOption");
		selectOption(emeaavg.getRegionOption(),emeaOption);
	}

	public void selectRequestOptionAdd() {
		String addOption = prop.getProperty("addOption");
		selectOption(emeaavg.getTypeOfRequestOption(),addOption);
	}

	public void typeSystemName() {
		String systemName = prop.getProperty("systemName");
		type(emeaavg.getSystemName(),systemName);
	}

	public void typeDomainName() {
		String domain = prop.getProperty("domain");
		type(emeaavg.getDomainAccountName(),domain);

	}
	// click on the workflow tab

	public void addDepartmentManagerCost() {
		// add the department manager approval
		// from the list choose the first item

		click(emeaavg.getDepartmentManagerCost().get(0));

		// add the approver

		type(emeaavg.getEnterNtid(), "workontester1");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		
		click(emeaavg.getSelectNtid());
	}

	public void addDepartmentManagerCostSecond() {
		// Adding the CI/OSB5
		// choose third one

		click(emeaavg.getDepartmentManagerCost().get(2));

		type(emeaavg.getEnterNtid(), "workontester1");
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(emeaavg.getSelectNtid());

	}

	public void clearApprovalList() {
		// clear the approval list fourth since there are other buttons to

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click(emeaavg.getClearApprovalList().get(3));

		// deleting the approver
		click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

	}

	public void addApprover(String ntid) {
		// add the new approver

		click(emeaavg.getApproverBtn().get(3));

		type(emeaavg.getEnterNtid(), ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(emeaavg.getSelectNtid());
	}

}
