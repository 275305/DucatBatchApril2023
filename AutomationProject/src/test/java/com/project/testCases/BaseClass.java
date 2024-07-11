package com.project.testCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.project.utilities.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	Logger logger = Logger.getLogger(BaseClass.class);

	PropertyReader propertyReader = new PropertyReader();

	public String baseURL = propertyReader.getApplicationURL();

	public String userName = propertyReader.username();
	public String userPassword = propertyReader.userPassword();
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("*INITIALIZE THE WEBDRIVER  SUCESSFULLY*");
		driver.get(baseURL);
		logger.info("*URL IS OPEN SUCESSFULLY*");
		driver.manage().window().maximize();
		logger.info("*MAXIMIZE THE BROWSER SUCESSFULLY*");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		logger.info("*Apply the IMPLICIT WAIT SUCCESSFULLY*");
		driver.navigate().refresh();

	}

	@AfterClass(enabled=false)
	public void tearDown() {
		driver.quit();
		
		logger.info("*CLOSE THE DRIVER SUCCESSFULLY*");
	}
}
