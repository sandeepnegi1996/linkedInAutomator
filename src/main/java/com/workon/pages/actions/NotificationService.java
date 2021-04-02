package com.workon.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.NotificationServiceLocator;

public class NotificationService extends Page {

	private NotificationServiceLocator notify;

	public NotificationService() {
		this.notify = new NotificationServiceLocator();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.notify);
	}

	// verify that the notification bell is present

	public boolean verifyNotificaitonBellPresent() {

		WebElement element1 = notify.getNotificationBell();

		WebElement element2 = waitForElementToBePresent(element1);

		return element2 != null;

	}

}
