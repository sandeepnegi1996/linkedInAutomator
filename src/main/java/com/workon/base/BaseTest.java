package com.workon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	protected void setUpBeforeTestClass() {
		// initialize a browser driver, connect to servers
		String firefoxdriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

		driver = new FirefoxDriver();

	}

	@AfterClass
	protected void tearDownAfterTestClass() {
		// close connections, close browser as needed
		driver.close();
	}

}