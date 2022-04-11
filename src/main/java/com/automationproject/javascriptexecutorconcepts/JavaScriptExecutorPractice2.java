package com.automationproject.javascriptexecutorconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice2 {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
		
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
	    WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	    
	    WebElement submitbtn= driver.findElement(By.xpath("//input[@name='Submit']"));
		
		js.executeScript("arguments[0].value='Admin';", username);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].value='admin123';", password);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click();", submitbtn);
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
