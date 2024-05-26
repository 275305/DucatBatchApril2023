package com.automation.pages;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,750)");

		Thread.sleep(3000);
		// handle main window
		String mainWindow = driver.getWindowHandle();
		// System.out.println(mainWindow);

		// handle other window
		WebElement link = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		link.click();

		// get window handles

		Set<String> windowsIDs = driver.getWindowHandles();
		Iterator<String> itr = windowsIDs.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		System.out.println(parentWindow);
		System.out.println(childWindow);

		// how to use window id for switch

		/*driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: " + driver.getTitle());

		driver.switchTo().window(childWindow);
		System.out.println("Child window title: " + driver.getTitle());*/
		
		// if you have multiple window then
		
		          List<String>   windowIdlist=new ArrayList(windowsIDs);
		           
		          for(String windowid : windowIdlist){
		        	  
		        	  String title=driver.switchTo().window(windowid).getTitle();
		        	  System.out.println(title);
		        	  
		          }

		Thread.sleep(3000);
		driver.quit();
	}

}
