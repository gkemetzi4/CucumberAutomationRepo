package com.basic.sharedataStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/sharedataFeatFile/"},
		
		glue = {"com/basic/sharedataStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-shareData-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-shareData.html"
		}
		
	)

public class RunShareDataTest {
	
	
}
