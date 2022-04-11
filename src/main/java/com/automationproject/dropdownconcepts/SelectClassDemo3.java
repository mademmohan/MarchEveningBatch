package com.automationproject.dropdownconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo3 {

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

		List<WebElement> allproducts = productslist.getOptions();

		// Now my requirement is print all options by using for each loop i'm going
		// print

		for (WebElement product : allproducts) {

			System.out.println(product.getText());
		}

		Thread.sleep(2000);
		driver.close();

	}

}
