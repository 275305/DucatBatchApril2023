package com.automation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;




public class ReusableTest {
	
	
	private WebDriver driver;
	
	

	private static final Logger LOG = LoggerFactory.getLogger(ReusableTest.class);
    //private static String browser;
    private static String baseUrl;

    @BeforeClass
    public final void beforeTest() throws Exception{
        LOG.info("IN BEFORE TEST ======>");

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
        //baseUrl = "https://qa1.droom.in/";
        //baseUrl = "https://orangebookvalue.com";
        baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);
        Thread.sleep(3000);
        LOG.info("-------------- Before Test -----------------");
        
    }
    
    /*@AfterSuite
	public void init() {

		LOG.info("IN BEFORE METHOD ======>");

          driver.close();
        }*/
    }


