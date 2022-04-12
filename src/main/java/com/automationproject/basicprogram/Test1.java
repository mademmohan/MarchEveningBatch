package com.automationproject.basicprogram;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//delcared implcity 12 sec
		
		driver.get("https://www.saucedemo.com/");
		
		//1,2, stop
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//1,2,4,7,8,12 more than 12 sec fail 
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		  boolean condtion=driver.findElement(By.cssSelector("div>span.title")).isDisplayed();
		  
		  Assert.assertTrue(condtion, "Failed to login due to invalid credentails");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.cssSelector("div[id*='shopping']")).click();
		  
		  
		  Thread.sleep(2000);
		  
		  driver.close();
		
	     //assert.assertTrue(condtion, "unable to login")
	}

}
