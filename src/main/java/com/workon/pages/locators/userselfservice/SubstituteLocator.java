package com.workon.pages.locators.userselfservice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubstituteLocator {

	
	
	@FindBy(xpath="//img[@title='Add Default Substitute']")
	public List<WebElement> userpicker;

	@FindBy(css = "#NameFilterField")
	public WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	public WebElement selectNtid;

	
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	public WebElement saveButton;

	
	@FindBy(xpath = "//img[@title='Remove Default Substitute']")
	public WebElement removeDefaultSubs;

	
	@FindBy(xpath = "//button[contains(.,'Yes')]")
	public WebElement yesDelete;
	
}



