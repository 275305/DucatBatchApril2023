package day3.webelementintractionpart2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpliciteWaitExample {

	public static void main(String[] args) {
		
		// Element not found Exception -Means locator is not correct
		
		// In explicite handle element not not visible exception, Timeout exception
		
		/*The above code instructs Selenium WebDriver to wait for 30 seconds before throwing a TimeoutException.
		If it finds the element before 30 seconds, then it will return immediately. After that, 
		it will click on the “Compose” button. In this case, the program will not wait for the entire 30 seconds, 
		thus saving time and executing the script faster.*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// define the explicite wait 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-button']"))).click();
		
		
	}

}
