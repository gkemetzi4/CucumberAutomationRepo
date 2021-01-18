package com.basic.backgroundStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/backgroundFeatFile/"},
		
		glue = {"com/basic/backgroundStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-backgroundtest-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-background.html"
		}
		
	)

public class RunBackgroundTest {
	
	
}
