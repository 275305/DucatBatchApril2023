package com.project.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.PageObject.LoginPage_001;

public class TC_LoginTest_001 extends BaseClass {

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

	
	@Test(priority = 2, enabled = false)
	public void addToCart() throws InterruptedException {
		LoginPage_001 login = new LoginPage_001(driver);

		login.clickAddtoCart();
		Thread.sleep(2000);

		login.shoppingCart();
		Thread.sleep(2000);

	}

	@Test(priority = 3, enabled = false)
	public void checkout() throws InterruptedException, IOException {
		LoginPage_001 login = new LoginPage_001(driver);
		login.checkOut();
		Thread.sleep(2000);
		login.firstName();
		Thread.sleep(2000);
		login.lastName();
		Thread.sleep(2000);
		login.postalCode();
		Thread.sleep(2000);
		login.continueButton();
		Thread.sleep(2000);
		login.finishButton();

	}

}
