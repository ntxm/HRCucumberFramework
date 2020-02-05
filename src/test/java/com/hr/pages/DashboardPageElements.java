package com.hr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hr.bases.BaseClass;



public class DashboardPageElements {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLink;
	
	@FindBy(linkText = "Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText = "PIM")
	public WebElement PIMLink;
	
	@FindBy(linkText="Add Employee")
	public WebElement AddEmpLink;
	
	@FindBy(linkText="Employee List")
	public WebElement empList;
	
	@FindBy(linkText = "Recruitment")
	public WebElement recruitmentLink;
	
	@FindBy(linkText = "Candidates")
	public WebElement candidatesLink;
	
	@FindBy(linkText = "Reports")
	public WebElement reportsLink;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}
