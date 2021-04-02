package com.workon.pages.actions.login;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.LinkedInHomePage;
import com.workon.pages.locators.login.LoginPageLocators;


public class LoginPage extends Page {

	private LoginPageLocators login;

	public LoginPage() {
		this.login = new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.login);
	}

	public DashboardPage doLogin() throws InterruptedException {
		
		
		String testuser=prop.getProperty("testUser");
		String password=prop.getProperty("passwordUser");

		type(login.getUsername(),testuser);
		
		//input[@autocomplete='username']
		
		type(login.getPassword(),password);
		
		////input[@autocomplete='current-password']
		
		click(login.getLoginBtn());
		
		Thread.sleep(10000);
		
		return new DashboardPage();
	
	}
	
	public String currentLoggedInUser() {
		
		return prop.getProperty("testUser");
		
	}

}
