package com.workon.pages.actions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.workon.base.Page;
import com.workon.pages.actions.userselfservice.MainProfilePage;
import com.workon.pages.locators.DashboardPageLocators;
import com.workon.utilities.loggers.Log;

public class DashboardPage extends Page {

	// DashboardPage is a Page so thats why we are extending the Page

	private DashboardPageLocators dashboardpagelocator;

	public DashboardPage() {

		this.dashboardpagelocator = new DashboardPageLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.dashboardpagelocator);

	}

	/*
	 * in some cases i am using directly gotoCentralSearch like this but in some
	 * cases i am using gotoworkonArchive i am using workon in the function name
	 * this is because of the name in the workon dashboard page
	 * 
	 */

	public SearchPage gotoSearchBox() {
		/*
		 * return the object of the searchPage
		 * 
		 */

		return new SearchPage();
	}

	public CentralSearchPage gotoCentralSearch() {

		Log.info("inside the gotoCentralSearch");

		click(dashboardpagelocator.getCentralSearchLink());

		Log.info("clicked on the central search page links");

		return new CentralSearchPage();
	}

	public ArchivePage gotoWorkONArchive() throws InterruptedException {

		// since the locator gives the list of element and we need the last element
		// which is the anchor tag for workon archive

		click(dashboardpagelocator.getArchiveLink().get(dashboardpagelocator.getArchiveLink().size() - 1));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new ArchivePage();

	}

	public UIBPage gotoUIB() throws InterruptedException {

		// span[contains(text(),'For edit/approve workflow requests you
		// received')]//preceding-sibling::a
		click(dashboardpagelocator.getUib().get(dashboardpagelocator.getUib().size() - 1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return new UIBPage();

	}

	public MainProfilePage gotoWorkONProfile() {

		click(dashboardpagelocator.getWorkOnProfile());

		/*
		 * waitForLoad(driver); waitForPageLoad();
		 */

		return new MainProfilePage();

	}

	public void gotoWorkONEndUserWiki() {

		click(dashboardpagelocator.getEndUserWiki());

	}

	public void gotoWorkONCommunity() {
		click(dashboardpagelocator.getWorkOnCommunity());
	}

	public void gotoWorkONGlobalNet() {

		click(dashboardpagelocator.getBoschGlobalConnect());
	}

	public void gotoUserInformation() {

	}

	// ==================================================================

	public DashboardPage gotoUserLogin() throws InterruptedException {

		click(dashboardpagelocator.getUserLogin());

		Thread.sleep(2000);
		// check END1COB is available or not after the click

		String currentLoggedinUser = dashboardpagelocator.getUserdata().getText();

		Assert.assertEquals(currentLoggedinUser, "workOnTester");

		Log.info(" *******    Current Login User: " + currentLoggedinUser + "  *******");
		// after that click on the close button
		click(dashboardpagelocator.getCloseuserIcon());

		Thread.sleep(2000);

		return this;
	}

	// gotoWorkflows

	public void gotoWorkflows() {

		click(dashboardpagelocator.getWorkflowTabDashboard());
		Log.info(" ****  clicked on the workflow tab  *****");

	}

	// gotoMyFavTab

	public void gotoMyFavTab() {

		click(dashboardpagelocator.getMyfavtab());
		Log.info("  ******    clicked on the myfav tab  *****");

	}

	public void addItemsToFav() {

		Log.info("***  Adding items in the Favorities Tab ******");

		List<WebElement> favItems = dashboardpagelocator.getStarBtn();

		if (!favItems.isEmpty()) {
			// iterating through items and adding them

			for (WebElement element : favItems) {
				click(element);
				Log.info("Adding items");
			}

		} else {
			Log.info("no items in the fav");
		}

	}

	public void removeItemsFromFav() {

		Log.info("*** Removing items from the favorites tab ****");
		// List<WebElement> favItems = dashboardpagelocator.starBtn;
		List<WebElement> removeItems = null;
		boolean flag = true;

		try {

			removeItems = driver.findElements(By.xpath("//a[@title='Add to your favourites.']"));

		} catch (NoSuchElementException e) {
			flag = false;
			Log.info("element not found");

		}

		if (flag) {

			for (int i = 0; i < 2; i++) {
				click(removeItems.get(i));
				Log.info("removing items from the Myfav tab");
			}

		}
	}

	/*
	 * Checking the broken links on the workon dashboard page
	 * 
	 * Steps1. Collect all the links on the web page
	 * 
	 */

	public List<WebElement> getAllLinksOnWorkONDashboard() {
		List<WebElement> listOfAnchorTags = driver.findElements(By.tagName("a"));
		return listOfAnchorTags;
	}

	// search bar present or not

	public boolean isSearchBarPresent() {
		WebElement element = dashboardpagelocator.getSearchBarElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}

	public String getCentalSearchLink() {

		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");

	}
	
	public String getCentalSearchLinkExpected() {

		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}

	
	public String getWorkONArchiveLink() {
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
		
	}
	
	public String getWorkONArchiveLinkExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}
	
	public String getUnifiedInboxLink() {
		
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
		
	}
	
	public String getUnifiedLinkExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}
	
	
	
	public String getEndUserWikiLink() {
		
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
		
	}
	
	public String getEndUserWikiLinkExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}
	
	
	public String getWorkONCommunityLink() {
		
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
		
	}
	
	public String getWorkONCommunityLinkExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}


	public String getBoschGlobalNetLink() {
		
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
	
	}
	
	public String getBoschGlobalNetExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}

	
	//Problems and Questions
	// Link to MailBox IT Service Desk
	// Link to IT Consulting 
	
	
	public String getmailBoxITServiceDeskLink() {
		WebElement element = dashboardpagelocator.getWorkonCentralSearch();
		return element.getAttribute("href");
		
	}
	
	public String getmailBoxITServiceDeskLinkExpected() {
		
		String expected = prop.getProperty("central_search_Q_link");

		return expected;

	}

	public boolean isItServiceDeskLinkPresent() {
		WebElement element = dashboardpagelocator.getItServiceDeskElement();

		WebElement element2=waitForElementToBePresent(element);

		if (element2 != null) {
			return true;
		}
		return false;
	}

	public String getItServiceDeskLinkHref() {
		
		WebElement element = dashboardpagelocator.getItServiceDeskElement();

		WebElement element2=waitForElementToBePresent(element);

		Log.info("link found for IT service desk in dashboard is "+element2.getAttribute("href"));
		
		return element2.getAttribute("href");
		
	}
	
	

}
