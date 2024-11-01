package com.project.PageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.testCases.BaseClass;
import com.project.testData.ReadExcelFile;

public class LoginPage_001 {

	Logger logger = Logger.getLogger(LoginPage_001.class);

	ReadExcelFile readExcel = new ReadExcelFile();
	WebDriver gdriver;

	public LoginPage_001(WebDriver ldriver) {

		gdriver = ldriver;

		PageFactory.initElements(ldriver, this);

	}

	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password_Pradeep")
	WebElement userPassword;

	@FindBy(name = "login-button")
	WebElement loginButton;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addToCart;

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement shoppingCart;

	@FindBy(id = "checkout")
	WebElement checkout;

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(id = "finish")
	WebElement finish;

	@FindBy(id = "continue")
	WebElement continueButton;

	public void setUserName() throws IOException {

		String uName1 = readExcel.readExcel_Files(1, 0);

		userName.sendKeys(uName1);
	}

	public void setUserPassword() throws IOException {
		String uPassword1 = readExcel.readExcel_Files(1, 1);

		userPassword.sendKeys(uPassword1);
	}

	public void setloginButton() {

		String expectedValue = "Login";

		// String actualValue = loginButton.getText();

		String actualValue = loginButton.getAttribute("value");
		System.out.println("actualValue : =" + actualValue);
		Assert.assertEquals(actualValue, expectedValue);

		loginButton.click();

		
		logger.info("LOGIN BUTTON TEXT ASSERTED SUCCESSFULLY pradeep");
	}

	public void clickAddtoCart() {

		String expected = "Add to cart";
		String actual = addToCart.getText();

		System.out.println("actual:" + actual);

		addToCart.click();

		Assert.assertEquals(actual, expected);

		logger.info("ADD TO CART BUTTON TEXT ASSERTED SUCCESSFULLY");

	}

	public void shoppingCart() {

		shoppingCart.click();

	}

	public void checkOut() {

		checkout.click();
	}

	public void firstName() throws IOException {

		String userName1 = readExcel.readExcel_Files(2, 0);

		firstName.sendKeys(userName1);

		// firstName.sendKeys("Pradeep");

	}

	public void lastName() throws IOException {

		// lastName.sendKeys("Kumar");
		String userLastName = readExcel.readExcel_Files(2, 1);

		lastName.sendKeys(userLastName);

	}

	public void postalCode() throws IOException {

		String postalCodeValue = readExcel.readExcel_Files(3, 0);
		postalCode.sendKeys(postalCodeValue);

		//int postalCode1 = readExcel.readExcel_FilesNumeric(3, 0);

		// int postalCodeNumeric=Integer.parseInt(postalCode1);

		//postalCode.sendKeys("postalCode1");

	}

	public void continueButton() {
		continueButton.click();

	}

	public void finishButton() {
		finish.click();
	}
}
