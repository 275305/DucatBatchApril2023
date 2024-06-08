package day3.webelementintractionpart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class XmlSuitParameterization {
	
	
	@Test
	@Parameters({"url","uname","upassword"})
	
	public void testSuit(String url,String uname,String upassword) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		          
		driver.get(url);
		
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(upassword);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}

}
