package com.automationproject.actionsconcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyBoardActionsDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions action= new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		
		//Note: Without perform() method actions class won't get executed
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
