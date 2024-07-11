package com.duc.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSceenShot {
	
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		   
		File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\Nyka.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		//File fileSrc=takeScreenShot.getScreenshotAs(OutputType.FILE);
		 //File targetFile=new File("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\nyka.png");
		 //FileUtils.copyFile(fileSrc, targetFile);
		
	}

}
