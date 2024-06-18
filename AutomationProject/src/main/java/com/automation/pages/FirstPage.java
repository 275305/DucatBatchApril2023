package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {

	final WebDriver driver;

	// Constructor, as every page needs a Webdriver to find elements
	public FirstPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locating user name text box
	@FindBy(id = "user-name")
	WebElement username;

	// Locating the password text box
	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	// Method that performs login action using the web elements
	public void LogIn_Action(String uName, String pwd) {
		username.sendKeys(uName);
		pswd.sendKeys(pwd);
		loginBtn.click();
	}

}
