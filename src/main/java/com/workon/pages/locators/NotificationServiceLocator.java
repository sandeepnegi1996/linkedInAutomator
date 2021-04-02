package com.workon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationServiceLocator {
	
	@FindBy(xpath="//a[@title='Notification']")
	private WebElement notificationbell;
	
	public WebElement getNotificationBell() {
		return notificationbell;
	}
	
	public void setNotificationBell(WebElement notificationbell) {
		this.notificationbell=notificationbell;
	}

}
