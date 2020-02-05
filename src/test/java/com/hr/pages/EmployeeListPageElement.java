package com.hr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hr.bases.BaseClass;


public class EmployeeListPageElement {
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td")
	public WebElement tableCell;
	
	public EmployeeListPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
