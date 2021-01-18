package com.basic.parameterizationStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/parameterizationFeatFile/"},
		
		glue = {"com/basic/parameterizationStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-parameterization-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-parameterization.html"
		}
		
	)

public class RunParameterizationTest {
	
	
}
