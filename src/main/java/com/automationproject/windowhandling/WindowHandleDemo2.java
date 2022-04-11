package com.automationproject.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo2 {

	WebDriver driver;

	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	public void windowHandingConcept() throws InterruptedException {

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.id("newWindowsBtn")).click();

		Set<String> allwindows = driver.getWindowHandles();

		for (String window : allwindows) {
			driver.switchTo().window(window);

			if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {

				driver.manage().window().maximize();

				driver.findElement(By.id("firstName")).sendKeys("MR Training");

				Thread.sleep(2000);
			}

		}
		driver.switchTo().window(parentwindow);

		driver.findElement(By.id("name")).sendKeys("Entered into parent window");

		Thread.sleep(2000);

	}

	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// By using object creation of a particular class we can achive

		WindowHandleDemo2 ref = new WindowHandleDemo2();
		ref.setUp();
		ref.windowHandingConcept();
		ref.tearDown();
	}
}
