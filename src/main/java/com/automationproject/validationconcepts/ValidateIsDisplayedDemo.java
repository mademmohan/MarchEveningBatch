package com.automationproject.validationconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateIsDisplayedDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement headername=driver.findElement(By.xpath("//h1[contains(text(),'Practice')]"));
		
		if(headername.isDisplayed()) {
			
			String headertext=headername.getText();
			System.out.println("Displayed text is ::"+headertext);
		}
		else
		{
			System.out.println("Unable to get text from header due to unavailabale");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
