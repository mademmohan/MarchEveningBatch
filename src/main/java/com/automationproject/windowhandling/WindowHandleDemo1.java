package com.automationproject.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo1 {

	WebDriver driver;

	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");

	}

	public void windowHandling() throws InterruptedException {

		String parentwindow = driver.getWindowHandle();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='Register']")).click();

		Set<String> allwindows = driver.getWindowHandles();

		// we need to loop the windows and then get title and compare and

		for (String window : allwindows) {// iterating 

			driver.switchTo().window(window); // first window

			if (driver.getCurrentUrl().equals("https://www.naukri.com/registration/createAccount?othersrcp=22636")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("MR Training");
			}
		}
		Thread.sleep(2000);

		driver.switchTo().window(parentwindow);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		Thread.sleep(2000);
	}
	
	public void tearDown() {
		
		//driver.close();// This close method is used to close only active
		
		driver.quit();// This method will close all windows to current session
	}

	public static void main(String[] args) throws InterruptedException {

		WindowHandleDemo1 demo1 = new WindowHandleDemo1();
		// classname ref= new classname();

		demo1.setUp();
		demo1.windowHandling();
		
		demo1.tearDown();
	}

}
