package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		// find the total column of the table
		List<WebElement> column = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Column Size is : " + column.size());

		// find the total row of the table
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));

		System.out.println("Rows of the table: " + rows.size());

		// find the total data from table

		List<WebElement> totalData = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td"));

		System.out.println("Total Data of the table: " + totalData.size());

		// to find the data of 3rd row and 2nd column

		WebElement Row3Col2 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));

		System.out.println(" 3rd Row and 2nd Column Data is : " + Row3Col2.getText());

		// to find the data of 3rd row and 3rd column

		WebElement Row3Col3 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));

		System.out.println(" 3rd Row and 3rd Column Data is : " + Row3Col3.getText());

		// to find the data of 3rd row and 4th column

		WebElement Row3Col4 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[4]"));

		System.out.println(" 3rd Row and 4th Column Data is : " + Row3Col4.getText());
		
		
		// to find the data of 3rd row and 5th column

		WebElement Row3Col5 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[5]"));

		System.out.println(" 3rd Row and 5th Column Data is : " + Row3Col5.getText());

	}

}
