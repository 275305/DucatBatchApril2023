package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdNameCssXpathLinktextPartialTagName {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//driver.findElement(By.id("APjFqb")).sendKeys("facebook");
		driver.findElement(By.name("q")).sendKeys("amazon");
		
		//tagname
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		                 int i = list.size();
		                 
		                 for(int j=0;j<i;j++) {
		                	 
		                	String linkName = list.get(j).getText();
		                	System.out.println(linkName);
		                	 
		                 }
		
		
		
	/*	driver.get("https://www.opencart.com/");*/
		
		
		//isDisplayed method, cssSelector
	/*	boolean logo = driver.findElement(By.cssSelector("img[title='OpenCart - Open Source Shopping Cart Solution']")).isDisplayed();
		 System.out.println(logo);*/
		 
		 // use of Linktext
		 
	/*	 driver.findElement(By.linkText("Features")).click();*/
		 
		 // use partial linktext
		 
		 /*driver.findElement(By.partialLinkText("Feat")).click();*/
	
		 
		 
	}

}
