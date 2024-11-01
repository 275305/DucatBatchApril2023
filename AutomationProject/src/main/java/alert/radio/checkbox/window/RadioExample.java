package alert.radio.checkbox.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement radio = driver.findElement(By.xpath("//label[@for='yesRadio']"));

		// isDisplayed(): Checks whether a radio button is displayed on the web page or
		// not.

		boolean isDispay = radio.isDisplayed();
		System.out.println(isDispay);
		

		// isSelected(): Checks whether a radio button is selected or not.
		System.out.println(radio.isSelected());
		

		radio.click();
		// isSelected(): Checks whether a radio button is selected or not.
		System.out.println(radio.isSelected());
		
		WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']"));
		
		
		//isEnabled(): Checks whether a radion button is enabled or not
		System.out.println(noRadio.isEnabled());

	}

}
