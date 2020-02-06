package com.hr.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
		, glue = "com.hr.steps"
		, dryRun = false
		, plugin = {"pretty", "html:target/html-reports/", "json:target/cucumber.json", "rerun:target/failed.txt" }
		, tags = {"@inProgress"}
		, monochrome = true
		)
public class InProcessRunner {
	
}
