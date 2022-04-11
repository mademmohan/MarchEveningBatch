package com.automationproject.webtablepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		List<WebElement>entiretable=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		for(WebElement table:entiretable) {
			System.out.println(table.getText());
		}
	}

}
