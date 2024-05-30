package com.automation.pages;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListofElementExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,450)");
		
		Select select=new Select(driver.findElement(By.id("cars")));
		
		          List<WebElement>  listAll=   select.getOptions();
		          
		         int length= listAll.size();
		         
		         for(int i=0;i<length;i++) {
		        	 
		        	 
		         }
		          
		          for(WebElement list: listAll) {
		        	  
		        	  list.click();
		          }
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
