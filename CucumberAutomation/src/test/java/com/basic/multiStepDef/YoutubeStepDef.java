package com.basic.multiStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class YoutubeStepDef {
	
WebDriver driver = null;
	
	@Given("^user is on the youtube page$")
	public void user_is_on_the_youtube_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("style-scope yt-button-renderer style-text size-small")));
		driver.findElement(By.className("style-scope yt-button-renderer style-text size-small")).click();
		Thread.sleep(1000);
	}
	
	@When("^user enters search video string$")
	public void user_enters_search_video_string() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("zoro buzz edo stathera");
		Thread.sleep(1000);
	}

}
