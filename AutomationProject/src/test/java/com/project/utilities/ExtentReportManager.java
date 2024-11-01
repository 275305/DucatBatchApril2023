package com.project.utilities;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.testCases.BaseClass;

public class ExtentReportManager extends BaseClass implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
     String repName;
	
	public void onStart(ITestContext context) {
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		repName="Test-Report-" +timeStamp+ ".html"; 
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);
		//sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Swag Lab Automation Report");// title of the report
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();

		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("OS", "windos");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Browser Name", "chrome");

	}

	
	public void onTestSuccess(ITestResult result) {
		
		
		test = extent.createTest(result.getName());

		test.log(Status.PASS, "Test cases PASSED is" + result.getName());
		
	

	}

	public void onTestFailure(ITestResult result) {
	ExtentTest	test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test cases FAILED is" + result.getName());
		test.log(Status.FAIL, "Test cases FAILED cause is" + result.getThrowable());
		String testName=result.getName();
		
		try {
			WebDriver driver=(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			
			//String imgPath = new BaseClass().captureScreen(testName,driver);
			System.out.println("img file executed");
			test.addScreenCaptureFromPath(captureScreen(testName,driver),testName);
			
		}
		catch(Exception e1) {
			e1.printStackTrace();
			
		}

	}



	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test cases SKIPPED is" + result.getName());

	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	
		
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		
      extent.flush();
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
