package com.automationproject.javascriptexecutorconcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
		
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/users/sign_in");
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('user_email_login').value='guru@gmail.com';");
		
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('user_password').value='Testing@123';");
		
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('user_submit').click();");
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
