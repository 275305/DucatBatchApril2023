package com.project.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.project.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	//WebDriver driver;
	@Test
	public void loginTest(String uName,String uPassword,WebDriver driver) {
		
		
		LoginPage login=new LoginPage(driver);
		
		login.setUserName(uName);
		login.setUserPassword(uPassword);
		login.setloginButton();
		
	}

}
