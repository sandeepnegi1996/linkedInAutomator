package com.workon.pages.actions.ap8d;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.ap8d.AP8DRequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class AP8DRequestCreation extends Page {
	
	private AP8DRequestCreationLocators ap8d;

	public AP8DRequestCreation() {

		this.ap8d = new AP8DRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.ap8d);

	}

	public void switchToRbgaRequestCreation() throws InterruptedException {
		switchToAnyTab(driver, 2);
	}

	public void clickOnApplicationDetails() {
		click(ap8d.getApplicationDetailsElement());
	}

	public void type8dReportNumber() {
		String reportNum = prop.getProperty("reportNum");
		type(ap8d.getReportNumber(), reportNum);
	}

	// Approval for
	public void selectAddApprovalForInternal() {
		String internalElementOption = prop.getProperty("internalElementOption");
		selectOption(ap8d.getInternalElement(), internalElementOption);
	}

	public void typeComment() {
		String comment = prop.getProperty("comment");
		type(ap8d.getCommentElment(), comment);
	}

	@Override
	public void clickOnWorkflowTab() {

		click(ap8d.getWorkflowTabElement());
	}

	public void clickAdd_anApprover() {

		click(ap8d.getAddApproverBtn());
	}

	public void addApprover(String ntid) {

		type(ap8d.getEnterNtid(), ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(ap8d.getSelectNtid());
	}

	public void addCcUser(String ntid) {
		click(driver.findElement(By.xpath(
				"//span[contains(@class,'ApprovalListGridControlButton')]//img[@class='ApprovalListGridControlButton_CCTrigger_customfield_13977']")));
		click(driver.findElement(By.xpath("//button[.='Add']")));

		addApprover(ntid);

		List<WebElement> saveList = driver.findElements(By.xpath("//button[.='Save']"));
		Log.info("This is save button list: " + saveList);

		WebElement saveBtn = saveList.get(0);
		Log.info("Second save button is: " + saveBtn);
		click(saveBtn);

	}
	
	public boolean isWorkflowTabPresent() {
		WebElement element = ap8d.getWorkflowTabElement();

		WebElement element2=waitForElementToBePresent(element);

		
		return element2!=null;
	}
	
	public String getActualMasterLinkAp8d() {
		WebElement element=ap8d.getMasterDataElementAp8d();
		return element.getAttribute("href");
	}

	public String getActualMasterLinkPropertyTargetAp8d() {
		WebElement element=ap8d.getMasterDataElementAp8d();
		return element.getAttribute("target");
	}

}
