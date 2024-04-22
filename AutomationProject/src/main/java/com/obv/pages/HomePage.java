package com.obv.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	//By Using Test NG 
	
	@Test
	public void lauchBrowser() {
		String BaseURL = "https://orangebookvalue.com/";
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Driver\\chrome-win32\\chrome.exe");

		// WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get(BaseURL);

		driver.close();

	}

}
