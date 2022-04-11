package com.automationproject.dropdownconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo4 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		Select oldoptions = new Select(driver.findElement(By.id("oldSelectMenu")));

		oldoptions.selectByIndex(2);

		WebElement selectedcolor = oldoptions.getFirstSelectedOption();
		System.out.println("Selected color  is::" + selectedcolor.getText());

		Thread.sleep(2000);

		driver.close();
	}

}
