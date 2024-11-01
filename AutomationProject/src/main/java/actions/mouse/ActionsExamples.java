package actions.mouse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExamples {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.orangehrm.com/");

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Resources']"))).build().perform();

		Thread.sleep(3000);
		// Mouse hover menuOption 'About US'
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Company']"))).build().perform();

		driver.findElement(
				By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[contains(text(),'About Us')]"))
				.click();
		
		WebElement link = driver.findElement(By.linkText("About Us"));
		
		action.click(link).build().perform();
		
		
		Thread.sleep(3000);
	}

}
