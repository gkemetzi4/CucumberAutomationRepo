package com.basic.multiStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/multiFeatFile/"},
		
		glue = {"com/basic/multiStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-multi-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-multi.html"
		}
		
	)

public class RunMultiTest {
	
	
}
