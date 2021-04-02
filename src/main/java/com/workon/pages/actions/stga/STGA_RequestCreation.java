package com.workon.pages.actions.stga;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.stga.STGARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class STGA_RequestCreation extends Page {

	private STGARequestCreationLocators stga;

	public STGA_RequestCreation() {

		this.stga = new STGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.stga);

	}

	public void switchToRequestCreationTab() {
		switchToAnyTab(driver, 2);
	}

	public void typeSuject() {
		String subject = prop.getProperty("subject");
		type(stga.getSubjectElement(), subject);
	}

	public void typeSummary() {
		String summary = prop.getProperty("summary");
		type(stga.getSummary(), summary);
	}

	public void selectOptionProcess() {

		String processSTGA = prop.getProperty("processSTGA");

		selectOption(stga.getProcess(), processSTGA);

	}

	public void selectOptionSubProcess() {

		String subProcessSTGA = prop.getProperty("subProcessSTGA");

		selectOption(stga.getSubprocess(), subProcessSTGA);

	}

	public void typeTopic() {
		String topicSTGA = prop.getProperty("topicSTGA");
		type(stga.getTopic(), topicSTGA);
	}

	public void typeDescription() {
		String description = prop.getProperty("description");
		type(stga.getDescription(), description);
	}

	public void deleteAdditionaFieldsAlreadyExisting() {
		for (WebElement element : stga.getDeleteAdditionalFieldsBtn()) {

			List<WebElement> unselectableDiv = driver
					.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-deleteColumn']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			String scriptSetAttr = "arguments[0].setAttribute(arguments[1],arguments[2])";
			js.executeScript(scriptSetAttr, unselectableDiv.get(0), "unselectable", "off");

			Log.info(" *****   check value of Div property " + unselectableDiv.get(0).getAttribute("unselectable"));

			waitForSeconds(2);

			click(stga.getDeleteAdditionalFieldsBtn().get(0));

			click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

			Log.info(" ******   Deleting the  additional fields in the list *******");

		}
	}

	public void deleteApprovalList() {
		for (WebElement element : stga.getDeleteApprovalBtn()) {
			Log.info(" ***********   insinde for loop");

			List<WebElement> unselectableDiv2 = driver
					.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-6']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			String scriptSetAttr = "arguments[0].setAttribute(arguments[1],arguments[2])";

			js.executeScript(scriptSetAttr, unselectableDiv2.get(0), "unselectable", "off");

			Log.info(" *****   check value of Div property " + unselectableDiv2.get(0).getAttribute("unselectable"));

			click(stga.getDeleteApprovalBtn().get(0));

			Log.info("DELETE BUTTON IS CLICKED");

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			click(driver.findElement(By.xpath("//button[contains(text(),'Yes')]")));

			Log.info(" ******   Deleting the existing Approvers in the list *******");

		}

	}

	public void addApprover(String ntid) {

		WebElement firstAddApproverBtn = stga.getApproverBtn().get(0);

		click(firstAddApproverBtn);

		type(stga.getEnterNtid(), ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();

		click(stga.getSelectNtid());

	}

}
