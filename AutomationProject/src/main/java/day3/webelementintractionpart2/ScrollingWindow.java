package day3.webelementintractionpart2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingWindow {
	
	@Test
	public void scrollWindow(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
				
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,650)");
		
		//driver.findElement(By.linkText("Conditions of Use ")).click();
		
		//driver.close();
		
	}

}
