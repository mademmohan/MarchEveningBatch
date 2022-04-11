package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver orangeHRM= new ChromeDriver();
		
		orangeHRM.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(2000);
		orangeHRM.manage().window().maximize();
		
		Thread.sleep(2000);
		orangeHRM.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(2000);
		orangeHRM.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(2000);
		orangeHRM.findElement(By.className("button")).click();
		
		
		
	}

}
