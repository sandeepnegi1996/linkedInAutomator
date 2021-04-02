package com.workon.pages.actions.userselfservice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.userselfservice.MainProfileLocators;
import com.workon.utilities.loggers.Log;

public class MainProfilePage extends Page{
	
	public MainProfileLocators profile;

	public MainProfilePage() {

		this.profile = new MainProfileLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);

		PageFactory.initElements(factory, this.profile);

	}
	
	
	public void switchToProfilePage() {
		switchToAnyTab(driver,2);
		waitForSeconds(15);
	}

	
	public SubstitutePage gotoSubstituePage() throws InterruptedException {
		
		
		//waitForLoad(driver);
		Log.info("inside the fucntion to click on the substitute Tab");
		//waitForPageLoad();
		
		click(profile.getSubstitute());
		
		return new SubstitutePage();
	}
	
	public IActForPage gotoIActForPage() {
		
		click(profile.getIActFor());
		
		return new IActForPage();
		
		
	}
	
	public PersonalInformationPage gotoPersonalInformationPage() {
		
		click(profile.getPersonalInformation());
		
		return new PersonalInformationPage();
	}


	public void gotoEmailSettingsPage() {
		// TODO Auto-generated method stub
		click(profile.getEmailSettingsTab());
		
		
	}


	public boolean isEmailConfigurationTextPresent() {
		WebElement element = profile.getEmailConfigTextElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}


	public String isEmailConfigurationTextUpdated() {
		
		return profile.getEmailConfigTextElement().getText();
		
	}


	public boolean isAsCCTextPresent() {
		WebElement element = profile.getAsCcTextElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}


	public boolean isAsSubstitutePresent() {
		WebElement element = profile.getAsSubstituteElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}


	public boolean isAsAssigneePresent() {
		WebElement element = profile.getAsAssigneeElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}

}
