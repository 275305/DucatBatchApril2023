import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		// if else condition -> property file -> data read from property file
		// if (browser== this) then  

	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		
		
	/*	WebDriverManager.iedriver().setup();
		WebDriver driver3 = new InternetExplorerDriver();
		driver.manage().window().maximize();*/
		
		driver2.get("https://demoqa.com/radio-button");
		
		driver2.close();
	}

}
