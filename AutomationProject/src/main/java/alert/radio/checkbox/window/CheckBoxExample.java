package alert.radio.checkbox.window;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxExample {
	
	public static void main(String[] args) {
		
					
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handle frame by using frame name
		
		//driver.switchTo().frame("iframeResult");
		
		//handle frame by using frame index
		 driver.switchTo().frame(1);
		
		// Find web element on  checkbox
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='vehicle1']"));
		
		System.out.println(checkBox.isDisplayed());
		
		System.out.println(checkBox.isSelected());
		
		//click on check box
		checkBox.click();
		
		System.out.println(checkBox.isSelected());
		
		
		
		
	}

}
