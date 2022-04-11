package com.automationproject.validationconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateIsEnabledDemo2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://github.com/password_reset");
		
		Thread.sleep(2000);
		
		WebElement sendpassword_btn=driver.findElement(By.xpath("//input[@value='Send password reset email']"));
		Thread.sleep(2000);
		
		
		if(sendpassword_btn.isEnabled()) {// true
			sendpassword_btn.click();
			System.out.println("Successfully clicked on send password button");
		}
		else  // false
		{
			System.out.println("Send Password button is not enabled in page");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
