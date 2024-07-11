package com.project.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testData.ReadExcelFile;

public class LoginPage_001 {

	ReadExcelFile readExcel = new ReadExcelFile();
	WebDriver gdriver;

	public LoginPage_001(WebDriver ldriver) {

		gdriver = ldriver;

		PageFactory.initElements(ldriver, this);

	}

	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement userPassword;

	@FindBy(name = "login-button")
	WebElement loginButton;

	public void setUserName() throws IOException {

		String uName1 = readExcel.readExcel_Files(1, 0);

		userName.sendKeys(uName1);
	}

	public void setUserPassword() throws IOException {
		String uPassword1 = readExcel.readExcel_Files(1, 1);

		userPassword.sendKeys(uPassword1);
	}

	public void setloginButton() {

		loginButton.click();
	}

}
