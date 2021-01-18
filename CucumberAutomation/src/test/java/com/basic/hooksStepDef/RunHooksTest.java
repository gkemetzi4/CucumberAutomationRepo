package com.basic.hooksStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/hooksFeatFile/"},
		
		glue = {"com/basic/hooksStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-hooks-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-hooks.html"
		}
		
	)

public class RunHooksTest {
	
	
}
