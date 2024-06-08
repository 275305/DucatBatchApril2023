package day3.webelementintractionpart2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleBrowserWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,650)");

		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));

		newTab.click();

		String mainWindow = driver.getWindowHandle();
		Set<String> allchildWindows = driver.getWindowHandles();

		for (String window : allchildWindows) {

			driver.switchTo().window(window);
				String titleChild = driver.getTitle();
				System.out.println(titleChild);
			
		}

	}

}
