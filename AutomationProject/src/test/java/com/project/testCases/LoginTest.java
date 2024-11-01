package com.project.testCases;

import java.io.IOException;

import org.slf4j.spi.LoggingEventBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.PageObject.LoginPage;
import com.project.PageObject.LoginPage_001;

public class LoginTest extends BaseClass{
	
	
	
	@Test(priority=0, enabled=false)
	public void loginTest1() throws IOException, InterruptedException {
		
		LoginPage loginPage=new LoginPage(driver);
		
		/*loginPage.clickLoginButtonPizzahut();
		loginPage.setmobileNoPizzahut();*/
		
		/*loginPage.clickLoginButton();
		loginPage.scrollDown();
		loginPage.setMobileNumber();*/
		
	}
	@Test(priority = 0, enabled = true)
	public void loginTest() throws IOException, InterruptedException {

		LoginPage_001 login = new LoginPage_001(driver);

		login.setUserName();
		Thread.sleep(2000);
		login.setUserPassword();
		Thread.sleep(2000);
		login.setloginButton();
		Thread.sleep(2000);

	}

	@Test(priority = 1, enabled=false)
	public void getTitle() {
		String expectedTitle = "Swag Labs pradeep";
		String actualTital = driver.getTitle();
		System.out.println(actualTital);
		
		Assert.assertEquals(actualTital,expectedTitle);

	}
	

}
