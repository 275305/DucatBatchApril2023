package com.project.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.PageObject.LoginPage_001;
import com.project.testCases.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportwithFailedScreenShot {

	ExtentReports extent = new ExtentReports();;


	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	String repName = "Test-Report-" + timeStamp + ".html";
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);

	Logger logger = Logger.getLogger(ExtentReportwithFailedScreenShot.class);

	
	public WebDriver driver;

	@BeforeTest
	public void setUp() {

		// sparkReporter = new
		// ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Swag Lab Automation Report");// title of the report
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);

		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("OS", "windos");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Browser Name", "chrome");
		WebDriverManager.chromedriver().setup();
		PropertyReader propertyReader = new PropertyReader();

		String baseURL = propertyReader.getApplicationURL();

		String userName = propertyReader.username();
		String userPassword = propertyReader.userPassword();
		driver = new ChromeDriver();
		logger.info("*INITIALIZE THE WEBDRIVER  SUCESSFULLY*");
		driver.get(baseURL);
		logger.info("*URL IS OPEN SUCESSFULLY*");
		driver.manage().window().maximize();
		logger.info("*MAXIMIZE THE BROWSER SUCESSFULLY*");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("*Apply the IMPLICIT WAIT SUCCESSFULLY*");
		driver.navigate().refresh();

	}

	@AfterTest
	public void tearDown() {

		extent.flush();
		driver.close();

	}

	@Test(priority = 0)
	public void loginTest001() throws IOException, InterruptedException {
		LoginPage_001 login = new LoginPage_001(driver);
		ExtentTest	test = extent.createTest("Verify the User name nad Password").assignAuthor("Pradeep").assignCategory(" Functinal test")
				.assignDevice("window");

		try {
		
			login.setUserName();

			login.setUserPassword();
			test.addScreenCaptureFromPath(captureScreenShot(driver));

		}

		catch (Exception e) {
			test.fail(" Title not verified " + e.getMessage());
			test.addScreenCaptureFromPath(captureScreenShot(driver));

		}

	}

	@Test(priority = 1, enabled = true)
	public void testcases002() throws IOException {

		ExtentTest test = extent.createTest("Verify the Page Title").assignAuthor("Pradeep")
				.assignCategory("Functinal test").assignDevice("window");

		try {
			String actual = driver.getTitle();
			String expected = "Pradeep";

			System.out.println("title" + actual);
			Assert.assertEquals(actual, expected);
			test.pass("Verify the Title successfully");
		} catch (Exception e) {
			test.fail(" Title not verified " + e.getMessage());
			test.addScreenCaptureFromPath(captureScreenShot(driver));

		}

	}

	public static String captureScreenShot(WebDriver driver) throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFilePath = new File("src/../Screenshots/screenshot" + System.currentTimeMillis() + ".png");

		String absolutePathLocation = destinationFilePath.getAbsolutePath();
		FileUtils.copyFile(srcFile, destinationFilePath);

		return absolutePathLocation;

	}

}
