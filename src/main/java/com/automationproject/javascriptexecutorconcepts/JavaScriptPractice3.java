package com.automationproject.javascriptexecutorconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPractice3 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		WebElement scrolltext=driver.findElement(By.xpath("//h3[.='About Us']"));
		
		JavascriptExecutor java= ((JavascriptExecutor)driver);
		
		java.executeScript("arguments[0].scrollIntoView();", scrolltext);
		
		Thread.sleep(3000);
		
		System.out.println(scrolltext.getText());
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
