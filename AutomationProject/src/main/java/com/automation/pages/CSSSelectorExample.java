package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		// for Chrome driver
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.tagName("a")).click();
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("abcd");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#APjFqb")).clear();
		
		driver.close();
		
		
		// for firefox driver
		
		
	/*	WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		      driver.get("https://www.google.com");
		*/
		
		
	}

}
