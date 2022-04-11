package com.automationproject.actionsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		Actions action = new Actions(driver);
		
		WebElement doubleclick=driver.findElement(By.id("double-click"));
		
		action.doubleClick(doubleclick).perform();
		
		Alert alert=driver.switchTo().alert();
		
		 String alertmessage= alert.getText();
		 System.out.println("Double click message is ::"+alertmessage);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
