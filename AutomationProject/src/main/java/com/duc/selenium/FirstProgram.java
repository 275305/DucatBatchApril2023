package com.duc.selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	// https://demoqa.com/select-menu
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		// implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.name("country")));

		select.selectByVisibleText("ARUBA");

		// select.selectByValue("ANGOLA");

		// select.selectByIndex(2);
		// select.selectByIndex(107);
		Thread.sleep(3000);

		driver.close();

		// table data
		/*
		 * driver.get("https://demo.guru99.com/test/web-table-element.php");
		 * 
		 * WebElement Row3Col2 = driver.findElement(By.xpath(
		 * "//div[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		 * 
		 * System.out.println(" 3rd Row and 2nd Column Data is : " +
		 * Row3Col2.getText());
		 * 
		 * // to find the data of 3rd row and 3rd column
		 * 
		 * WebElement Row3Col3 = driver.findElement(By.xpath(
		 * "//div[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));
		 * 
		 * System.out.println(" 3rd Row and 3rd Column Data is : " +
		 * Row3Col3.getText());
		 */

	}

}
