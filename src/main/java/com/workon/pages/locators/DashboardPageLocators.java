package com.workon.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {

	@FindBy(xpath = "//span[contains(text(),'Try with New Dashboard UI for Cross Project Search')]//parent::div//following-sibling::a")
	private WebElement centralSearchLink;

	// workon archive link
	@FindBy(xpath = "//span[contains(text(),'It stores all closed requests according to the archive definition chosen by the process owner.')]//preceding-sibling::a")
	private List<WebElement> archiveLink;

	// workon UIB
	@FindBy(xpath = "//span[contains(text(),'For edit/approve workflow requests you received')]//preceding-sibling::a")
	private List<WebElement> uib;

	
	
	
	@FindBy(xpath = "//img[@class='sprite-menu_user']//parent::a")
	private WebElement userLogin;

	@FindBy(xpath = "//div[@id='userdetailinfo_header_controls']//img[@class='sprite-close']")
	private WebElement closeuserIcon;
	// div[@id='userdetailinfo_header_controls']//img[@class='sprite-close']

	// td[contains(text(),'END1COB')]

	@FindBy(xpath = "//td[contains(text(),'workOnTester')]")
	private WebElement userdata;

	@FindBy(xpath = "//a[@id='menuForm:search']")
	private WebElement workflowTabDashboard;

	@FindBy(xpath = "//a[@id='menuForm:fav']")
	private WebElement myfavtab;

	@FindBy(xpath = "//a[@title='Add to your favourites.']")
	private List<WebElement> starBtn;

	
	
	
	// Useful links
	
	@FindBy(xpath="//a[normalize-space()='WorkON Central Search']//img[@class='linkarrow sprite-lnkarrow']//parent::a")
	private WebElement workonCentralSearch;
	
	//WorkON Archive
	@FindBy(xpath="//a[normalize-space()='WorkON Archive']")
	private WebElement workonArchive;
	
	//shared applications
	
	//unified inbox
	
	//profile
	
	
	
	@FindBy(xpath="//a[contains(normalize-space(),'WorkON Profile')]")
	private WebElement workOnProfile;

	@FindBy(xpath="//a[contains(normalize-space(),'WorkON End User Wiki')]")
	private WebElement endUserWiki;

	@FindBy(xpath="//a[normalize-space()='WorkON Community']")
	private WebElement workOnCommunity;

	@FindBy(xpath="//a[normalize-space()='WorkON Bosch GlobalNet']")
	private WebElement boschGlobalConnect;
	
	//search bar
	@FindBy(xpath="//input[@id='searchInputField']")
	private WebElement searchBarElement;

	@FindBy(xpath="//a[normalize-space()='Mailbox IT Service Desk']")
	private WebElement itServiceDeskElement;

	/**
	 * @return the centralSearchLink
	 */
	public WebElement getCentralSearchLink() {
		return centralSearchLink;
	}

	/**
	 * @param centralSearchLink the centralSearchLink to set
	 */
	public void setCentralSearchLink(WebElement centralSearchLink) {
		this.centralSearchLink = centralSearchLink;
	}

	/**
	 * @return the archiveLink
	 */
	public List<WebElement> getArchiveLink() {
		return archiveLink;
	}

	/**
	 * @param archiveLink the archiveLink to set
	 */
	public void setArchiveLink(List<WebElement> archiveLink) {
		this.archiveLink = archiveLink;
	}

	/**
	 * @return the uib
	 */
	public List<WebElement> getUib() {
		return uib;
	}

	/**
	 * @param uib the uib to set
	 */
	public void setUib(List<WebElement> uib) {
		this.uib = uib;
	}

	/**
	 * @return the workOnProfile
	 */
	public WebElement getWorkOnProfile() {
		return workOnProfile;
	}

	/**
	 * @param workOnProfile the workOnProfile to set
	 */
	public void setWorkOnProfile(WebElement workOnProfile) {
		this.workOnProfile = workOnProfile;
	}

	/**
	 * @return the endUserWiki
	 */
	public WebElement getEndUserWiki() {
		return endUserWiki;
	}

	/**
	 * @param endUserWiki the endUserWiki to set
	 */
	public void setEndUserWiki(WebElement endUserWiki) {
		this.endUserWiki = endUserWiki;
	}

	/**
	 * @return the workOnCommunity
	 */
	public WebElement getWorkOnCommunity() {
		return workOnCommunity;
	}

	/**
	 * @param workOnCommunity the workOnCommunity to set
	 */
	public void setWorkOnCommunity(WebElement workOnCommunity) {
		this.workOnCommunity = workOnCommunity;
	}

	/**
	 * @return the boschGlobalConnect
	 */
	public WebElement getBoschGlobalConnect() {
		return boschGlobalConnect;
	}

	/**
	 * @param boschGlobalConnect the boschGlobalConnect to set
	 */
	public void setBoschGlobalConnect(WebElement boschGlobalConnect) {
		this.boschGlobalConnect = boschGlobalConnect;
	}

	/**
	 * @return the userLogin
	 */
	public WebElement getUserLogin() {
		return userLogin;
	}

	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(WebElement userLogin) {
		this.userLogin = userLogin;
	}

	/**
	 * @return the userdata
	 */
	public WebElement getUserdata() {
		return userdata;
	}

	/**
	 * @param userdata the userdata to set
	 */
	public void setUserdata(WebElement userdata) {
		this.userdata = userdata;
	}

	/**
	 * @return the closeuserIcon
	 */
	public WebElement getCloseuserIcon() {
		return closeuserIcon;
	}

	/**
	 * @param closeuserIcon the closeuserIcon to set
	 */
	public void setCloseuserIcon(WebElement closeuserIcon) {
		this.closeuserIcon = closeuserIcon;
	}

	/**
	 * @return the workflowTabDashboard
	 */
	public WebElement getWorkflowTabDashboard() {
		return workflowTabDashboard;
	}

	/**
	 * @param workflowTabDashboard the workflowTabDashboard to set
	 */
	public void setWorkflowTabDashboard(WebElement workflowTabDashboard) {
		this.workflowTabDashboard = workflowTabDashboard;
	}

	/**
	 * @return the myfavtab
	 */
	public WebElement getMyfavtab() {
		return myfavtab;
	}

	/**
	 * @param myfavtab the myfavtab to set
	 */
	public void setMyfavtab(WebElement myfavtab) {
		this.myfavtab = myfavtab;
	}

	/**
	 * @return the starBtn
	 */
	public List<WebElement> getStarBtn() {
		return starBtn;
	}

	/**
	 * @param starBtn the starBtn to set
	 */
	public void setStarBtn(List<WebElement> starBtn) {
		this.starBtn = starBtn;
	}

	/**
	 * @return the searchBarElement
	 */
	public WebElement getSearchBarElement() {
		return searchBarElement;
	}

	/**
	 * @param searchBarElement the searchBarElement to set
	 */
	public void setSearchBarElement(WebElement searchBarElement) {
		this.searchBarElement = searchBarElement;
	}

	/**
	 * @return the workonCentralSearch
	 */
	public WebElement getWorkonCentralSearch() {
		return workonCentralSearch;
	}

	/**
	 * @param workonCentralSearch the workonCentralSearch to set
	 */
	public void setWorkonCentralSearch(WebElement workonCentralSearch) {
		this.workonCentralSearch = workonCentralSearch;
	}

	/**
	 * @return the itServiceDeskElement
	 */
	public WebElement getItServiceDeskElement() {
		return itServiceDeskElement;
	}

	/**
	 * @param itServiceDeskElement the itServiceDeskElement to set
	 */
	public void setItServiceDeskElement(WebElement itServiceDeskElement) {
		this.itServiceDeskElement = itServiceDeskElement;
	}
	
	
}
