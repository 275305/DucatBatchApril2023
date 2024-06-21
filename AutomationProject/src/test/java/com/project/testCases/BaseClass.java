package com.project.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.project.utilities.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	PropertyReader propertyReader=new PropertyReader();
	
	public String baseURL=propertyReader.getApplicationURL();
	
	public String userName=propertyReader.username();
	public String userPassword=propertyReader.userPassword();
	public static WebDriver driver;
	
	Logger logger;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(baseURL);
		logger=Logger.getLogger(BaseClass.class);
		logger.info("URL is Open");
		
		driver.manage().window().maximize();
		
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
