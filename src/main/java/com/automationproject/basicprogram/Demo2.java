package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();// will set required browser version for automation
		
		WebDriver driver= new ChromeDriver();// this is instance for webdriver to implement all methods of webdriver into 
		                                      //chromebrowser class
		driver.get("https://github.com/login");
		
		//maximize of window
		Thread.sleep(2000);// wait for 2 sec
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000); //wait for 2 sec
		
		driver.findElement(By.id("login_field")).sendKeys("mademguru");
		
		Thread.sleep(2000); //wait for 2 sec
		
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("commit")).click();
		
	}

}
