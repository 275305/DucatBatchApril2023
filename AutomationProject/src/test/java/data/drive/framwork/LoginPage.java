package data.drive.framwork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public void userName() throws IOException {

		driver.findElement(By.name(Utility.fetchLocatorValue("login_username_name"))).sendKeys("standard_user");

	}

	public void userPassword() throws IOException {
		driver.findElement(By.name(Utility.fetchLocatorValue("login_password_name"))).sendKeys("secret_sauce");

	}

	public void clickSignIn() throws IOException {
		
		driver.findElement(By.name(Utility.fetchLocatorValue("login_signin_name"))).click();

	}

}
