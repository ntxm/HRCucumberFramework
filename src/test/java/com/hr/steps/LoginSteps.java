package com.hr.steps;

import com.hr.utils.CommonMethods;
import com.hr.utils.FileReader;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    sendText(login.username, FileReader.getProperty("username"));
	    sendText(login.password, FileReader.getProperty("password"));
	    
	
	    
	}
	
	@When("User click on login button")
	public void user_click_on_login_button() {
	   login.loginBtn.click();
	}

	@Then("Dashboard should be opened")
	public void dashboard_should_be_opened() {
	    
		
	}

}
