package com.automationproject.basicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitywait {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);// This will be applicable for entire webdriver
		
		driver.get("https://www.saucedemo.com/");
		
		
	  driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//1,2,4,7,8,12 more than 12 sec fail 
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		  boolean condtion=driver.findElement(By.cssSelector("div>span.title")).isDisplayed();
		  
		  Assert.assertTrue(condtion, "Failed to login due to invalid credentails");
		  
		  Thread.sleep(2000);
		  
		  WebElement cartsymbol=driver.findElement(By.cssSelector("div[id*='shopping']"));
		  
		  WebDriverWait wait= new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOfAllElements(cartsymbol));
		  
		  cartsymbol.click();
		  
		  
		  
		  
		  Thread.sleep(2000);
		  
		  driver.close();
		
		
	}

}
