package com.hr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hr.bases.BaseClass;


public class AddEmployeePageElements {
	
	
	@FindBy(id="employeeId")
	public WebElement personalEmpID;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;

	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	//constructor
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
