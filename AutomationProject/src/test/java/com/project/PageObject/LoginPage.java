package com.project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver gdriver;
	public LoginPage(WebDriver ldriver) {
		
		gdriver=ldriver;
		
		PageFactory.initElements(ldriver,this);
		
	}
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement userPassword;
	
	@FindBy(name="login-button")
	WebElement loginButton;
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setUserPassword(String uPassword) {
		userPassword.sendKeys(uPassword);
	}
	
	public void setloginButton() {
		
		loginButton.click();
	}

}
