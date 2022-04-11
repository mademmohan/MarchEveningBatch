package com.automationproject.testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {
	
	WebDriver driver;

	@DataProvider(name = "test")
	public Object[][] testdata() {

		Object[][] data = new Object[2][2];// order should index based n-1= 2-1 =1 --> 0,1

		data[0][0] = "Admin";

		data[0][1] = "admin123";

		data[1][0] = "Admin";

		data[1][1] = "Test123";

		return data;

	}
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
	}
	
	@Test(dataProvider = "test")
	public void orangeHrmLogin(String username, String password) throws InterruptedException {
		
		System.out.println("User Name is ::"+username);
		System.out.println("Password is ::"+password);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		driver.findElement(By.id("txtPassword")).sendKeys(username);
		
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed(), "Expected welcome is not displayed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
