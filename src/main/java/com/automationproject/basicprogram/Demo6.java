package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String logotext=driver.findElement(By.tagName("h1")).getText();
		
		Thread.sleep(2000);
		System.out.println(logotext);
		
		Thread.sleep(2000);
		driver.close();
	}

}
