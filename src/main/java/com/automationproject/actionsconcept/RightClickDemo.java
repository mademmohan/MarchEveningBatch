package com.automationproject.actionsconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightclickbutton = driver.findElement(By.xpath("//span[.='right click me']"));

		WebElement cutoption = driver.findElement(By.xpath("//span[.='Cut']"));

		Actions act = new Actions(driver);

		act.contextClick(rightclickbutton).moveToElement(cutoption).click().perform();
		
		Alert alt=driver.switchTo().alert();
		
		String alertmessage=alt.getText();
		
		System.out.println(alertmessage);
		
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
