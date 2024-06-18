package duc.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import duc.launchbrowser.LaunchBrowser;


public class Reusable{

	
    

	// insert the text into text box
	public static void insertText(WebDriver driver, WebElement locator, String value) {
		//PageFactory.initElements(driver, LaunchBrowser.class);
		// WebElement field = driver.findElement(locator);
		locator.clear();
		locator.sendKeys(value);
		// field.clear();
		// field.sendKeys(value);

	}

	// click on button
	public void clickButton(WebElement locator) throws Exception {

		locator.click();
		
		Thread.sleep(2000);

	}

	// to close the driver
	public void tearDown(WebDriver driver) {
		driver.close();

	}

}
