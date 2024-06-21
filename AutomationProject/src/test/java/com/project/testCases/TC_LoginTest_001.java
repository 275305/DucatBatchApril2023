package com.project.testCases;

import org.testng.annotations.Test;

import com.project.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	//WebDriver driver;
	@Test
	public void loginTest() {
				
		LoginPage login=new LoginPage(driver);
		
		login.setUserName(userName);
		login.setUserPassword(userPassword);
		login.setloginButton();
		
	}

}
