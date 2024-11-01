package day4;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TakeScreenShotFailedTestCase {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void testtwo() {

		String titleActual = driver.getTitle();
		String expectedTitle = "GoogleTest";

		Assert.assertEquals(titleActual, expectedTitle);

		System.out.println(" This is failed");
	}
	
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			
			
		/*	UtilityScreenShot.takeScreenShot(driver, result.getName());
			String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
			 File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			 File targetFile = new File(
						"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\failure.png");
				FileUtils.copyFile(sourceFile, targetFile);
			 
			 String targetFilePath = System.getProperty("user.dir"+"\\screenshots\\" +tname +"_" + timeStamp + ".png");
			 
			 File targetFile=new File(targetFilePath);
			 sourceFile.renameTo(targetFile);*/
		  

		/*	TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File fileSrc = takeScreenShot.getScreenshotAs(OutputType.FILE);
			File targetFile = new File(
					"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\failure.png");
			FileUtils.copyFile(fileSrc, targetFile);
			
			 File screenShotFile = ((TakesScreenshot)
			 driver).getScreenshotAs(OutputType.FILE);
			 
			  FileUtils.copyFile(screenShotFile, new File(
			  "C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\Failure.png"
			  ));*/
			 
		}

	}

}
