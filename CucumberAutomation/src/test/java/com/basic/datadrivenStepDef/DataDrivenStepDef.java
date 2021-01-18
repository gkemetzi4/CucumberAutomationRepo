package com.basic.datadrivenStepDef;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the FB login page$")
	public void user_is_on_the_FB_login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).click(); //cookie consent
		//Thread.sleep(4000);
		driver.findElement(By.id("u_0_2")).click(); //register button
	}
		
	@When("^user enters \"([^\"]*)\" first name$")
	public void user_enters_first_name(String firstname) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"u_2_b\"]")));
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		Thread.sleep(1000);
		
	}
	
	@Then("^user checks first name \"([^\"]*)\" is present$")
	public void user_checks_first_name_is_present(String firstname) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_2_b")));
		String firstNameActual = driver.findElement(By.xpath("//*[@id=\"u_2_b\"]")).getAttribute("value");
		Assert.assertEquals(firstname, firstNameActual);
		Thread.sleep(1000);
	}
	
	@And("^user enters \"([^\"]*)\" surname$")
	public void user_enters_surname(String surname) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"u_2_d\"]")));
		driver.findElement(By.xpath("//*[@id=\"u_2_d\"]")).sendKeys(surname);
		Thread.sleep(1000);
	}
	
	@Then("^user mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		
		String mobileActual = driver.findElement(By.xpath("//*[@id=\"u_2_g\"]")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("^close browser$")
	public void close_browser() {
		
		driver.quit();
		driver = null;
	}
	
}
