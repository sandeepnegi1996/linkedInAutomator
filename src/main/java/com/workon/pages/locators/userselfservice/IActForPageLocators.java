package com.workon.pages.locators.userselfservice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IActForPageLocators {

	@FindBy(xpath="//a[normalize-space()='(Help)']")
	private WebElement helpElement;

	/**
	 * @return the helpElement
	 */
	public WebElement getHelpElement() {
		return helpElement;
	}

	/**
	 * @param helpElement the helpElement to set
	 */
	public void setHelpElement(WebElement helpElement) {
		this.helpElement = helpElement;
	}

}
