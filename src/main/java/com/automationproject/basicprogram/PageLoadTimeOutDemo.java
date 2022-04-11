package com.automationproject.basicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOutDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// If my application takes more than 3 sec to load then it fail
		
		driver.get("https://www.hdfcbank.com/");
		
	    String pagetitle=driver.getTitle();
	    
	     String pageurl=driver.getCurrentUrl();
		
		System.out.println("This page title is :: "+pagetitle);
		
		System.out.println("This page url is ::"+pageurl);
		
		Thread.sleep(2000);
		
		//driver.close();
	}

}
