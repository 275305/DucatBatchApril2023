package com.duc.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//define the actions class
		
		Actions action=new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
		
		
		
		
	}

}
