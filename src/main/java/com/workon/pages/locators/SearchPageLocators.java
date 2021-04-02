package com.workon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

	@FindBy(css="#searchInputField")
	private WebElement searchInput;
	
	
	@FindBy(xpath="//a[@title='Request a new workflow for RB General Approval Form']")
	private WebElement rbgaNewRequest;
	
	
	
	//a[@title='Search workflows of RB General Approval Form']
	
	@FindBy(xpath="//a[@title='Search workflows of RB General Approval Form']")
	private WebElement rbgaSearchRequest;
	
	
	
	@FindBy(xpath="//a[@title='Request a new workflow for APMAZE']")
	private WebElement apmazeNewRequest;
	
	@FindBy(xpath="//a[@title='Request a new workflow for CP/ABx - Purchasing Approval Workflow']")
	private WebElement rbubkpaNewRequest;
	
	@FindBy(xpath="//a[@title='Request a new workflow for BT & SO General Approval']")
	private WebElement stgaNewRequest;
	
	
	@FindBy(xpath="//a[@title='Request a new workflow for EMEA Admin Rights for Server']")
	private WebElement emeaavgNewRequest;


	@FindBy(xpath="//a[@title='Request a new workflow for MAE Release']")
	private WebElement amlactglibmaeNewRequest;
	
	
	@FindBy(xpath="//a[contains(@title,'Request a new workflow for AA - Amendment Pricing / Release Notice')]")
	private WebElement amlacsaltrecolan;

	@FindBy(xpath="//a[@title='Request a new workflow for AP General Approval form']")
	private WebElement apgaNewRequest;


	@FindBy(xpath="//a[contains(@title,'Request a new workflow for RBAU 8D Approval')]")
	private WebElement ap8dNewRequestElement;
	
	
	
	@FindBy(xpath="//a[contains(.,'New Request')]")
	private WebElement cntermNewRequestElement;
	
	
	
	@FindBy(xpath="//a[@title='Request a new workflow']")
	private WebElement cntermDefaultRequestElement;
	
	@FindBy(xpath="//a[normalize-space()='New Request']")
	private WebElement rblvapNewRequest;


	@FindBy(xpath="//a[@title='Search workflows of RBAU 8D Approval']")
	private WebElement searchRequestAp8d;



	/**
	 * @return the searchInput
	 */
	public WebElement getSearchInput() {
		return searchInput;
	}



	/**
	 * @param searchInput the searchInput to set
	 */
	public void setSearchInput(WebElement searchInput) {
		this.searchInput = searchInput;
	}



	/**
	 * @return the rbgaNewRequest
	 */
	public WebElement getRbgaNewRequest() {
		return rbgaNewRequest;
	}



	/**
	 * @param rbgaNewRequest the rbgaNewRequest to set
	 */
	public void setRbgaNewRequest(WebElement rbgaNewRequest) {
		this.rbgaNewRequest = rbgaNewRequest;
	}



	/**
	 * @return the rbgaSearchRequest
	 */
	public WebElement getRbgaSearchRequest() {
		return rbgaSearchRequest;
	}



	/**
	 * @param rbgaSearchRequest the rbgaSearchRequest to set
	 */
	public void setRbgaSearchRequest(WebElement rbgaSearchRequest) {
		this.rbgaSearchRequest = rbgaSearchRequest;
	}



	/**
	 * @return the apmazeNewRequest
	 */
	public WebElement getApmazeNewRequest() {
		return apmazeNewRequest;
	}



	/**
	 * @param apmazeNewRequest the apmazeNewRequest to set
	 */
	public void setApmazeNewRequest(WebElement apmazeNewRequest) {
		this.apmazeNewRequest = apmazeNewRequest;
	}



	/**
	 * @return the rbubkpaNewRequest
	 */
	public WebElement getRbubkpaNewRequest() {
		return rbubkpaNewRequest;
	}



	/**
	 * @param rbubkpaNewRequest the rbubkpaNewRequest to set
	 */
	public void setRbubkpaNewRequest(WebElement rbubkpaNewRequest) {
		this.rbubkpaNewRequest = rbubkpaNewRequest;
	}



	/**
	 * @return the stgaNewRequest
	 */
	public WebElement getStgaNewRequest() {
		return stgaNewRequest;
	}



	/**
	 * @param stgaNewRequest the stgaNewRequest to set
	 */
	public void setStgaNewRequest(WebElement stgaNewRequest) {
		this.stgaNewRequest = stgaNewRequest;
	}



	/**
	 * @return the emeaavgNewRequest
	 */
	public WebElement getEmeaavgNewRequest() {
		return emeaavgNewRequest;
	}



	/**
	 * @param emeaavgNewRequest the emeaavgNewRequest to set
	 */
	public void setEmeaavgNewRequest(WebElement emeaavgNewRequest) {
		this.emeaavgNewRequest = emeaavgNewRequest;
	}



	/**
	 * @return the apgaNewRequest
	 */
	public WebElement getApgaNewRequest() {
		return apgaNewRequest;
	}



	/**
	 * @param apgaNewRequest the apgaNewRequest to set
	 */
	public void setApgaNewRequest(WebElement apgaNewRequest) {
		this.apgaNewRequest = apgaNewRequest;
	}



	/**
	 * @return the amlacsaltrecolan
	 */
	public WebElement getAmlacsaltrecolan() {
		return amlacsaltrecolan;
	}



	/**
	 * @param amlacsaltrecolan the amlacsaltrecolan to set
	 */
	public void setAmlacsaltrecolan(WebElement amlacsaltrecolan) {
		this.amlacsaltrecolan = amlacsaltrecolan;
	}



	/**
	 * @return the ap8dNewRequestElement
	 */
	public WebElement getAp8dNewRequestElement() {
		return ap8dNewRequestElement;
	}



	/**
	 * @param ap8dNewRequestElement the ap8dNewRequestElement to set
	 */
	public void setAp8dNewRequestElement(WebElement ap8dNewRequestElement) {
		this.ap8dNewRequestElement = ap8dNewRequestElement;
	}



	/**
	 * @return the cntermNewRequestElement
	 */
	public WebElement getCntermNewRequestElement() {
		return cntermNewRequestElement;
	}



	/**
	 * @param cntermNewRequestElement the cntermNewRequestElement to set
	 */
	public void setCntermNewRequestElement(WebElement cntermNewRequestElement) {
		this.cntermNewRequestElement = cntermNewRequestElement;
	}



	/**
	 * @return the cntermDefaultRequestElement
	 */
	public WebElement getCntermDefaultRequestElement() {
		return cntermDefaultRequestElement;
	}



	/**
	 * @param cntermDefaultRequestElement the cntermDefaultRequestElement to set
	 */
	public void setCntermDefaultRequestElement(WebElement cntermDefaultRequestElement) {
		this.cntermDefaultRequestElement = cntermDefaultRequestElement;
	}



	/**
	 * @return the rblvapNewRequest
	 */
	public WebElement getRblvapNewRequest() {
		return rblvapNewRequest;
	}



	/**
	 * @param rblvapNewRequest the rblvapNewRequest to set
	 */
	public void setRblvapNewRequest(WebElement rblvapNewRequest) {
		this.rblvapNewRequest = rblvapNewRequest;
	}



	/**
	 * @return the searchRequestAp8d
	 */
	public WebElement getSearchRequestAp8d() {
		return searchRequestAp8d;
	}



	/**
	 * @param searchRequestAp8d the searchRequestAp8d to set
	 */
	public void setSearchRequestAp8d(WebElement searchRequestAp8d) {
		this.searchRequestAp8d = searchRequestAp8d;
	}
	
	
	
	
	
	
	
	
	
}
