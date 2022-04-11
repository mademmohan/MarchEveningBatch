package com.automationproject.radioandcheckboxvalidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckBoxDemo3 {
	
	WebDriver driver;
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
	}
	
	public void validateCheckBox(String carcheckbox) {
		
		List<WebElement> carslist=driver.findElements(By.xpath("//div[@id='checkbox-example-div']//input[@type='checkbox']"));
		
		for(WebElement cars:carslist) {
			if(cars.getAttribute("value").equals(carcheckbox)) {
				cars.click();
				break;
			}
			
		}
	}
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		RadioButtonCheckBoxDemo3 ref1= new RadioButtonCheckBoxDemo3();
		
		ref1.setUp();
		ref1.validateCheckBox("benz");
		Thread.sleep(3000);
		ref1.validateCheckBox("honda");
		ref1.tearDown(); // If any method throw an excpetion, then automatically we need handle while calling in main method
	}

}
