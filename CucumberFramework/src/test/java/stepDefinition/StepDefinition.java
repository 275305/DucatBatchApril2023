package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("User Launch the chrome browser")
	public void user_launch_the_chrome_browser() throws InterruptedException {
		
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		//WebDriverManager.chromedriver().clearResolutionCache().setup();
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		 driver=new ChromeDriver();
		
	}

	@When("User open the URL {string}")
	public void user_open_the_url(String string) {
		
		driver.get("https://www.saucedemo.com/");
	    
	}

	@When("User enter userid \"standard_user\"and password {string}")
	public void user_enter_userid_standard_user_and_password(String string) {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		
		driver.findElement(By.id("login-button")).click();
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		
		String title=driver.getTitle();
		System.out.println(" Title is : "+title);
	   
	}

	@Then("close browser")
	public void close_browser() {
		
		driver.close();
	    
	}



}
