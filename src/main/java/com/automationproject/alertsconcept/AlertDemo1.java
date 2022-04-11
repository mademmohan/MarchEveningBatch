package com.automationproject.alertsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts/");

		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		Thread.sleep(2000);

		driver.close();
	}

}
