package duc.april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import duc.launchbrowser.LaunchBrowser;
import duc.reusable.Reusable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSauce {
    private WebDriver driver;
	//WebDriver driver;
	
	LoginSauce(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	LoginSauce login=new LoginSauce(driver);
	LaunchBrowser browser=new LaunchBrowser();
	//Reusable  reusable=new Reusable();
	
	@BeforeClass
	public void beforeClass() {

		String Url = "https://www.saucedemo.com/";
		browser.launchBrowser(Url);
		

	}
	
	@Test(priority=1)
	public void m1() {
		browser.login();
		
	}
	
	@Test(priority=2)
	public void m2() {
		
		WebElement password = driver.findElement(By.id("password"));
		Reusable.insertText(driver, password, "secret_sauce");
		
	}
/*
	@Test(enabled= false)
	public void login() throws Exception {
		
		 //PageFactory.initElements(driver, Reusable.class);

		WebElement username = driver.findElement(By.id("user-name"));
		reusable.insertText(driver, username, "standard_user");

		WebElement password = driver.findElement(By.id("password"));
		reusable.insertText(driver, password, "secret_sauce");

		WebElement click = driver.findElement(By.id("login-button"));
		reusable.clickButton(click);

		WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		reusable.clickButton(addCart);

		WebElement yourCart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
		reusable.clickButton(yourCart);

		reusable.tearDown(driver);

	}
*/
}
