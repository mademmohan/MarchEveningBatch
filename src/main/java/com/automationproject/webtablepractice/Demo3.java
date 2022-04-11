package com.automationproject.webtablepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	public static void webTableHandle(String text) {
		String value= "//td[.='%s']/following-sibling::td[3]";// parameter
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		driver.findElement(By.xpath(String.format(value, text))).click();
	}
	
	public static void webTable(String param) {
		String value1= "//td[.='Jeff Bezos']/preceding-sibling::td[2]/input";// parameter
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		driver.findElement(By.xpath(String.format(value1, param))).click();
	}
	
	public static void main(String[] args) {
		//webTableHandle("Ola");
		webTable("Sun microsystems");
		
		
	}

}
