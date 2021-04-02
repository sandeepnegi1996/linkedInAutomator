package com.workon.rough;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.DashboardPage;
import com.workon.pages.actions.SearchPage;
import com.workon.utilities.loggers.Log;

public class SearchRBGA {
  @Test
  public void searchrbga() throws InterruptedException, IOException {
	  
	  Page.initConfiguration();
	  
	  DashboardPage dashboardpage=new DashboardPage();
	  SearchPage searchpage= dashboardpage.gotoSearchBox();
	  searchpage.gotoRBGA();
	  Thread.sleep(3000);
	  Page.quitBrowser();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  Log.info("Searching rbga");
  }


}
