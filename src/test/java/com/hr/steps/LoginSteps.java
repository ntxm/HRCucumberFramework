package com.hr.steps;



import com.hr.pages.LoginPageElements;
import com.hr.utils.CommonMethods;
import com.hr.utils.FileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	
	LoginPageElements log;


	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		log = new LoginPageElements();
	    log.username.sendKeys(FileReader.getProperty("username"));
	    log.password.sendKeys(FileReader.getProperty("password"));
	
	    
	}
	
	@When("User click on login button")
	public void user_click_on_login_button() {
	   log.loginBtn.click();
	}

	@Then("Dashboard should be opened")
	public void dashboard_should_be_opened() {
	    System.out.println("Done");
	}

}
