package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassOne {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.orangehrm.com/");

		Actions action = new Actions(driver);

		// Mouse hover menuOption 'About US'
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Company']"))).build().perform();

		driver.findElement(
				By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[contains(text(),'About Us')]"))
				.click();

		/* this is the login functionality */

		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * 
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * Thread.sleep(2000); driver.findElement( By.
		 * xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'] "
		 * )) .click(); Thread.sleep(4000);
		 */

		Thread.sleep(4000);
		//driver.close();

	}

}
