package com.duc.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDropExample1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		action.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(3000);
		
		
		
		
	}

}
