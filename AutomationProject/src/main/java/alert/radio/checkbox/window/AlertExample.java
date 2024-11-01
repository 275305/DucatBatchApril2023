package alert.radio.checkbox.window;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// click on button to see the alert

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.id("alertButton")).click();
		// witch on the alert
		Alert alert = driver.switchTo().alert();
		String expected="You clicked a button";
		
		String actual = alert.getText();
        
		System.out.println(actual);
		
		alert.accept();
		
		Assert.assertEquals(actual, expected);
		
		

		// ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

	}

}
