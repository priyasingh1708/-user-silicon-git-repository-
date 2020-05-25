package com.Bewakoof.BewakoofProject;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {
	
	
	
	 WebDriver driver;


	@Given("I launch the application")

	public void I_launch_the_application() throws InterruptedException, AWTException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","/Users/silicon/Documents/selenium/chromedriver");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(3000);
		String at = driver.getTitle();
          System.out.println("Title of page is "+at);
		Boolean Enable = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/header/div/div/div/a/img[1]")).isEnabled();
		System.out.println("Bewakoof Title is Enabled on page:"+Enable);	
		
		
	}


	@Then("I enter correct username and password")

	public void I_enter_correct_username_and_password() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("loginLink")).click();
		driver.findElement(By.id("mob_email_id")).sendKeys("priyanka.singh@bewakoof.com");
		driver.findElement(By.id("mob_continue_submit")).click();
	    driver.findElement(By.name("password")).sendKeys("pihu123456");
		driver.findElement(By.className("loginSubmit")).click();
		driver.findElement(By.className("icon_user")).click();
		driver.close();
		
		

	}
  

}
