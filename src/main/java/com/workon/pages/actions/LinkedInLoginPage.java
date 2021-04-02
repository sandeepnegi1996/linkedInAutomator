package com.workon.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.login.LoginPageLocators;

public class LinkedInLoginPage extends Page {

	private LoginPageLocators login;

	public LinkedInLoginPage() {
		this.login = new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.login);
	}

	public LinkedInHomePage doLogin() throws InterruptedException {

		String testuser = prop.getProperty("testUser");
		String password = prop.getProperty("passwordUser");

		type(login.getUsername(), testuser);

		// input[@autocomplete='username']

		type(login.getPassword(), password);

		//// input[@autocomplete='current-password']

		click(login.getLoginBtn());

		Thread.sleep(3000);

		return new LinkedInHomePage();

	}

	public String currentLoggedInUser() {

		return prop.getProperty("testUser");

	}

}
