package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)");

		WebElement element0 = driver.findElement(
				By.xpath("//div[@id='selectMenuContainer']//div[@class='row']//div[@class=' css-1hwfws3']"));

		element0.click();
		List<WebElement> dropDownElements = driver.findElements(By.xpath("//div[@class=' css-26l3qy-menu']/div/div"));

		for (WebElement element : dropDownElements) {
			element.click();
			Thread.sleep(2000);
		}

		Thread.sleep(3000);

		driver.close();
	}

}
