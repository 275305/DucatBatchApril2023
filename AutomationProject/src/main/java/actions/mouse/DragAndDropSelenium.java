package actions.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropSelenium {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)");
		
		WebElement from = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

		// Drag and drop
		Actions action = new Actions(driver);
		
		 action.dragAndDrop(from, to).build().perform();
		
		//action.clickAndHold(from).moveToElement(to).release().build().perform(); // either
		
		
		
	}
	

}
