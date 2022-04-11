package com.automationproject.radioandcheckboxvalidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckBoxDemo2 {

	WebDriver driver;// This is called class level variables, this can be used in any methods

	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");

	}

	public void radioValidation(String car) {
		
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//div[@id='radio-btn-example']//label/input"));
		
		for(WebElement carlist:radiobuttons) {
			
			if(carlist.getAttribute("value").equalsIgnoreCase(car)) {// True
				 carlist.click();
			}
		}
	}
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		RadioButtonCheckBoxDemo2 ref= new RadioButtonCheckBoxDemo2();// To call the methods in specific class.
		
		ref.setup();
		
		ref.radioValidation("benz");
		ref.tearDown();

	}

}
