package day4;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotofSpecificElement {

	@Test
	public void takeSpecificElementScreenShot() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//WebElement element = driver.findElement(By.xpath("//button[@id='book-flight-widget']"));
		
		WebElement element=driver.findElement(By.xpath("//img[@alt='Google']"));

		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Point location = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		BufferedImage img = ImageIO.read(screen);

		BufferedImage dest = img.getSubimage(location.getX(), location.getY(), width, height);

		ImageIO.write(dest, "png", screen);

		File file = new File("C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\Google1.png");

		FileHandler.copy(screen, file);
		
		driver.close();
	}

}
