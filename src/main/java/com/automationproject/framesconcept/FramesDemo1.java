package com.automationproject.framesconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo1 {
	
	WebDriver driver;
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	public void framesHanding() throws InterruptedException {
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement textboxarea=driver.findElement(By.className("frmTextBox"));
		
		Thread.sleep(2000);
		
		textboxarea.sendKeys("MR Training");
		
		WebElement frame1=driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame(frame1);
		
		Select courses= new Select(driver.findElement(By.id("course")));
		
		courses.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		
		textboxarea.clear();
		
		Thread.sleep(2000);
		
		textboxarea.sendKeys("MR Training Hydearbad");
		
		Thread.sleep(2000);
		
		}
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		FramesDemo1 frames= new FramesDemo1();
		frames.setUp();
		frames.framesHanding();
		frames.teardown();
	}

}
