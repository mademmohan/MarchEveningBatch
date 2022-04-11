package com.automationproject.validationconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateisSelectedDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement bmwradiobutton=driver.findElement(By.id("bmwradio"));
		
		bmwradiobutton.click();
		
		Thread.sleep(2000);
		
		
		if(bmwradiobutton.isSelected()) {// true
			System.out.println("Radio button already selected");
		}
		else //False
		{
			bmwradiobutton.click();
			System.out.println("Now clicked on radio button");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
