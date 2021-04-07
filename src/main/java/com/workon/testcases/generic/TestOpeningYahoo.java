package com.workon.testcases.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.workon.base.BaseTest;
import com.workon.pages.actions.YahooPage;

public class TestOpeningYahoo extends BaseTest{

	
	
	
	@Test
	public void verifGoogleTitle() {

		YahooPage yg=new YahooPage(driver);
		yg.openYahooPage();

	}


}

