package iFrame.assertions;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {
	
	SoftAssert softAssert=new SoftAssert();

	@Test
	public void testAssertion() {
		String expectedTitle="Demo Guru99 Page1";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		/*Assert.assertEquals(actualTitle,expectedTitle); */// hard assertion
		
		softAssert.assertEquals(actualTitle, expectedTitle);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,750)");
		

		// by using frame name
		WebDriver str = driver.switchTo().frame("a077aa5e");

		driver.findElement(By.cssSelector("img[src='Jmeter720.png']")).click();
		
		//softAssert.assertAll();

		driver.close();
	}
}
