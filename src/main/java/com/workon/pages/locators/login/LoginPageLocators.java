package com.workon.pages.locators.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	
	//username
	//input[@name='username']
	
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElement username;
	
	//password
	//input[@name='password']
	
	@FindBy(xpath="//input[@autocomplete='current-password']")
	private WebElement password;
	
	//login button
	//input[@value='Login']
	
	@FindBy(xpath="//button[normalize-space()='Sign in']")
	private WebElement loginBtn;

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(WebElement username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(WebElement password) {
		this.password = password;
	}

	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * @param loginBtn the loginBtn to set
	 */
	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	
}
