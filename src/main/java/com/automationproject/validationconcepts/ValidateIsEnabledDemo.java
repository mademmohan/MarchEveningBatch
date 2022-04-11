package com.automationproject.validationconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateIsEnabledDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement createbutton=driver.findElement(By.xpath("//a[.='Create New Account']"));
		Thread.sleep(2000);
		
		
		if(createbutton.isEnabled()) {// true
			createbutton.click();
			System.out.println("Successfully clicked on create button");
		}
		else  // false
		{
			System.out.println("Create button is not enabled");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
