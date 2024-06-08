package day4.takescreenshot.autoit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TakeScreenShotFailedTestCase {

	WebDriver driver;

	@Test(priority=0)
	public void testone() {
		
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		 String titleActual=driver.getTitle();
		 String expectedTitle="GoogleTest";

		Assert.assertEquals(titleActual,expectedTitle);

		System.out.println(" This is failed");
	}

	@Test(priority=1)
	public void afterMethod(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			
			TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
			File fileSrc=takeScreenShot.getScreenshotAs(OutputType.FILE);
			 File targetFile=new File("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\failure.png");
			 FileUtils.copyFile(fileSrc, targetFile);
/*
			File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenShotFile, new File(
					"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\Failure.png"));
*/
		}

	}

}
