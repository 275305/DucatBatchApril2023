package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleVerify {

	/* Title Verify */

	@Test
	public void m1() throws Exception {
		// WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String BaseURL = "https://automationexercise.com/";
		driver.get(BaseURL);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String actualTitle = driver.getTitle();

		System.out.println("Actual title is :" + actualTitle);
		String Expectedtitle ="Automation Exercise";
		
		Assert.assertEquals(actualTitle,Expectedtitle);
		
		//Assert.assertTrue(driver.getTitle().contains("Selenium"));

		driver.close();
	}

}
