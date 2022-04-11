package com.automationproject.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver orangeHRM = new ChromeDriver();

		orangeHRM.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		Thread.sleep(2000);
		orangeHRM.manage().window().maximize();

		Thread.sleep(2000);
		// orangeHRM.findElement(By.id("txtUsername")).sendKeys("Admin");

		WebElement usernametxtbox = orangeHRM.findElement(By.id("txtUsername"));
		usernametxtbox.sendKeys("Mohan");
		Thread.sleep(2000);
		usernametxtbox.clear();
		Thread.sleep(2000);
		usernametxtbox.sendKeys("Admin");

		WebElement passwordtxtbox = orangeHRM.findElement(By.name("txtPassword"));
		passwordtxtbox.sendKeys("Testing@123");
		Thread.sleep(2000);
		passwordtxtbox.clear();
		Thread.sleep(2000);
		passwordtxtbox.sendKeys("admin123");

		Thread.sleep(2000);
		orangeHRM.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		orangeHRM.close();

	}

}
