package com.automationproject.webtablepractice;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
	
	public void webTableHandling(String value) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		//how we can xpath value as dynamic
		
		String path= "//td[text()='%s']/preceding-sibling::td[1]/input";//'%s' it accepts data at run time
		
		driver.findElement(By.xpath(String.format(path, value))).click();
		
		Thread.sleep(2000);
		
		String actualurl=driver.getCurrentUrl();
		
		/*
		 * String expectedurl= "https://www.olacabs.com/";
		 * 
		 * if(actualurl.equalsIgnoreCase(expectedurl)) {
		 * System.out.println("Clicked on expected link "+" "+"TestPass"); }
		 */
		
		Thread.sleep(3000);
		
		driver.close();
		
}
	public static void main(String[] args) throws InterruptedException {
		Demo4 ref= new Demo4();
		ref.webTableHandling("Jenkins");
	}

}
