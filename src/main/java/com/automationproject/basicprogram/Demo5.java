package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create an")).click();
		
		
		
		Thread.sleep(2000);// using this we can stop the execution time of code upto 2000 (2sec), 5000(5s)
		
		driver.close();
	}

}
