package com.workon.pages.locators.amlacsaltreclann;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMLACSALTRECOLANNRequestCreationLocators {
	
	
	@FindBy(xpath="//a[text()='Informações Gerais']")
	private WebElement firstTab;
	
	
	


	@FindBy(xpath="//span[contains(text(),'* Cliente')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	private WebElement clientElement;


	@FindBy(xpath="//span[contains(text(),'* Montante')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//input")
	private WebElement montateElement;
	
	

	@FindBy(xpath="//span[contains(text(),'* Comentários')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[@class='rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create ']//textarea")
	private WebElement commercialElement;
	
	@FindBy(xpath="//button[text()='Adicionar um aprovador']")
	private WebElement approverButtonElement;
	
	@FindBy(css = "#NameFilterField")
	private WebElement enterNtid;

	@FindBy(xpath = "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;

	/**
	 * @return the firstTab
	 */
	public WebElement getFirstTab() {
		return firstTab;
	}

	/**
	 * @param firstTab the firstTab to set
	 */
	public void setFirstTab(WebElement firstTab) {
		this.firstTab = firstTab;
	}

	/**
	 * @return the clientElement
	 */
	public WebElement getClientElement() {
		return clientElement;
	}

	/**
	 * @param clientElement the clientElement to set
	 */
	public void setClientElement(WebElement clientElement) {
		this.clientElement = clientElement;
	}

	/**
	 * @return the montateElement
	 */
	public WebElement getMontateElement() {
		return montateElement;
	}

	/**
	 * @param montateElement the montateElement to set
	 */
	public void setMontateElement(WebElement montateElement) {
		this.montateElement = montateElement;
	}

	/**
	 * @return the commercialElement
	 */
	public WebElement getCommercialElement() {
		return commercialElement;
	}

	/**
	 * @param commercialElement the commercialElement to set
	 */
	public void setCommercialElement(WebElement commercialElement) {
		this.commercialElement = commercialElement;
	}

	/**
	 * @return the approverButtonElement
	 */
	public WebElement getApproverButtonElement() {
		return approverButtonElement;
	}

	/**
	 * @param approverButtonElement the approverButtonElement to set
	 */
	public void setApproverButtonElement(WebElement approverButtonElement) {
		this.approverButtonElement = approverButtonElement;
	}

	/**
	 * @return the enterNtid
	 */
	public WebElement getEnterNtid() {
		return enterNtid;
	}

	/**
	 * @param enterNtid the enterNtid to set
	 */
	public void setEnterNtid(WebElement enterNtid) {
		this.enterNtid = enterNtid;
	}

	/**
	 * @return the selectNtid
	 */
	public WebElement getSelectNtid() {
		return selectNtid;
	}

	/**
	 * @param selectNtid the selectNtid to set
	 */
	public void setSelectNtid(WebElement selectNtid) {
		this.selectNtid = selectNtid;
	}
	

}
