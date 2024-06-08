package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithTestCase {
	
	
	@Test
	public void extentReportWithTest() {
		
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		
	}

}
