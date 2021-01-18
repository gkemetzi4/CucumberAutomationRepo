package com.basic.multipleScenarioStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/multipleScenarioFeatFile/"},
		
		glue = {"com/basic/multipleScenarioStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-multipleScenario-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-multipleScenario.html"
		}
		
	)

public class RunMyMultipleScenarioTest {
	
	
}
