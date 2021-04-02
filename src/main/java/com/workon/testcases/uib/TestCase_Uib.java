package com.workon.testcases.uib;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.UIBPage;

public class TestCase_Uib {
	
	@Test
	  public void workonUibTest() throws InterruptedException {
		  DashboardPage dp=new DashboardPage();
		  UIBPage ap= dp.gotoUIB();
		  Thread.sleep(10000);
		 
		  
		  
	  }
	  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		  System.out.println(" ******  starting browser   ********");
		  Page.initConfiguration();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("***** Closing the browser  **********");
		  Page.quitBrowser();
	  }

}
