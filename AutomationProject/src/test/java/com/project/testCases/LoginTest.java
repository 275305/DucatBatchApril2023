package com.project.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.project.PageObject.LoginPage;

public class LoginTest extends BaseClass{
	
	
	
	@Test(priority=0, enabled=true)
	public void loginTest() throws IOException, InterruptedException {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickLoginButton();
		loginPage.scrollDown();
		loginPage.setMobileNumber();
		
	}
	

}
