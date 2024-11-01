package com.project.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utility {

	/*static WebDriver gdriver;

	public Utility(WebDriver ldriver) {
		gdriver = ldriver;

	}*/

	
	public static void webDriverWaitSendKey(WebElement element, WebDriver driver, int value)  {

		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement webElement4 = wait.until(ExpectedConditions.elementToBeClickable(element));
		
		webElement4.sendKeys(String.valueOf(value));
		Thread.sleep(2000);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

	public static void webDriverWait(WebElement element, WebDriver driver)  {

		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement webElement4 = wait.until(ExpectedConditions.elementToBeClickable(element));
		
		webElement4.click();
		Thread.sleep(2000);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	// use of the fluent wait
	public static void fluentWait(WebElement element, WebDriver driver) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));

		webElement.click();

		/*
		 * WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input[@id='login-button']")); } });
		 * loginButton.click();
		 */
	}

}
