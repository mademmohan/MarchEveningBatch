package com.automationproject.mypersonal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	Properties pr;
	
	public void readData() throws IOException {
		
		String projectlocation= System.getProperty("user.dir");
		
		
		System.out.println(projectlocation);
		
		File f= new File(projectlocation+"\\src\\TestData\\cc.properties");
		
		BufferedReader br= new BufferedReader(new FileReader(f));
		
		 pr= new Properties();
		
		pr.load(br);
		
		System.out.println(pr.getProperty("URL"));
		
	}
	
	public void orangeHRMLogin() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
		 pr.getProperty("username");
	}
	
	public static void main(String[] args) throws IOException {
		Testing test= new Testing();
		test.readData();
	}

}
