package com.workon.pages.locators.emeaavg;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EMEAAVGRequestCreationLocators {
	
	
	@FindBy(xpath="//span[contains(text(),'Reason for Admin Access*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//textarea[contains(@class,'textarea')]")
    private WebElement reasonAdminAcess;
	
	
	
	
	//span[contains(text(),'System type*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select
	
	@FindBy(xpath="//span[contains(text(),'System type*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    private WebElement systemTypeOption;
	
	
	@FindBy(xpath="//span[contains(text(),'Region*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    private WebElement regionOption;
	
	
	@FindBy(xpath="//span[contains(text(),'Type of Request*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//select")
    private WebElement typeOfRequestOption;
	
	
	@FindBy(xpath="//span[contains(text(),'System Name(s)*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
    private WebElement systemName;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Domain\\Account Name  Domain\\Group Name*')]//parent::label[@class='rb_WorkON_LabelArea']//following-sibling::div[contains(@class,'rb_WorkON_FieldValueArea rb_WorkON_FieldValueArea_create')]//input")
    private WebElement domainAccountName;
	

	
	//add the department
	
	
	@FindBy(xpath="//div[contains(@class,'WorkOnCls-UserPicker-PickTrigger')]")
    private List<WebElement> departmentManagerCost;
	
	//add the approver
	
	//clear the approval list
	
	@FindBy(xpath="//button[contains(text(),'Clear approval list')]")
	private List<WebElement> clearApprovalList;
	
	
	
	
	//add an approver 
	
	
	@FindBy(xpath="//button[contains(text(),'Add an approver')]")
	private  List<WebElement> approverBtn;
	
	
	@FindBy(css="#NameFilterField")
	private WebElement enterNtid;
	
	@FindBy(xpath="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-name')]")
	private WebElement selectNtid;

	/**
	 * @return the reasonAdminAcess
	 */
	public WebElement getReasonAdminAcess() {
		return reasonAdminAcess;
	}

	/**
	 * @param reasonAdminAcess the reasonAdminAcess to set
	 */
	public void setReasonAdminAcess(WebElement reasonAdminAcess) {
		this.reasonAdminAcess = reasonAdminAcess;
	}

	/**
	 * @return the systemTypeOption
	 */
	public WebElement getSystemTypeOption() {
		return systemTypeOption;
	}

	/**
	 * @param systemTypeOption the systemTypeOption to set
	 */
	public void setSystemTypeOption(WebElement systemTypeOption) {
		this.systemTypeOption = systemTypeOption;
	}

	/**
	 * @return the regionOption
	 */
	public WebElement getRegionOption() {
		return regionOption;
	}

	/**
	 * @param regionOption the regionOption to set
	 */
	public void setRegionOption(WebElement regionOption) {
		this.regionOption = regionOption;
	}

	/**
	 * @return the typeOfRequestOption
	 */
	public WebElement getTypeOfRequestOption() {
		return typeOfRequestOption;
	}

	/**
	 * @param typeOfRequestOption the typeOfRequestOption to set
	 */
	public void setTypeOfRequestOption(WebElement typeOfRequestOption) {
		this.typeOfRequestOption = typeOfRequestOption;
	}

	/**
	 * @return the systemName
	 */
	public WebElement getSystemName() {
		return systemName;
	}

	/**
	 * @param systemName the systemName to set
	 */
	public void setSystemName(WebElement systemName) {
		this.systemName = systemName;
	}

	/**
	 * @return the domainAccountName
	 */
	public WebElement getDomainAccountName() {
		return domainAccountName;
	}

	/**
	 * @param domainAccountName the domainAccountName to set
	 */
	public void setDomainAccountName(WebElement domainAccountName) {
		this.domainAccountName = domainAccountName;
	}

	/**
	 * @return the departmentManagerCost
	 */
	public List<WebElement> getDepartmentManagerCost() {
		return departmentManagerCost;
	}

	/**
	 * @param departmentManagerCost the departmentManagerCost to set
	 */
	public void setDepartmentManagerCost(List<WebElement> departmentManagerCost) {
		this.departmentManagerCost = departmentManagerCost;
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

	/**
	 * @return the clearApprovalList
	 */
	public List<WebElement> getClearApprovalList() {
		return clearApprovalList;
	}

	/**
	 * @param clearApprovalList the clearApprovalList to set
	 */
	public void setClearApprovalList(List<WebElement> clearApprovalList) {
		this.clearApprovalList = clearApprovalList;
	}

	/**
	 * @return the approverBtn
	 */
	public List<WebElement> getApproverBtn() {
		return approverBtn;
	}

	/**
	 * @param approverBtn the approverBtn to set
	 */
	public void setApproverBtn(List<WebElement> approverBtn) {
		this.approverBtn = approverBtn;
	}
	



	

	
	
	
}
