package com.workon.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.pages.locators.GooglePageLocator;

public class GooglePage {
	
	private WebDriver driver;
	
	GooglePageLocator gpl;
	
	public GooglePage(WebDriver driver) {
		
		this.driver=driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.gpl);
	}
	
	public void openGooglePage() {
		driver.get("https://www.google.com");
	}
	
	

}
