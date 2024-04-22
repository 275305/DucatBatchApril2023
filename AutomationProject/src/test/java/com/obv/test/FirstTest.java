package com.obv.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.obv.pages.BasePage;
import com.obv.pages.FirstPage;
import com.obv.pages.HomePage;


public class FirstTest extends FirstPage {
	
	
	public FirstTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver;
	
public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Instantiating Login & Profile page using initElements()
		FirstPage loginPg = PageFactory.initElements(driver, FirstPage.class);
		
		 
		//Using the methods created in pages class to perform actions
		loginPg.LogIn_Action("standard_user", "secret_sauce");
		Thread.sleep(3000);
		
		 
		driver.quit();		
						}
	
	

}
