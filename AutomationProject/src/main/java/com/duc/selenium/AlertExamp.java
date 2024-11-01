package com.duc.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExamp {

	
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		
		WebElement alertClickMe = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alertClickMe.click();
		
		// define the alert
		Alert alert = driver.switchTo().alert();
		// click on ok button
		
		
		
		
		alert.sendKeys("Hello i am ");
		Thread.sleep(3000);
		
		//alert.accept();
		//click on cacel button
		//alert.dismiss();
		
		// capture the text on alert
		
		/*String textonAlert=alert.getText();
		
		System.out.println(textonAlert);*/
		
	}

}
