package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Monitor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the FB login page$")
	public void user_is_on_the_FB_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).click();
		driver.findElement(By.id("u_0_2")).click();
	}
		
	@When("^user enters first name$")
	public void user_enters_first_name() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_2_b")));
		driver.findElement(By.name("firstname")).sendKeys("George");
		
	}
	
	@Then("^user checks first name is present$")
	public void user_checks_first_name_is_present() {
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_2_b")));
		String firstNameActual = driver.findElement(By.xpath("//*[@id=\"u_2_b\"]")).getAttribute("value");
		Assert.assertEquals("George", firstNameActual);
	}
}
