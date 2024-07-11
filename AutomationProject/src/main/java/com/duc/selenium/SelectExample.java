package com.duc.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectExample {

	public static void main(String[] args){

		try {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//scrolling the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		 WebElement dropDownCountry = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(dropDownCountry);
		Thread.sleep(3000);
		// select.selectByValue("INDIA");
		
		//select.selectByIndex(100);
		select.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
		 
		 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
