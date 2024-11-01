package com.duc.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverMouse {

	@Test
	public void hoverMouse() throws InterruptedException{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.orangehrm.com/");
		
						
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Company']")))
		.build().perform();
		
		Thread.sleep(3000);
		action.click(driver.findElement
(By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[normalize-space()='About Us']"))).build().perform();
		
		
		

	}

}
