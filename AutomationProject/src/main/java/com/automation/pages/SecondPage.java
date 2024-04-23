package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SecondPage {
	
 //by using Page Factory
	//explicit wait
 
 WebDriver driver;
 //WebDriverWait wait;
 public SecondPage(WebDriver driver){
		this.driver=driver;
		
		 PageFactory.initElements(driver, this);
		    }

	// Constructor, as every page needs a Webdriver to find elements

	// Locating user name
	// @FindBy(xpath = "//input[@id='user-name']")

	@FindBy(id = "user-name")
	WebElement username;

	// Locating the password text box
	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	
	
	/*Explicit Wait syntax:
		WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);*/
	
	
	

	// Method that performs login action using the web elements
	public void LogIn_Action(String uName, String pwd) throws Exception {

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
		username.sendKeys(uName);
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("user-name")));
		//Thread.sleep(2000);
		pswd.sendKeys(pwd);
		
		
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
	    		
		loginBtn.click();
		//Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}	


}
