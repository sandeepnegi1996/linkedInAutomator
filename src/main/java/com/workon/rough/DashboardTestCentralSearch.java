package com.workon.rough;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.utilities.loggers.Log;

public class DashboardTestCentralSearch {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  Log.info("Testing basic Testng");
	  
	  Page.initConfiguration();

	  DashboardPage dashboardpage=new DashboardPage();
	  dashboardpage.gotoCentralSearch();
	  
	  Thread.sleep(5000);
	  Page.quitBrowser();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
