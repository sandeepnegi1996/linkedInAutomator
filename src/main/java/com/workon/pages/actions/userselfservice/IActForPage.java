package com.workon.pages.actions.userselfservice;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.userselfservice.IActForPageLocators;

public class IActForPage extends Page {

	private IActForPageLocators iActFor;

	public IActForPage() {
		this.iActFor = new IActForPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.iActFor);

	}

	public String getHelpLinkValue() {
		return iActFor.getHelpElement().getAttribute("href");
	}

	public String getPropertyValueTarget() {
		return iActFor.getHelpElement().getAttribute("target");
	}

}
