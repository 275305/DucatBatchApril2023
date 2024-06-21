package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	/*drop down handles*/

         public static void main(String[] args) throws Exception {
 			
             // By using without Test Ng
			String BaseURL = "https://orangebookvalue.com/";
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Driver\\chrome-win32\\chrome.exe");

			// WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();

			driver.get(BaseURL);
			
			driver.findElement(By.xpath("//select[@name='category']")).click();
            Thread.sleep(3000);
            
            Select select = new Select(driver.findElement(By.xpath("//select[@name='category']")));
            
            select.selectByVisibleText("Car");
            Thread.sleep(3000);
            
            
			//driver.close();
			// driver.findElement(By.xpath(""));
			driver.quit();
		
	}
}

	


