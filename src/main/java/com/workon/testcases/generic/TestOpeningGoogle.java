package com.workon.testcases.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.workon.base.BaseTest;
import com.workon.pages.actions.GooglePage;

public class TestOpeningGoogle extends BaseTest {

	
	@Test
	public void verifGoogleTitle() {

		GooglePage gp=new GooglePage(driver);
		
		gp.openGooglePage();

	}

	
}
