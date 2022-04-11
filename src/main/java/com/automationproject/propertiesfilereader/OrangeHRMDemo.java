package com.automationproject.propertiesfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDemo {
	Properties pr;
	
	WebDriver dr;

	public void dataload() throws IOException {

		String location = System.getProperty("user.dir");

		System.out.println(location);

		//File f = new File("C:\\Users\\gurum\\EveningBatch7PM\\AutomationProject\\src\\TestData\\credentials.properites");
		
		File f= new File(location+"\\src\\TestData\\credentials.properites");

		BufferedReader br = new BufferedReader(new FileReader(f));

		pr = new Properties();

		pr.load(br);

	}
	
	public void OrangeHRMLogin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		dr.get(pr.getProperty("URL"));
		
		Thread.sleep(2000);
		
		dr.findElement(By.name("txtUsername")).sendKeys(pr.getProperty("username"));
		
		Thread.sleep(2000);
		
		dr.findElement(By.name("txtPassword")).sendKeys(pr.getProperty("password"));
		
		Thread.sleep(2000);
		
		dr.findElement(By.name("Submit")).click();
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		OrangeHRMDemo demo = new OrangeHRMDemo();
		demo.dataload();// If we define any method as static those methods can be called directly with
						// object creation
		demo.OrangeHRMLogin();
	}
}
