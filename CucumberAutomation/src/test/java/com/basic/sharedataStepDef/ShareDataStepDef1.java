package com.basic.sharedataStepDef;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class ShareDataStepDef1 {
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass share) {
		driver = share.setup();
	}
	
	@Then("^user checks first name \"([^\"]*)\" is present$")
	public void user_checks_first_name_is_present(String userFirstName) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_2_b")));
		String firstNameActual = driver.findElement(By.xpath("//*[@id=\"u_2_b\"]")).getAttribute("value");
		Assert.assertEquals(userFirstName, firstNameActual);
		Thread.sleep(1000);
	}
	
	@And("^user enters \"([^\"]*)\" surname$")
	public void user_enters_surname(String userSurname) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"u_2_d\"]")));
		driver.findElement(By.xpath("//*[@id=\"u_2_d\"]")).sendKeys(userSurname);
		Thread.sleep(1000);
	}
	
	@Then("^user mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		
		String mobileActual = driver.findElement(By.xpath("//*[@id=\"u_2_g\"]")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
}
