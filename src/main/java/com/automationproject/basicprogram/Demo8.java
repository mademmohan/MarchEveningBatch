package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo8 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login_field")).sendKeys("testing@gamil.com");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("testing123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.js-sign-in-button")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
