package com.project.PageObject;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.testCases.BaseClass;
import com.project.testData.ReadExcelFile;
import com.project.testData.ReadExcelWithSelenium;
import com.project.utilities.Utility;

public class LoginPage {

	Logger logger = Logger.getLogger(LoginPage.class);
	ReadExcelFile readExcel = new ReadExcelFile();
	ReadExcelWithSelenium readNum=new ReadExcelWithSelenium();
	WebDriver gdriver;

	public LoginPage(WebDriver ldriver) {

		gdriver = ldriver;

		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginButton;

	// @FindBy(xpath="//button[text()='Login']")

	@FindBy(xpath = "//div[normalize-space()='Carhop']")
	WebElement carhopsLink1;
	
	@FindBy(xpath="//input[@id=':rs:']")
	WebElement mobileNumberLogin1;
	
	@FindBy(xpath="//div[@class='MuiGrid-root _mainContainer_16eko_42 css-vj1n65-MuiGrid-root']//input")
	WebElement mobileNumberLogin;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobileNoPizzahut;
	
	@FindBy(xpath="//span[normalize-space()='Login']")
	WebElement loginButtonPizzaHut;

	// click on login button
	public void clickLoginButton() {

		Utility.webDriverWait(loginButton, gdriver);
		logger.info("* CLICKED ON LOGIN BUTTON SUCCESSFYLLY*");

	}

	public void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) gdriver;

		js.executeScript("window.scrollBy(0,450)");
		
		logger.info("*SCROLL DOWN SUCCESSFULLY*");
	}

	public void clickCarhopsLink() throws InterruptedException {

		// gdriver.switchTo().alert().dismiss();

		/*
		 * WebDriverWait wait = new WebDriverWait(gdriver, Duration.ofSeconds(30));
		 * WebElement element = wait
		 * .until(ExpectedConditions.elementToBeClickable(carhopsLink));
		 * 
		 * element.click();
		 */
		// Utility.webDriverWait(carhopsLink1,gdriver);

		Utility.fluentWait(carhopsLink1, gdriver);

	}
	
	public void clickLoginButtonPizzahut() {
	
		//loginButtonPizzaHut.click();
		Utility.webDriverWait(loginButtonPizzaHut, gdriver);
		logger.info("*CLICK ON LOGIN SUCCESSFULLY*");
		
	}
	
	public void setmobileNoPizzahut() {
		
		int mobileNumber =readNum.readExcelNumricValue();
		Utility.webDriverWaitSendKey(mobileNoPizzahut, gdriver, mobileNumber);
		
		//mobileNoPizzahut.sendKeys("1234567");
		logger.info("*SEND THE MOBILE NO SUCCESSFULLY*");
		
	}

	public void setMobileNumber() throws IOException {
		
		int mobileNumber =readNum.readExcelNumricValue();
		
		//mobileNumberLogin.sendKeys("mobileNumber");

		/*//String mobileNumber = readExcel.readExcel_Files(1, 0);
		int mobileNumber =readNum.readExcelNumricValue();
		
		   
		
		logger.info("*READ MOBILE NUMBER FROM EXCEL SUCCESSFULLY*");
		
		//int number = Integer.parseInt(mobileNumber);

		mobileNumberLogin.sendKeys("mobileNumber");*/
	}

}
