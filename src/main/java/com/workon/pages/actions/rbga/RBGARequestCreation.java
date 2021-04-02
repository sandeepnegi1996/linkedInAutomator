package com.workon.pages.actions.rbga;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.rbga.RBGARequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class RBGARequestCreation extends Page {

	private RBGARequestCreationLocators rbgaRequestLocator;

	public RBGARequestCreation() {

		this.rbgaRequestLocator = new RBGARequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.rbgaRequestLocator);

	}

	public void switchToRbgaRequestCreation() {

		switchToAnyTab(driver, 2);
	}

	public void clickCheckBoxElement() {
		click(rbgaRequestLocator.getCheckboxElement());

	}

	public void typeBriefDescription() {
		String briefDescription = prop.getProperty("briefDescription");
		type(rbgaRequestLocator.getBriefDescriptionElement(), briefDescription);

	}

	public void typeFullDescription() {
		String description = prop.getProperty("description");
		type(rbgaRequestLocator.getDescriptionElement(), description);

	}

	public WebElement findFirstAddApproverBtn() {
		return rbgaRequestLocator.getAddApproverBtn().get(0);

	}

	public void clickfirstApproverButton() {
		click(findFirstAddApproverBtn());

	}

	public RBGARequestCreation addApprover(String ntid) {

		boolean isPresent = isElementPresent(By.id("NameFilterField"));

		if (isPresent) {
			type(rbgaRequestLocator.getEnterNtid(), ntid);
			action.sendKeys(Keys.chord(Keys.ENTER)).perform();

			boolean isPresentSelectntid = isElementPresent(
					By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]"));

			if (isPresentSelectntid) {

				click(rbgaRequestLocator.getSelectNtid());

			}

		}

		return this;
	}

	// Checking after request creation Approver Button Present or not
	public boolean isApproverButtonPresent() {
		List<WebElement> listOfWebElement = driver.findElements(By.xpath("//a[contains(text(),'Approve')]"));

		if (!listOfWebElement.isEmpty()) {
			Log.info(" *******   Approver Button Present  *********  ");
			return true;
		}

		Log.info("********  Approver Button not Present  **********");
		return false;
	}

	// button displayed after request creation
	public void clickApproverButton() {
		click(rbgaRequestLocator.getApproverBtn());
		Log.info("****  Clicking on the Approver Button  *******");
	}

	public void gotoCloseFeedbackform() throws InterruptedException {

		switchToSecondTab(driver);

		click(rbgaRequestLocator.getCheckboxElement());

		boolean isActive = true;
		try {
			driver.findElement(By.xpath("//div[@title='Close Feedback']//input[@value='x']"));
		} catch (NoSuchElementException e) {
			Log.info("Exception Occured");
			e.printStackTrace();
			Log.info("=====   X is not present    =======");
			isActive = false;

		}

		if (isActive) {

			click(rbgaRequestLocator.getFeedbackbtn());
			Log.info("======   Clicked on the feedback form =======");

			Log.info("======    Waiting for some time ========");
			Thread.sleep(3000);

			click(driver.findElement(By.xpath("//div[@id='closeFeedbackForm']//input[@value='x']")));

			Log.info("====== Closing feedback form =======");
		}

	}

	public void findFeedbackformPresence() throws InterruptedException {

		click(rbgaRequestLocator.getFeedbackCloseBtn());

		String checkingDisplayAttribute = rbgaRequestLocator.getFeedbackCloseBtn().getCssValue("display");

		if (checkingDisplayAttribute.equals("none")) {
			Log.info("======   form is closed properly   ========");
		}

		if (checkingDisplayAttribute.equals("block")) {
			Log.info("=======  form not closed    =============");
		}

		Thread.sleep(3000);

	}

	public void typeLocation() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("wUI.GetField(\"common.field.employee.location\").enable();");

		waitForSeconds(2);

		type(rbgaRequestLocator.getLocation(), "Coimbatore");

	}

	public void clickAddAdditionalFieldsBtn() {

		click(rbgaRequestLocator.getAddBtn());

	}

	public void addFields() {

		type(rbgaRequestLocator.getField(), "a");

	}

	public void addDetails() {

		type(rbgaRequestLocator.getDetails(), "b");

	}

	public void clickDuplicateSelectedRowButton() {
		click(rbgaRequestLocator.getDuplicateSelectedRowButton());
	}

	public boolean ExpectedUser() {
		// here we will search which element is added.
		WebElement element = driver
				.findElement(By.xpath("//font[normalize-space()='Sandeep Singh Negi (RBEI/BSV-AD1)']"));

		WebElement element2 = waitForElementToBePresent(element);

		return element2 != null;
	}

	public boolean ExpectedGroup() {
		WebElement element = driver.findElement(By.xpath("//font[normalize-space()='WorkOn.Core']"));

		WebElement element2 = waitForElementToBePresent(element);

		return element2 != null;
	}

	public boolean ExpectedWpdGroup() {
		WebElement element = driver.findElement(By.xpath("//font[normalize-space()='rb_workon_workon_admins']"));

		WebElement element2 = waitForElementToBePresent(element);

		return element2 != null;
	}

	public String getActualMasterLink() {
		WebElement element = rbgaRequestLocator.getMasterDataElement();
		return element.getAttribute("href");
	}

	public String getActualMasterLinkPropertyTarget() {
		WebElement element = rbgaRequestLocator.getMasterDataElement();
		return element.getAttribute("target");
	}

}
