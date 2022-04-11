package com.automationproject.dropdownconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectClassDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement foodoptions=driver.findElement(By.xpath("//select[@id='second']"));
		
		Select fooditem= new Select(foodoptions);
		
		Thread.sleep(2000);
		
		fooditem.selectByIndex(0);
		
		Thread.sleep(2000);
		
		fooditem.selectByVisibleText("Bonda");
		
		Thread.sleep(2000);
		
		fooditem.selectByValue("burger");
		
		Thread.sleep(2000);
		
		
		
		
		fooditem.deselectByIndex(3);
		
		Thread.sleep(2000);
		
		fooditem.deselectAll();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
