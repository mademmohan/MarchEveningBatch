package com.automationproject.radioandcheckboxvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckBoxDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement hondaradiobutton=driver.findElement(By.id("hondaradio"));
		
		Thread.sleep(2000);
		
		//hondaradiobutton.click();// This method will click on honda radio button 
		
		if(!hondaradiobutton.isSelected()) {// if honda radio button  is not selected //false
			
			System.out.println("Honda Radio button is not selected");
			hondaradiobutton.click();
			
			System.out.println("Honda Radio button is selected successfully");
		}
		else {
			System.out.println("Sorry...! its already selected");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
