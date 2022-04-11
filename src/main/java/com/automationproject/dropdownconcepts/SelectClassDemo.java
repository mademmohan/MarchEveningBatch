package com.automationproject.dropdownconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		Thread.sleep(2000);

		WebElement animals = driver.findElement(By.id("animals"));

		Thread.sleep(2000);

		Select animalslist = new Select(animals);

		animalslist.selectByIndex(2);

		Thread.sleep(2000);

		animalslist.selectByVisibleText("Avatar");

		Thread.sleep(2000);

		animalslist.selectByValue("cat");

		WebElement animalselected = animalslist.getFirstSelectedOption();

		System.out.println("Animal selected is ::" + animalselected.getText());

		Thread.sleep(3000);

		driver.close();
	}

}
