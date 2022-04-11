package com.automationproject.excelreader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	//my req i want to run paricular method with multiple number time
	   // In testNG with the help of invocation count we can achive this
	
	@org.testng.annotations.Test(invocationCount = 10)
	public void googlePage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
