package com.hr.steps;

import org.junit.Assert;

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

	@Then("Should be opened {string} page")
	public void should_be_opened_page(String title) {
	    
	    Assert.assertEquals("Header message NOT matched", title, dashboard.headerOfDashboard.getText());
		
	}

}
