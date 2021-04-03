package com.workon.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.LinkedInLocators;
import com.workon.utilities.comments.Comments;
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

	public void navigateToMessagePage() throws InterruptedException {
		driver.navigate().to("https://www.linkedin.com/mynetwork/invite-connect/connections/");
		Thread.sleep(3000);
	}

	public void sendMessageToConnection() throws InterruptedException {

		List<WebElement> listMessage = locator.messageElementList;
		Log.info("size of the messageElement :  " + listMessage.size());

		for (int i = 14; i < listMessage.size(); i++) {

			Log.info("Current user:  " + i);

			WebElement message = listMessage.get(i);

			click(message);

			Thread.sleep(2000);

			type(locator.messageTypeArea, "Hi");
			locator.messageTypeArea.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			type(locator.messageTypeArea,
					"I am an aspiring Test Automation engineer who came across a role in your firm and am interested in applying.");
			locator.messageTypeArea.sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			type(locator.messageTypeArea,
					"Would you be open to sharing my profile with the hiring team so they know about my interest in this role? Happy to chat more if you have the time.Looking forward to hearing from you");
			locator.messageTypeArea.sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			type(locator.messageTypeArea,
					"https://drive.google.com/file/d/10j1c1S_kmyOoezH0ruZY0hWjfGzl0uO3/view?usp=sharing");
			locator.messageTypeArea.sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			type(locator.messageTypeArea, "� Sandeep");
			locator.messageTypeArea.sendKeys(Keys.ENTER);

			// closing the message box once the message is send

			click(locator.closeMessageButton);

			Thread.sleep(2000);

		}

	}

	// get the name of connection

	// print the name of connection

	// check the name of connection in excel

	// if the name is present in excel then do not send email

	// if name is not present then send email

	public void scrollToTheBottom() {

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollNTimes(int times) throws InterruptedException {

		while (times-- > 0) {

			action.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(5000);

		}
	}

	public void scrollNTimesUp(int times) throws InterruptedException {

		while (times-- > 0) {

			action.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(5000);

		}
	}

	public void printAllConnectionName() {

		// List<WebElement> connectionNameList = locator.connectionName;

		List<WebElement> connectionNameList = driver
				.findElements(By.xpath("//span[@class='mn-connection-card__name t-16 t-black t-bold']"));

		/*
		 * for (WebElement element : connectionNameList) {
		 * Log.info("Connections are :  " + element.getText());
		 * Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++"); }
		 */

		Log.info("size of the connectionNameList:  " + connectionNameList.size());

		List<WebElement> listMessage = locator.messageElementList;

		Log.info("size of the messageElement :  " + listMessage.size());

	}

	public void makeComment() throws InterruptedException {

		//// button[@class='artdeco-button comment-button artdeco-button--muted
		//// artdeco-button--4 artdeco-button--tertiary ember-view']

		
		  List<WebElement> commentButtonList = locator.commentButtonList;
		  Log.info("size of the commentButtonList :  " + commentButtonList.size());
		 

		// i need list of the input div add a comment

		// commentInputField

		List<WebElement> commentButtonListInput = locator.commentInputField;
		Log.info("size of the commentButtonList :  " + commentButtonList.size());

		List<String> commentListFromExcel = Comments.getComments(Page.excel);

		Log.info("size of the messageElement :  " + commentListFromExcel.size());

		for (int i = 0; i < commentButtonList.size(); i++) {

			String currentComment = commentListFromExcel.get(i);

			click(commentButtonList.get(i));

			type(commentButtonListInput.get(i), currentComment);

			click(locator.postCommentElement);

			Thread.sleep(2000);

		}

	}

}
