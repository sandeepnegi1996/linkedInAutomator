package com.workon.testcases.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.workon.base.BaseTest;

public class TestOpeningYahoo extends BaseTest{

	
	/*
	 * WebDriver driver;
	 * 
	 * @BeforeTest public void setUpTest() {
	 * 
	 * String firefoxdriverpath = System.getProperty("user.dir") +
	 * "\\src\\test\\resources\\executable\\geckodriver.exe";
	 * 
	 * System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
	 * 
	 * driver = new FirefoxDriver(); }
	 */

	@Test
	public void verifGoogleTitle() {

		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");

		System.out.println(driver.getTitle());

	}

	/*
	 * @AfterTest() public void tearDownTest() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
}

