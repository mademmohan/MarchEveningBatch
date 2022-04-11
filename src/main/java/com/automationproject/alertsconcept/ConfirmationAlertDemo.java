package com.automationproject.alertsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.name("confirmation")).click();
		
		Alert ref=driver.switchTo().alert();
		
		String messageinalert=ref.getText();
		
		System.out.println("Message in alert ::"+messageinalert);
		
		ref.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
