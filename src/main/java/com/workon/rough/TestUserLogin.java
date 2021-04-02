package com.workon.rough;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;

public class TestUserLogin {
	
  @Test(invocationCount=6)
  public void testUserLogin() throws InterruptedException {
	  DashboardPage dp=new DashboardPage();
	  dp.gotoUserLogin();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException, IOException {
	  Page.initConfiguration();
  }

  @AfterClass
  public void afterClass() {
	  Page.quitBrowser();
  }

}
