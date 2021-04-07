package com.workon.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.pages.locators.GooglePageLocator;
import com.workon.pages.locators.YahooPageLocator;

public class YahooPage {

private WebDriver driver;
	
	YahooPageLocator gpl;
	
	public YahooPage(WebDriver driver) {
		
		this.driver=driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.gpl);
	}
	
	public void openYahooPage() {
		driver.get("https://www.yahoo.com");
	}
	
	
}
