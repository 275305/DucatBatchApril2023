package com.project.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("*INITIALIZE THE WEBDRIVER  SUCESSFULLY*");
		driver.get(baseURL);
		logger.info("*URL IS OPEN SUCESSFULLY*");
		driver.manage().window().maximize();
		logger.info("*MAXIMIZE THE BROWSER SUCESSFULLY*");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("*Apply the IMPLICIT WAIT SUCCESSFULLY*");
		driver.navigate().refresh();

	}
	
	public String captureScreen(String tname , WebDriver driver) throws IOException {

		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		 File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		 
		 File destinationScreenShotFile=new File(System.getProperty("user.dir"+"\\Screenshots\\" +tname +"_" + timeStamp + ".png"));
		 		 
		 FileUtils.copyFile(sourceFile, destinationScreenShotFile);
		 //sourceFile.renameTo(targetFile);
		 
		 return destinationScreenShotFile.getAbsolutePath();

		}
	/*public String captureScreenOne(String tname) throws IOException {

		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		 File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		 String destination = System.getProperty("user.dir"+"\\reports\\" +tname +"_" + timeStamp + ".png");
		 
		 File finalDestination=new File(destination);
		 FileUtils.copyFile(source,finalDestination);
		 
		 return destination;

		}*/
	
/*	public String captureScreenTwo() {
		
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    String destination = System.getProperty("user.dir") + "/screenshots/" +  dateName
		            + ".png";
		    File finalDestination = new File(destination);
		   // FileHandler.copy(source, finalDestination);
		    return destination;
	}*/
	

	@AfterClass(enabled=false)
	public void tearDown() {
		//driver.quit();
		
		logger.info("*CLOSE THE DRIVER SUCCESSFULLY*");
	}
}
