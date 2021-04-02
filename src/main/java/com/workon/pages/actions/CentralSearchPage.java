package com.workon.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.workon.base.Page;
import com.workon.pages.locators.CentralSearchPageLocators;
import com.workon.utilities.loggers.Log;

public class CentralSearchPage extends Page {

	public String requestKey = "";
	private String afterOpeningRequestKey = "";

	private CentralSearchPageLocators centralpage;

	public CentralSearchPage() {
		this.centralpage = new CentralSearchPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.centralpage);
	}

	public CentralSearchPage gotoSearchRequest(String requestKeySearchBox) {

		switchToSecondTab(driver);
		type(centralpage.getTextSearch(), requestKeySearchBox);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		return this;

	}

	/*
	 * This is one of the most important testcase of central search
	 * 
	 * 1. Choose the first item in the cental search after searching for RBGA // get
	 * 2. the request key and print the request key // open the request in the new
	 * tab 3. go to the new tab // verrifyt that the request is having the same key
	 */

	public void displayFirstRequestKey() {
		requestKey = centralpage.allRequests.get(0).getText();
		Log.info("  ======================  " + requestKey + "  =========================");
	}

	public CentralSearchPage clickOntheFirstRequest() {

		click(centralpage.allRequests.get(0));
		return this;
	}

	public void gotoRequestTab() {
		switchToThirdTab(driver);
	}

	public void displayTheRequestKeyInNewTab() {
		displayRequestKey();
	}
	
	public void getRequestKeyAfterOpeningRequest() throws InterruptedException {
		afterOpeningRequestKey = getRequestKey();
	}

	// comparing FirstRequestKey with the Request Opened

	public void compareRequestKey() {
		Assert.assertEquals(requestKey, afterOpeningRequestKey, "Request key is not same in the central search list");
	}

	// Click on the reset button

	public CentralSearchPage clickReset() {
		click(centralpage.getResetBtn());
		Log.info(" *******  Clicked on the Reset Button  ********");
		return this;
	}

	// click on the next button

	public CentralSearchPage clickNextBtn() {

		click(centralpage.getNextBtn());
		Log.info(" *******  Clicked on the Next Button  ********");
		return this;
	}

	// click on the last button

	public CentralSearchPage clickLastBtn() {

		click(centralpage.getLastBtn());
		Log.info(" *******  Clicked on the Last Button  ********");
		return this;
	}

	// click on the sidebar toggle bosch

	public CentralSearchPage clickSideBarToggleSearch() {

		click(centralpage.getSidebarToggleSearch());
		Log.info(" *******  Clicked on the Sidebar Toggle Search Button  ********");
		return this;
	}

	// click quick filters

	public CentralSearchPage clickQuickFilter() {
		click(centralpage.getQuickfilter());
		Log.info(" *******  Clicked on the quick filters Button  ********");
		return this;
	}

	// click all my requests

	public CentralSearchPage clickAllMyRequests() {
		click(centralpage.getAllmyrequest());
		Log.info(" *******  Clicked on the All my requests Button  ********");
		return this;

	}

	// click pending my actions

	public CentralSearchPage clickPendingMyActions() {

		click(centralpage.getPendingMyActions());
		Log.info(" *******  Clicked on the Pending my actions Button  ********");
		return this;
	}

	// click project filter

	public CentralSearchPage clickProjectFilter() {

		click(centralpage.getProjectFilters());
		Log.info(" *******  Clicked on the project filter Button  ********");
		return this;
	}

	// click on more filters

	public CentralSearchPage clickMoreFilters() {
		click(centralpage.getMoreFilters());
		Log.info(" *******  Clicked on the more filters Button  ********");
		return this;
	}

	// click the Date Filters

	public CentralSearchPage clickDateFilters() {

		click(centralpage.getDateFilters().get(0));
		Log.info(" *******  Clicked on the date filters Butston  ********");
		return this;
	}

	// click the user filters

	public CentralSearchPage clickUserFilters() {
		click(centralpage.getUserFilters().get(1));
		Log.info(" *******  Clicked on the user filters Button  ********");
		return this;
	}

	// click the Resolutions and Status filter
	public CentralSearchPage clickResolutionAndStatusFilters() {
		click(centralpage.getResolutionAndStatusFilters().get(2));
		Log.info(" *******  Clicked on the resolution filters Button  ********");
		return this;
	}

	// click the Action Taken filters

	public CentralSearchPage clickActionTakenFilters() {
		click(centralpage.getActionTakenFilters().get(3));
		Log.info(" *******  Clicked on the action taken filters Button  ********");
		return this;
	}

	// click on the help link

	public CentralSearchPage clickHelpCentralSearch() {
		click(centralpage.getHelp());
		Log.info(" ****** Clicking on the help link of the Central Search Page  *******");
		return this;
	}

}
