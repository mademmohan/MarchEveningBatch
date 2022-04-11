package com.automationproject.dropdownconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo2 {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		Thread.sleep(2000);

		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));

		Thread.sleep(2000);

		Select productslist = new Select(products);// instance or objects creation for select class

		productslist.selectByIndex(2);

		Thread.sleep(2000);
		
		productslist.selectByVisibleText("Bing");
		
		Thread.sleep(2000);
		
		productslist.selectByValue("Yahoo");
		
		Thread.sleep(3000);

		driver.close();
	}

}
