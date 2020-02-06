package com.hr.steps;

import com.hr.bases.PageInitializer;
import com.hr.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethods{
	
	@Before
	public void startScenario(Scenario scenario) {
		System.out.println("=================================================");
		System.out.println(scenario.getName() + " is started!");
		System.out.println("=================================================");
		
		setUp();
		PageInitializer.initiliazeAllPages();
	}
	
	@After
	public void endScenario(Scenario scenario) {
		
		tearDown();
		System.out.println("=================================================");
		System.out.println(scenario.getName() + " is ended!");
		System.out.println("******** " + scenario.getStatus() + " ********");
		System.out.println("=================================================");
	}
	
	

}
