package com.basic.datadrivenStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/datadrivenFeatFile/"},
		
		glue = {"com/basic/datadrivenStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-dataDriven-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-dataDriven.html"
		}
		
	)

public class RunDataDrivenTest {
	
	
}
