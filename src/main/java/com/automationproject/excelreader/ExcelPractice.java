package com.automationproject.excelreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelPractice {
	
	@DataProvider(name = "test")
	public Object[][] getData() throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\gurum\\Desktop\\Evening\\TestData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sh = wb.getSheet("Data");

		int noofrows = sh.getPhysicalNumberOfRows();// this will number of active rowss

		int noofcolumns = sh.getRow(0).getLastCellNum(); // last used cell of the excel

		Object[][] data = new Object[noofrows][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {// i loop read row data 1

			for (int j = 0; j < noofcolumns; j++) {// j loop read columndata all time
				DataFormatter format = new DataFormatter();
				data[i][j] = format.formatCellValue(sh.getRow(i + 1).getCell(j));
			}

		}
		wb.close();
		fi.close();

		return data;

	}
	
	@Test(dataProvider = "test")
	public void sauceDemoLogin(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-test= 'username']")).sendKeys(username);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-test= 'password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@data-test= 'login-button']")).click();
		
		//assertions are used to verfiy the conditon
		
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='title']")).isDisplayed(), "Failed to login");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
