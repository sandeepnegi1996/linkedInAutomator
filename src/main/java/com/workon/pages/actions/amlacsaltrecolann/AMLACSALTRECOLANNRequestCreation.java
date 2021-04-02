package com.workon.pages.actions.amlacsaltrecolann;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.workon.base.Page;
import com.workon.pages.locators.amlacsaltreclann.AMLACSALTRECOLANNRequestCreationLocators;
import com.workon.utilities.loggers.Log;

public class AMLACSALTRECOLANNRequestCreation extends Page {
	
	private AMLACSALTRECOLANNRequestCreationLocators amlacsal;

	//make the object 
	
	public AMLACSALTRECOLANNRequestCreation() {

		this.amlacsal = new AMLACSALTRECOLANNRequestCreationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);

		PageFactory.initElements(factory, this.amlacsal);

	}

	/*
	 * 1. click on the new request 
	 * 2. switch to the new tab
	 * 3. click on the first tab
	 * 4. Fill details
	 * 5. click on the second tab
	 * 6. Add the approver 
	 * 7. Submit details
	 * 
	 * 
	 */
	
	public void switchToAMLACSALTRECOLANNRequestCreation() throws InterruptedException {
		switchToAnyTab(driver,2);
	}

	public void clickOnFirstInnerTab() {
		click(amlacsal.getFirstTab());
	}
	
	
	//type the client
	
	public void typeClientInformation() {
		String clientInfo=prop.getProperty("clientInfo");
		
		
		//WebElement element = fluentWaitforElement(amlacsal.getClientElement(), 10, 5);
		
		type(amlacsal.getClientElement(),clientInfo);
	}
	
	//enter montante
	
	public void typeMontate() {
		String montateInfo=prop.getProperty("montateInfo");
		type(amlacsal.getMontateElement(),montateInfo);
		
	}
	
	//enter Commercials something is there
	public void typeCommercials() {
		String commercialInfo=prop.getProperty("commercialInfo");
		type(amlacsal.getCommercialElement(),commercialInfo);
	}
	
	
	//click on the second element workdlow
	//from the parent 
	
	
	//click on the approval button
	public void clickOnApprovalButton() {
		click(amlacsal.getApproverButtonElement());
	}
	
	
	
	
	

	public AMLACSALTRECOLANNRequestCreation addApprover(String ntid) {

		type(amlacsal.getEnterNtid(), ntid);
		action.sendKeys(Keys.chord(Keys.ENTER)).perform();
		click(amlacsal.getSelectNtid());
		return this;
	}

	
	
	public String displayRequestKeyAMLAC() {
		

			Log.info("=====================================");
			Log.info(driver.findElement(By.xpath("//b[contains(text(),'Chave:')]//parent::td//following-sibling::b//a")).getText());
			Log.info("======================================");
		
			return driver.findElement(By.xpath("//b[contains(text(),'Chave:')]//parent::td//following-sibling::b//a")).getText();
		
	}
	


}
