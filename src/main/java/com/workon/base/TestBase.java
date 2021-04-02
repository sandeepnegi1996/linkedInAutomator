package com.workon.base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.workon.utilities.loggers.Log;

public class TestBase {

	@BeforeClass
	public static void setupBeforeTest() {
		try {
		Page.initConfiguration();
		}
		catch(IOException e) {
			Log.info("unable to open the browser");
			
		}
		catch(Exception e) {
			Log.info("Exception occured while opening browser");
		}

	}
	
	@AfterClass
	public void setupAfterTest() {
		
		Page.quitBrowser();
	}
	
}
