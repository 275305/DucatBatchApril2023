package actions.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// right click on the mouse
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();

		Thread.sleep(3000);

		driver.close();
	}

}
