package day4;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeFullScreenShot {

	@Test
	public void fullScreenShot() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com");

		driver.manage().window().maximize();
/*
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File fileSrc = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(
				"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\fullPage.png");*/
		// FileUtils.copyFile(fileSrc, targetFile);
		
		// take full screen shot by using shutter bug dependency in POM.xml
		Shutterbug.shootPage(driver,Capture.FULL,true).save("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\");

	}

}
