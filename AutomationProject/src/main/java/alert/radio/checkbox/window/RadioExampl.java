package alert.radio.checkbox.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioExampl {
	
public static void main(String[] args) throws InterruptedException {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,400)");
	
	
	
	WebElement radioButton = driver.findElement(By.xpath("//label[@for='noRadio']"));
	
	 System.out.println(radioButton.isEnabled());
	Thread.sleep(2000);
	
	
	

	
}

}
