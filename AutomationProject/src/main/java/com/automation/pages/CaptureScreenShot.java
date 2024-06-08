package com.automation.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// Take the screenshot
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File fileSrc=takeScreenShot.getScreenshotAs(OutputType.FILE);
		 File targetFile=new File("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\ravi.png");
		 FileUtils.copyFile(fileSrc, targetFile);
		

		driver.close();
	}

}
