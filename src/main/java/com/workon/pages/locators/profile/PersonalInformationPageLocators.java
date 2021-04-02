package com.workon.pages.locators.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPageLocators {

	
	@FindBy(xpath="//span[contains(text(),'Employee Number:')]//parent::label[contains(@class,'rb_labelArea')]//following-sibling::div[@class='rb_fieldValueArea rb_fieldValueArea_create']//input")
	private WebElement EmployeeNumber;
}
