package day4.takescreenshot.autoit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterExp {
	
		
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,250)");
		
		
	}

}
