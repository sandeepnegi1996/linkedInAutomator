package com.workon.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralSearchPageLocators {

	@FindBy(css = "#FullTextSearch")
	private WebElement textSearch;

	@FindBy(css = "#resetbtn")
	private WebElement resetBtn;

	@FindBy(xpath = "//a[contains(text(),'Next')]")
	private WebElement nextBtn;

	@FindBy(xpath = "//a[contains(text(),'Last')]")
	private WebElement lastBtn;

	@FindBy(xpath = "//a[@class='sidebar-toggle bosch']")
	private WebElement sidebarToggleSearch;

	// quick filter

	@FindBy(xpath = "//span[contains(text(),'Quick Filters')]")
	private WebElement quickfilter;

	@FindBy(xpath = "//li//a[contains(text(),'All My Requests')]")
	private WebElement allmyrequest;

	@FindBy(xpath = "//li//a[contains(text(),'Pending my action')]")
	private WebElement pendingMyActions;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'Project Filter')]")
	private WebElement projectFilters;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'More Filters')]")
	private WebElement moreFilters;

	// =====================================================================

	@FindBy(xpath = "//span[contains(text(),'Date Filters')]//preceding-sibling::input[@type='checkbox']")
	private List<WebElement> dateFilters;

	@FindBy(xpath = "//span[contains(text(),'User Filters')]//preceding-sibling::input[@type='checkbox']")
	private List<WebElement> userFilters;

	@FindBy(xpath = "//span[contains(text(),'Resolution & Status Filter')]//preceding-sibling::input[@type='checkbox']")
	private List<WebElement> resolutionAndStatusFilters;

	@FindBy(xpath = "//span[contains(text(),'Action Taken')]//preceding-sibling::input[@type='checkbox']")
	private List<WebElement> actionTakenFilters;

	@FindBy(xpath = "//li[@class='treeview']//span[contains(text(),'Help')]")
	private WebElement help;

	@FindBy(xpath="//div[@class='jqx-grid-cell-left-align']//a")
	public List<WebElement> allRequests;

	
	@FindBy(xpath="//b[contains(text(),'Key:')]//parent::td//following-sibling::b//a")
	private WebElement currentKey;


	/**
	 * @return the textSearch
	 */
	public WebElement getTextSearch() {
		return textSearch;
	}


	/**
	 * @param textSearch the textSearch to set
	 */
	public void setTextSearch(WebElement textSearch) {
		this.textSearch = textSearch;
	}


	/**
	 * @return the resetBtn
	 */
	public WebElement getResetBtn() {
		return resetBtn;
	}


	/**
	 * @param resetBtn the resetBtn to set
	 */
	public void setResetBtn(WebElement resetBtn) {
		this.resetBtn = resetBtn;
	}


	/**
	 * @return the nextBtn
	 */
	public WebElement getNextBtn() {
		return nextBtn;
	}


	/**
	 * @param nextBtn the nextBtn to set
	 */
	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}


	/**
	 * @return the lastBtn
	 */
	public WebElement getLastBtn() {
		return lastBtn;
	}


	/**
	 * @param lastBtn the lastBtn to set
	 */
	public void setLastBtn(WebElement lastBtn) {
		this.lastBtn = lastBtn;
	}


	/**
	 * @return the sidebarToggleSearch
	 */
	public WebElement getSidebarToggleSearch() {
		return sidebarToggleSearch;
	}


	/**
	 * @param sidebarToggleSearch the sidebarToggleSearch to set
	 */
	public void setSidebarToggleSearch(WebElement sidebarToggleSearch) {
		this.sidebarToggleSearch = sidebarToggleSearch;
	}


	/**
	 * @return the quickfilter
	 */
	public WebElement getQuickfilter() {
		return quickfilter;
	}


	/**
	 * @param quickfilter the quickfilter to set
	 */
	public void setQuickfilter(WebElement quickfilter) {
		this.quickfilter = quickfilter;
	}


	/**
	 * @return the allmyrequest
	 */
	public WebElement getAllmyrequest() {
		return allmyrequest;
	}


	/**
	 * @param allmyrequest the allmyrequest to set
	 */
	public void setAllmyrequest(WebElement allmyrequest) {
		this.allmyrequest = allmyrequest;
	}


	/**
	 * @return the pendingMyActions
	 */
	public WebElement getPendingMyActions() {
		return pendingMyActions;
	}


	/**
	 * @param pendingMyActions the pendingMyActions to set
	 */
	public void setPendingMyActions(WebElement pendingMyActions) {
		this.pendingMyActions = pendingMyActions;
	}


	/**
	 * @return the projectFilters
	 */
	public WebElement getProjectFilters() {
		return projectFilters;
	}


	/**
	 * @param projectFilters the projectFilters to set
	 */
	public void setProjectFilters(WebElement projectFilters) {
		this.projectFilters = projectFilters;
	}


	/**
	 * @return the moreFilters
	 */
	public WebElement getMoreFilters() {
		return moreFilters;
	}


	/**
	 * @param moreFilters the moreFilters to set
	 */
	public void setMoreFilters(WebElement moreFilters) {
		this.moreFilters = moreFilters;
	}


	/**
	 * @return the dateFilters
	 */
	public List<WebElement> getDateFilters() {
		return dateFilters;
	}


	/**
	 * @param dateFilters the dateFilters to set
	 */
	public void setDateFilters(List<WebElement> dateFilters) {
		this.dateFilters = dateFilters;
	}


	/**
	 * @return the userFilters
	 */
	public List<WebElement> getUserFilters() {
		return userFilters;
	}


	/**
	 * @param userFilters the userFilters to set
	 */
	public void setUserFilters(List<WebElement> userFilters) {
		this.userFilters = userFilters;
	}


	/**
	 * @return the resolutionAndStatusFilters
	 */
	public List<WebElement> getResolutionAndStatusFilters() {
		return resolutionAndStatusFilters;
	}


	/**
	 * @param resolutionAndStatusFilters the resolutionAndStatusFilters to set
	 */
	public void setResolutionAndStatusFilters(List<WebElement> resolutionAndStatusFilters) {
		this.resolutionAndStatusFilters = resolutionAndStatusFilters;
	}


	/**
	 * @return the actionTakenFilters
	 */
	public List<WebElement> getActionTakenFilters() {
		return actionTakenFilters;
	}


	/**
	 * @param actionTakenFilters the actionTakenFilters to set
	 */
	public void setActionTakenFilters(List<WebElement> actionTakenFilters) {
		this.actionTakenFilters = actionTakenFilters;
	}


	/**
	 * @return the help
	 */
	public WebElement getHelp() {
		return help;
	}


	/**
	 * @param help the help to set
	 */
	public void setHelp(WebElement help) {
		this.help = help;
	}

}
