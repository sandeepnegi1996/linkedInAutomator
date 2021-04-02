package com.workon.report;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.workon.base.Page;
/*import com.workon.utilities.emailService.EmailManager;*/
import com.workon.utilities.testUtil.TestUtil;

public class TestCase_Reports {

	@BeforeTest
	public void beforeSuite() {
		System.out.println("testing report send zip");
		try {
			Page.initConfiguration();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void sendReport() {

		TestUtil.zipReport();
		TestUtil.sendReport();

	}

	@AfterTest
	public void afterSuite() {

		Page.quitBrowser();
		
	}
}
