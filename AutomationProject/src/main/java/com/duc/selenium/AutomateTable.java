package com.duc.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateTable {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//automate the web table
		
		/*WebElement Row2Column4 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[2]/td[4]"));
		 System.out.println(" Row2 and column4 data is : "+ Row2Column4.getText());*/
		
		List<WebElement> allRowElement = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
	 
		
		 Iterator<WebElement> itr = allRowElement.iterator();
		 
		 
		 while(itr.hasNext()) {
			 
			System.out.println(itr.next().getText());
		 }
	
	
	}
}
