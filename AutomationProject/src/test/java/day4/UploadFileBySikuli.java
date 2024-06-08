package day4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileBySikuli {
     
	
	
     @Test
	public void launchBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://demo.guru99.com/test/upload/");
		
		//driver.get("https://www.google.com");
		
		
		//driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		
		driver.manage().window().maximize();

		/*driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,280)");//Scroll Down to file upload button (+ve)
*/		  
		
		driver.findElement(By.xpath("//input[@id='photo-upload']")).sendKeys("C:\\Users\\pradeep.chauhan\\Documents\\Lightshot\\apple.png");;
		//driver.findElement(By.xpath("//input[@id='picture']")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

	/*@Test(enabled=false)
	public void uploadFile() throws InterruptedException{
		
		driver.findElement(By.id("uploadfile_0")).click();
		
		driver.findElement(By.cssSelector("#uploadfile_0")).click();
		Thread.sleep(3000);
		//sendKeys("C:\\Users\\pradeep.chauhan\\Documents\\Lightshot\\apple.png");;
		
		
		String imagesFilePath="C:\\Users\\pradeep.chauhan\\Documents\\Lightshot";
		String inputFilePath="C:\\Users\\pradeep.chauhan\\Documents\\Lightshot";
		
		Screen s=new Screen();
		Pattern fileInputTextBox= new Pattern(imagesFilePath+"textBox.png");
		Pattern openButton= new Pattern(imagesFilePath+"openButton.png");
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox,20);
		s.type(fileInputTextBox,inputFilePath+"apple.png");
		s.click(openButton);

	} */

}
