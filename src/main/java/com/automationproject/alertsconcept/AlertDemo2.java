package com.automationproject.alertsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts/");

		Thread.sleep(2000);

		WebElement button = driver.findElement(By.id("promtButton"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].click();", button);

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("MR Training Institute in Hyderabad");

		alert.accept();

		Thread.sleep(2000);

		driver.close();
	}

}
