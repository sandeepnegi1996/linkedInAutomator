package com.workon.pages.actions.userselfservice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.profile.PersonalInformationPageLocators;

public class PersonalInformationPage extends Page{
	
	public PersonalInformationPageLocators p;
	
	public PersonalInformationPage() {
		
		this.p=new PersonalInformationPageLocators();
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);

		PageFactory.initElements(factory, this.p);
	}
	
	
	public String  getEmployeeNumber() {
		String employeeNum=Page.getElementText(By.xpath("//span[contains(text(),'Employee Number:')]//parent::label[contains(@class,'rb_labelArea')]//following-sibling::div[@class='rb_fieldValueArea rb_fieldValueArea_create']//input"));
		return employeeNum;
	}

}
