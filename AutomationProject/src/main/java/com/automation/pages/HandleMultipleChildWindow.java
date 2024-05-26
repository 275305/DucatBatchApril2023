package com.automation.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleChildWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");

		// opening multiple child window
		driver.findElement(By.id("windowButton")).click();
		// driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

		Set<String> windowsIDs = driver.getWindowHandles();
		Iterator<String> itr = windowsIDs.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		System.out.println(parentWindow);
		String parentTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle);

		System.out.println(childWindow);
		String childTitle = driver.switchTo().window(childWindow).getTitle();
		System.out.println(childTitle);

		// This is main window
		/*
		 * String mainWindow= driver.getWindowHandle();
		 * System.out.println("This is main Window"+ mainWindow);
		 */
		 Thread.sleep(2000);
		driver.quit();

	}

}
