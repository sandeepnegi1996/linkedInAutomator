package com.workon.testcases.archive;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.workon.base.Page;
import com.workon.pages.actions.ArchivePage;
import com.workon.pages.actions.DashboardPage;

public class TestCase_Archive {
	
	
	  @Test
	  public void workonArchiveTest() throws InterruptedException {
		  DashboardPage dp=new DashboardPage();
		  ArchivePage ap= dp.gotoWorkONArchive();
		  Thread.sleep(3000);
		 
		  
		  
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
