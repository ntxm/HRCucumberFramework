package com.hr.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hr.bases.BaseClass;
import com.hr.utils.CommonMethods;



public class DashboardPageElements extends CommonMethods {
	
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
	
	@FindBy(linkText = "Performance")
	public WebElement perfomanceLink;
	
	@FindBy(linkText = "Configure")
	public WebElement configureLink;
	
	@FindBy(linkText = "KPIs")
	public WebElement kpiLink;
	
	@FindBy(xpath = "//div[@class='head']/h1")
	public WebElement headerOfDashboard;
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToKPI() {
		jsClick(perfomanceLink);
		jsClick(configureLink);
		jsClick(kpiLink);
	}
	

}
