package com.basic.tagsStepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		
		//dryRun = true,
		
		//tags = {"@Important"}, //all scenarios executed, as this tag is used for the whole feature (see feature file)
		//tags = {"@Smoke"}, //only scenarios with this tag will be executed (see feature file)
		//tags = {"@Smoke", "@Regression"}, //AND condition, both tags have to be there
		tags = {"@Smoke, @Regression"}, //OR condition, either tag in there works
		
		features = {"src/test/resources/com/basic/tagsFeatFile/"},
		
		glue = {"com/basic/tagsStepDef/"},
		
		plugin = {
								"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-tags-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-tags.html"
		}
		
	)

public class RunTagsTest {
	
	
}
