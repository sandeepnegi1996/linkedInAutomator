package com.workon.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInLocators {
	
	@FindBy(xpath="//button[@class='react-button__trigger  artdeco-button artdeco-button--muted artdeco-button--4 artdeco-button--tertiary ember-view']")
	public List<WebElement> likeButtonList;
	
	@FindBy(xpath="//span[.='My Network']//parent::a")
	public WebElement networkTabElement;

	@FindBy(xpath="//button[contains(.,'Connect')]")
	public List<WebElement> connectButtonList;

	
	//button[contains(.,'Message')]
	@FindBy(xpath="//button[contains(.,'Message')]")
	public List<WebElement> messageElementList;
}

