package com.workon.pages.locators.userselfservice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainProfileLocators {

	
	@FindBy(xpath="//a[contains(.,'Substitute')]//parent::li[position()=1]")
	private WebElement substitute;
	
	
	
	@FindBy(xpath="//span[contains(text(),'I act for')]//parent::a[@id='fivetab']//parent::li")
	private WebElement IActFor;
	
	
	@FindBy(xpath="//tbody//tr//li[1]")
	private WebElement personalInformation;


	
    @FindBy(xpath="//span[@id='linkfour']")
	private WebElement emailSettingsTab;


    @FindBy(xpath="//p[contains(text(),'In this tab a user can select if he/she wants to receive mails when being a CC/Substitute/Assignee recipient for each project / default to all projects.')]")
	 private WebElement emailConfigTextElement;


    @FindBy(xpath="//th[normalize-space()='As CC']")
	private WebElement asCcTextElement;


    @FindBy(xpath="//th[normalize-space()='As Substitute']")
	private WebElement asSubstituteElement;


    @FindBy(xpath="//th[normalize-space()='As Assignee']")
	private WebElement asAssigneeElement;
    
    
    
    


	/**
	 * @return the substitute
	 */
	public WebElement getSubstitute() {
		return substitute;
	}


	/**
	 * @param substitute the substitute to set
	 */
	public void setSubstitute(WebElement substitute) {
		this.substitute = substitute;
	}


	/**
	 * @return the iActFor
	 */
	public WebElement getIActFor() {
		return IActFor;
	}


	/**
	 * @param iActFor the iActFor to set
	 */
	public void setIActFor(WebElement iActFor) {
		IActFor = iActFor;
	}


	/**
	 * @return the personal_Information
	 */
	public WebElement getPersonalInformation() {
		return personalInformation;
	}


	/**
	 * @param personal_Information the personal_Information to set
	 */
	public void setPersonalInformation(WebElement personalInformation) {
		this.personalInformation = personalInformation;
	}


	/**
	 * @return the emailSettingsTab
	 */
	public WebElement getEmailSettingsTab() {
		return emailSettingsTab;
	}


	/**
	 * @param emailSettingsTab the emailSettingsTab to set
	 */
	public void setEmailSettingsTab(WebElement emailSettingsTab) {
		this.emailSettingsTab = emailSettingsTab;
	}


	/**
	 * @return the emailConfigTextElement
	 */
	public WebElement getEmailConfigTextElement() {
		return emailConfigTextElement;
	}


	/**
	 * @param emailConfigTextElement the emailConfigTextElement to set
	 */
	public void setEmailConfigTextElement(WebElement emailConfigTextElement) {
		this.emailConfigTextElement = emailConfigTextElement;
	}


	/**
	 * @return the asSubstituteElement
	 */
	public WebElement getAsSubstituteElement() {
		return asSubstituteElement;
	}


	/**
	 * @param asSubstituteElement the asSubstituteElement to set
	 */
	public void setAsSubstituteElement(WebElement asSubstituteElement) {
		this.asSubstituteElement = asSubstituteElement;
	}


	/**
	 * @return the asCcTextElement
	 */
	public WebElement getAsCcTextElement() {
		return asCcTextElement;
	}


	/**
	 * @param asCcTextElement the asCcTextElement to set
	 */
	public void setAsCcTextElement(WebElement asCcTextElement) {
		this.asCcTextElement = asCcTextElement;
	}


	/**
	 * @return the asAssigneeElement
	 */
	public WebElement getAsAssigneeElement() {
		return asAssigneeElement;
	}


	/**
	 * @param asAssigneeElement the asAssigneeElement to set
	 */
	public void setAsAssigneeElement(WebElement asAssigneeElement) {
		this.asAssigneeElement = asAssigneeElement;
	}
	
	//span[text()='Substitute']//parent::a[@href='#two']
	
}
