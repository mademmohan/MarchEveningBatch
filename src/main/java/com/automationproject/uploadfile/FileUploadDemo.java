package com.automationproject.uploadfile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebElement uploadbtn = driver.findElement(By.xpath("//input[@id='uploadfile']"));

		Actions action = new Actions(driver);
		action.moveToElement(uploadbtn).perform();

		Thread.sleep(4000);

		uploadbtn.sendKeys("C:\\Users\\gurum\\Desktop\\Ankit\\photo.jpg");

		File fi = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\gurum\\EveningBatch7PM\\AutomationProject\\src\\ScreenshotLocation\\upload.jpg");

		FileUtils.copyFile(fi, destination);
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
