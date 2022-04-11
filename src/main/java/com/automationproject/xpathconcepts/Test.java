package com.automationproject.xpathconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/flights/");

		Thread.sleep(2000);

		List<WebElement> goibibooptions = driver.findElements(By.xpath("//ul[@class='happy-nav']/li/a"));
		Thread.sleep(2000);

		for (WebElement option : goibibooptions) {
			System.out.println(option.getText());
		}

		Thread.sleep(2000);

		driver.close();
	}

}
