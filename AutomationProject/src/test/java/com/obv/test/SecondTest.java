package com.obv.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.obv.pages.SecondPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {

	// By using Page Factory

	WebDriver driver; // web driver always Declare as a Global
	SecondPage secPage;
	// private static final Logger LOG = LoggerFactory.getLogger(SecondTest.class);

	@BeforeMethod
	public void beforeTest() throws Exception {
		// LOG.info("IN BEFORE TEST ======>");
		// String baseUrl ="https://orangebookvalue.com/";

		System.out.println("-------BeforeTest---");
		String baseUrl = "https://www.saucedemo.com/";
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		 // implicit wait
		 
		/* Implicit Wait syntax:
			 driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get(baseUrl);
		Thread.sleep(2000);

		// baseUrl = "https://qa1.droom.in/";
		// baseUrl = "https://orangebookvalue.com";
		// baseUrl = "https://www.saucedemo.com/";

		
		
		// LOG.info("-------------- Before Test -----------------");

	}

	@Test(priority = 0)
	public void m2() throws Exception {

		try {
		//WebDriver driver = null;
		// To Initilise the Page Factory
		// secPage=PageFactory.initElements(driver, SecondPage.class);
		 secPage = new SecondPage(driver);

		secPage.LogIn_Action("standard_user", "secret_sauce");
		
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		
		 //throw (e);
		}

	}

	@AfterTest
	public void closeDriver() {
		System.out.println("-----After Test-Driver Close-----");

		driver.close();

	}

	@Test(priority = 2, enabled = false)
	public void m1() throws InterruptedException {
		// By using without Test Ng
		String BaseURL = "https://orangebookvalue.com/";
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\Driver\\chrome-win32\\chrome.exe");

		// WebDriver driver=new ChromeDriver();
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.manage().window().maximize();
		 */

		// driver.get(BaseURL);
/*
		driver.findElement(By.xpath("//select[@name='category']")).click();
		Thread.sleep(3000);

		Select select = new Select(driver.findElement(By.xpath("//select[@name='category']")));

		select.selectByVisibleText("Car");
		Thread.sleep(3000);

		driver.close();*/
		// driver.findElement(By.xpath(""));

	}

	@Test(priority = 3, enabled = false)
	public void login() throws Exception {

		// Instantiating Login & Profile page using initElements()
		// ReusableTest reusableTest =PageFactory.initElements(driver,
		// ReusableTest.class);
		// SecondPage loginPg = PageFactory.initElements(driver, SecondPage.class);

		//secPage = new SecondPage(driver);

		// Using the methods created in pages class to perform actions
		secPage.LogIn_Action("standard_user", "secret_sauce");
		Thread.sleep(3000);

		// driver.quit();
	}

}
