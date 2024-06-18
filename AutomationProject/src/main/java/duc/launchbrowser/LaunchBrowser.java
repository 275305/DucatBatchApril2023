package duc.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import duc.april.LoginSauce;
import duc.reusable.Reusable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	LoginSauce login;
	WebDriver driver;

	// Launch the web driver
	
	public void launchBrowser(String Url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		
				
	}
	
	public void login() {
		WebElement username = driver.findElement(By.id("user-name"));
		Reusable.insertText(driver, username, "standard_user");
		
	}
	
	/*
	 * public static WebDriver getDriver() { return driver; }
	 */

}
