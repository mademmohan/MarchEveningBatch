package com.automationproject.dropdownconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectClassDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		WebElement testingtypes=driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
		
		Thread.sleep(2000);
		
		Select testing= new Select(testingtypes);
		
		Thread.sleep(2000);
		
		testing.selectByIndex(1);
		
		Thread.sleep(2000);
		
		testing.selectByValue("msselenium");
		
		Thread.sleep(2000);
		
		 List<WebElement> testingcourses= testing.getAllSelectedOptions();
		 
		 System.out.println("Selected Options are ::");
		 
		 for(WebElement courses:testingcourses) {
			 
			 System.out.println(courses.getText());
		 }
		 
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		  
	}

}
