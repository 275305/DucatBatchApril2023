package alert.radio.checkbox.window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			
			WebElement newWindow = driver.findElement(By.xpath("//button[@id='tabButton']"));
			  newWindow.click();
			  
			  // to get main window
			 String mainWindow= driver.getWindowHandle();
			 
			 Set<String> allWindow=driver.getWindowHandles();
			 
			 for(String child:allWindow) {
				 
				 if(!mainWindow.equalsIgnoreCase(child)) {
					 
					 driver.switchTo().window(child);
					 driver.close();
					 
				 }
				 
			 }
			
	}

}
