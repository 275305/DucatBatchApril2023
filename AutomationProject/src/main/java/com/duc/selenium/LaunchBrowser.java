package com.duc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	
    @Test
	public void launchBrowser() throws InterruptedException {

		String expectedTitle = "Google";

		// 1. webdriver setup

		//WebDriverManager.chromedriver().setup();

		// WebDriverManager.firefoxdriver().setup();

		// WebDriver driver=new FirefoxDriver();
		/*
		 * WebDriverManager.iedriver().setup(); WebDriver driver=new
		 * InternetExplorerDriver();
		 * 
		 * String url="https://www.google.com"; driver.get(url);
		 * 
		 * Thread.sleep(3000);
		 */
		
		// 1. webdriver setup
		
		WebDriverManager.chromedriver().setup();

		// 2. initialise the web driver
		

		WebDriver driver = new ChromeDriver();

		// 3. Launch the web browser

		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);
		// 4.maximize the browser(full size of the browser)
		driver.manage().window().maximize();

		System.out.println("Verify successfully");

		/*
		 * if(expectedTitle.equalsIgnoreCase(actualTitle)) {
		 * 
		 * System.out.println(" ....Title is verify successfully......"); } else {
		 * System.out.println(" Title is not verify"); }
		 */

		// System.out.println(" Page title is :"+ pageTitle);

		/*
		 * driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		 * 
		 * Thread.sleep(2000); driver.navigate().back(); Thread.sleep(5000);
		 * driver.navigate().forward();
		 */

		// driver.navigate().back();

		/*
		 * WebElement googleSearch =
		 * driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		 * 
		 * googleSearch.sendKeys("Nyka.com");
		 * 
		 * WebElement gmailLink=driver.findElement(By.xpath("//a[text()='Gmail']"));
		 * gmailLink.click(); driver.close();
		 */

		// driver.navigate().back();

		// driver.close();
		// driver.quit();
		
		//============================
		
		
		
		//Select select=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		 Actions action=new Actions(driver);
		 
		 action.click(driver.findElement(By.cssSelector(".product_sort_container"))).build().perform();
		 
		 Thread.sleep(3000);
		/* Select select=new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		   // select.selectByIndex(0);
		    select.selectByValue("az");
		    Thread.sleep(3000);*/

	}

}
