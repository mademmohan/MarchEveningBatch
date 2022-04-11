package com.automationproject.actionsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		//before that we need to create instance of actions class
		
		Actions action= new Actions(driver);
		
		WebElement submenu=driver.findElement(By.id("sub-menu"));
		
		WebElement googleoption=driver.findElement(By.xpath("//div[@class='dropdown-content']/a[2]"));
		
		action.moveToElement(submenu).moveToElement(googleoption).click().perform();
		
		Thread.sleep(2000);
		
		driver.navigate().back();// navigate chercher page
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		//.perform() this method is used to run our actions class
	}

}
