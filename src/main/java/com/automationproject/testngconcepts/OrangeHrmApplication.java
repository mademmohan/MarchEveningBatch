package com.automationproject.testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmApplication {
	WebDriver driver;

	@Test (priority = 1)
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test (priority = 2)
	public void launchURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test (priority = 3)
	public void enterLoginDetails() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		// here i need to know is it successfully logged in or not
		          // here i'm going to implement asserstion for validation
		Thread.sleep(3000);
		String actual= driver.getCurrentUrl();
		String expected= "https://opensource-demo.orangehrmlive.com/index.php/dashbo";
		Assert.assertEquals(actual, expected, "Expected and actual url is not matched so i conclude its not logged");// if actual and expected is not matched then 
		//terminate this method and continue methods
		System.out.println("This is enterloginDetais methos");
		
	}
	
	/*
	 * @Test (priority = 4) public void verifyPageTitle() { String
	 * url=driver.getCurrentUrl(); String expected=
	 * "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	 * if(url.equalsIgnoreCase(expected)) { System.out.println("testpass"); } }
	 */
	
	@Test (priority = 5)
	public void verifyuser() {
		WebElement ref=driver.findElement(By.id("welcome"));
		System.out.println(ref.isDisplayed());
		System.out.println("test Passed");
	}
	
	@Test(priority = 6)
	public void logOff() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/a[.='Logout']")).click();
	}
	
	@Test(priority = 7)
	public void teardown() {
		driver.close();
	}

}
