package com.workon.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.LinkedInLocators;
import com.workon.utilities.loggers.Log;

public class LinkedInHomePage extends Page {

	// DashboardPage is a Page so thats why we are extending the Page

	private LinkedInLocators locator;

	public LinkedInHomePage() {

		this.locator = new LinkedInLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.locator);

	}

	public void clickOnLikeButton() throws InterruptedException {
		
		
		List<WebElement> likeButtonList = locator.likeButtonList;
		for (WebElement element : likeButtonList) {
			click(element);
			Log.info("Clicked on like button" + element);
			Thread.sleep(3000);
		}

	}

	public void refreshPage() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	public void clickOnNetWorkTab() {
		click(locator.networkTabElement);
		waitForSeconds(5);
	}

	public void clickOnConnectButtonOneByOne() throws InterruptedException {

		
		List<WebElement> connectButtonList = locator.connectButtonList;

		for (WebElement element : connectButtonList) {
			click(element);
			Log.info("Clicked on Connect  button" + element);
			Thread.sleep(3000);
		}

	}
	
	public void navigateToConnectPage() {
		driver.navigate().to("https://www.linkedin.com/mynetwork/");
	}
	
	
	public void navigateToMessagePage() {
		driver.navigate().to("https://www.linkedin.com/mynetwork/invite-connect/connections/");
	}
	
	public void sendMessageToConnection() {
		
		List<WebElement> listMessage= locator.messageElementList;
	}

}
