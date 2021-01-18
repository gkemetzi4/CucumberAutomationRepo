package com.basic.datatableStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/datatableFeatFile/"},
		
		glue = {"com/basic/datatableStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-dataTable-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-dataTable.html"
		}
		
	)

public class RunDataTableTest {
	
	
}
