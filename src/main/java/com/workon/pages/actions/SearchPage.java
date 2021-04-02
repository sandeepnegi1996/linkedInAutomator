package com.workon.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.workon.base.Page;
import com.workon.pages.actions.amlacsaltrecolann.AMLACSALTRECOLANNRequestCreation;
import com.workon.pages.actions.ap8d.AP8DRequestCreation;
import com.workon.pages.actions.apga.APGARequestCreation;
import com.workon.pages.actions.apmaze.APMAZERequestCreation;
import com.workon.pages.actions.emeaavg.EMEAAVGRequestCreation;
import com.workon.pages.actions.rbga.RBGARequestCreation;
import com.workon.pages.actions.rblvap.RBLVAPRequestCreation;
import com.workon.pages.actions.rbubkpa.RBUBKPA_RequestCreation;
import com.workon.pages.actions.searchrequest.SearchRequestPage;
import com.workon.pages.actions.stga.STGA_RequestCreation;
import com.workon.pages.locators.SearchPageLocators;
import com.workon.pages.actions.cnterm.*;
import com.workon.utilities.loggers.Log;

public class SearchPage extends Page {

	private SearchPageLocators searchpage;

	public SearchPage() {
		this.searchpage = new SearchPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.searchpage);

	}

	// gotoRBGA --> for the new Request
	public RBGARequestCreation gotoRBGA() {
		type(searchpage.getSearchInput(), "RBGA");

		Log.info("Searching RBGA");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getRbgaNewRequest());

		Log.info("Returning the object of the RBGA request Creationn ");
		return new RBGARequestCreation();

	}

	// searchRBGA -->this will be used by the testcase link of the master data in
	// the dashboard

	public void searchRBGA() {
		type(searchpage.getSearchInput(), "RBGA");

		Log.info("Searching RBGA");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

	}

	public void searchAp8d() {
		type(searchpage.getSearchInput(), "AP8D");

		Log.info("Searching AP8D");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

	}

	// goto RBGA Search Request
	public SearchRequestPage gotoSearchRequestRbga() {

		searchRBGA();

		Log.info("clicking on the search request");

		click(searchpage.getRbgaSearchRequest());

		Log.info("Returning the object of the RBGA request Creationn ");

		return new SearchRequestPage();

	}

	// goto AP8D Search Request
	public SearchRequestPage gotoSearchRequestAp8d() {

		searchAp8d();

		Log.info("clicking on the search request");

		click(searchpage.getSearchRequestAp8d());
		Log.info("Returning the object of the RBGA request Creationn ");

		return new SearchRequestPage();

	}

	public APMAZERequestCreation gotoAPMAZE() {

		type(searchpage.getSearchInput(), "APMAZE");
		Log.info("APMAZE being searched...");
		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		// after searching click on the new Request

		// check whether it is P or Q since new Request element is different in P and Q
		// in Q it is working fine but in p it is
		if (Page.isDashboardPUrl) {

			click(driver.findElement(By.xpath("//a[@title='Request a new workflow for Thailand MAZE process']")));
		}

		else {
			click(searchpage.getApmazeNewRequest());
		}

		return new APMAZERequestCreation();

	}

	public void gotoTRAVEL() throws InterruptedException {

		type(searchpage.getSearchInput(), "TRAVEL");
		Log.info("TRAVEL being searched");
		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		// click on the new Request
		Thread.sleep(3000);

	}

	public RBUBKPA_RequestCreation gotoRBUBKPA() {

		type(searchpage.getSearchInput(), "RBUBKPA");
		Log.info("RBUBKPA being searched");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getRbubkpaNewRequest());

		return new RBUBKPA_RequestCreation();
	}

	public STGA_RequestCreation gotoSTGA() {

		type(searchpage.getSearchInput(), "STGA");
		Log.info("STGA being searched");
		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getStgaNewRequest());

		return new STGA_RequestCreation();

	}

	public EMEAAVGRequestCreation gotoEMEAAVG() {

		type(searchpage.getSearchInput(), "EMEAAVG");
		Log.info("EMEAAVG being searched");
		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getEmeaavgNewRequest());

		return new EMEAAVGRequestCreation();

	}

	public APGARequestCreation gotoAPGA() {

		type(searchpage.getSearchInput(), "APGA");
		Log.info("APGA being searched");
		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		if (Page.isDashboardPUrl) {
			click(driver.findElement(By.xpath("//a[contains(@title,'Request a new workflow for AP Approval Form')]")));
		} else {

			click(searchpage.getApgaNewRequest());
		}

		return new APGARequestCreation();

	}

	// These are the new changes

	public AMLACSALTRECOLANNRequestCreation gotoAMLACSALTRECOLANN() {
		// not able to search with the full name

		type(searchpage.getSearchInput(), "AMLACSALTPRECOLANC");

		Log.info("Searching AMLACSALTRECOLANN");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getAmlacsaltrecolan());

		Log.info("Returning the object of the AMLACSALTRECOLAN request Creationn ");

		return new AMLACSALTRECOLANNRequestCreation();

	}

	public AP8DRequestCreation gotoAP8D() {

		searchAp8d();

		click(searchpage.getAp8dNewRequestElement());

		Log.info("Returning the object of the AP8D request Creationn ");

		return new AP8DRequestCreation();
	}

	public CNTERMRequestCreation gotoCNTERM() throws InterruptedException {

		type(searchpage.getSearchInput(), "CNTERM");

		Log.info("Searching CNTERM");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);

		click(searchpage.getCntermNewRequestElement());
		Thread.sleep(2000);
		click(searchpage.getCntermDefaultRequestElement());

		Log.info("Returning the object of the CNTERM request Creationn ");

		return new CNTERMRequestCreation();

	}

	public RBLVAPRequestCreation gotoRBLVAP() {

		type(searchpage.getSearchInput(), "RBLVAP");

		Log.info("Searching RBLVAP");

		action.moveToElement(searchpage.getSearchInput()).sendKeys(Keys.ENTER).build().perform();

		click(searchpage.getRblvapNewRequest());

		Log.info("Returning the object of the RBLVAP request Creationn ");

		return new RBLVAPRequestCreation();
	}

}
