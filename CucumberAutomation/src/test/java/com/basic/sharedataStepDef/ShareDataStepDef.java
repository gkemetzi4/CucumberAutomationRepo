package com.basic.sharedataStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) {
		driver = share.setup();
	}
	
	@Given("^user is on the FB login page$")
	public void user_is_on_the_FB_login_page() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).click(); //cookie consent
		//Thread.sleep(4000);
		driver.findElement(By.id("u_0_2")).click(); //register button
	}
		
	@When("^user enters \"([^\"]*)\" first name$")
	public void user_enters_first_name(String userFirstName) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"u_2_b\"]")));
		driver.findElement(By.name("firstname")).sendKeys(userFirstName);
		Thread.sleep(1000);
		
	}
	
}
