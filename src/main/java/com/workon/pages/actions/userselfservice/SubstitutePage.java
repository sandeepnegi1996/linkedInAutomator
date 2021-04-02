package com.workon.pages.actions.userselfservice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.userselfservice.SubstituteLocator;

public class SubstitutePage extends Page {

	public SubstituteLocator subs;

	public SubstitutePage() {

		this.subs = new SubstituteLocator();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.subs);

	}

	public void addUser() {

		click(subs.userpicker.get(0));

	}

	public void addApprover(String ntid) {

		boolean isPresent = isElementPresent(By.id("NameFilterField"));

		if (isPresent) {
			type(subs.enterNtid, ntid);
			action.sendKeys(Keys.chord(Keys.ENTER)).perform();

			boolean isPresentSelectntid = isElementPresent(
					By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]"));

			if (isPresentSelectntid) {

				click(subs.selectNtid);

			}

		}

	}

	public void clickSaveButton() {
		click(subs.saveButton);

	}

	public void removeDefaultSubstitute() {
		click(subs.removeDefaultSubs);
		click(subs.yesDelete);
	}

	public void clickDuration() {

		click(driver.findElement(By.xpath("//span[contains(text(),'Duration')]//input[@type='checkbox']")));

	}

	public String getCurrentDate() {
		// TODO Auto-generated method stub

		// getCurrentDate
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		return dtf.format(now);

	}

	public void selectDuration() {
		String currentDate = getCurrentDate();

		type(driver.findElement(By.xpath("//td[6]//span[1]//input[@class='WorkOnCls-DatePicker']")), currentDate);

	}
	
	public boolean verifyDefaultSubstitueAdded() {
		
		if(driver.findElement(By.cssSelector("#default:workontester1")) != null) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
