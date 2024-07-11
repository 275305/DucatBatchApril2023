package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassExample {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)");
					
		Select select=new Select(driver.findElement(By.name("country")));
		select.selectByIndex(107);
		
		      //select by visible text-working fine
		      //select.selectByVisibleText("AMERICAN SAMOA");
		      // select by value - working fine
		      //select.selectByValue("ANGOLA");
		      
		      // select by index-working fine
		      select.selectByIndex(107);
		
		
	}

}
