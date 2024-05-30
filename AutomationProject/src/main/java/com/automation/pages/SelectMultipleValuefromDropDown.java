package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleValuefromDropDown {

	// How to select multiple values from a dropdown in Selenium?

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();*/
		
	/*	WebDriverManager.iedriver().setup();
		WebDriver driver2 = new InternetExplorerDriver();
		driver.manage().window().maximize();*/
		
		
		
		
		

		driver.get("https://demoqa.com/select-menu");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)");

		Select select = new Select(driver.findElement(By.name("cars")));

		if (select.isMultiple()) {

			// all the select -working fine
			select.selectByIndex(0);
			select.selectByValue("opel");
			select.selectByVisibleText("Audi");
		}

		Thread.sleep(2000);
		// de select the value
		// Note- all the select method using for Deselct as well.like
		// deselectbyvalue(),deselectbyindex(),deselectbyvisibletext()
		select.deselectByValue("opel");

	}

}
