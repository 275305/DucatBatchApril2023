package com.duc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableData {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement Row3Col2 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));

		System.out.println(" 3rd Row and 2nd Column Data is : " + Row3Col2.getText());
		
		
	WebElement	row2col4=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[2]/td[4]"));
	
	    System.out.println(" Table data of row2 and column 4 is : "+row2col4.getText());
		
		//table/tbody/tr[2]/td[4]
	}

}
