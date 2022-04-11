package com.automationproject.actionsconcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		
		Actions action= new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.CANCEL).perform();
		
        Thread.sleep(2000);
		
		action.sendKeys(Keys.SPACE).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		driver.close();
		       
	}

}
