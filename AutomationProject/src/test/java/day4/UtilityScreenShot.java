package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenShot {
	
	public static void takeScreenShot(WebDriver driver,String screenShotName) throws IOException {
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File fileSrc = takeScreenShot.getScreenshotAs(OutputType.FILE);
		/*File targetFile = new File(
				"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Screenshots\\failure.png");*/
		FileUtils.copyFile(fileSrc, new File("./Screenshots/"+screenShotName+".png"));
		
	}

}
