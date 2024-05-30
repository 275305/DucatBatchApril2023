package actions.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickSelenium {
	
		
		public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// Double click
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(button).build().perform();
		
		//driver.close();
		
}

}
