package com.project.testCases;

import java.io.IOException;

import org.testng.annotations.Test;


import com.project.PageObject.LoginPage_001;

public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
				
		LoginPage_001 login=new LoginPage_001(driver);
		
		login.setUserName();
		
		login.setUserPassword();
		
		login.setloginButton();
		
	}

}
