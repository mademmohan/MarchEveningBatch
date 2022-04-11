package com.automationproject.webtablepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		
		
		
		driver.findElement(By.xpath("//td[text()='Amazon']/following-sibling::td[3]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
