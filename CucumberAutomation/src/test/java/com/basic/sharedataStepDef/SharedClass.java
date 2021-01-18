package com.basic.sharedataStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	@After
	public void closeBrowser() {
		if(driver != null) {
		driver.quit();
		driver = null;
		}
	}
}