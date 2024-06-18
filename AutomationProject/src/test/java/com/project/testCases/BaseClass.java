package com.project.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL="https://www.saucedemo.com/";
	public String userName="standard_user";
	public String userPassword="secret_sauce";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		TC_LoginTest_001 test=new TC_LoginTest_001();
		test.loginTest(userName, userPassword,driver);
		
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
