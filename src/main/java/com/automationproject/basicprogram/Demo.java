package com.automationproject.basicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	//we need to write the logics inside method or main method
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();// This will automatically downlaod requried verison of chromebrowse in back end
		
		WebDriver driver= new ChromeDriver(); //this will open empty browser
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		
	}

}
