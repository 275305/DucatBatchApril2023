package data.drive.framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import day4.UtilityScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {
	
	public WebDriver driver;
	@BeforeMethod
	public void initiateDriverInstance() throws Exception {
		
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{    WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else {
			 driver=new ChromeDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriver() {
		
	}

}
