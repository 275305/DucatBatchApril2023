package day5;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExp {

	@Test
	public void report() throws IOException {

		ExtentReports extentReport = new ExtentReports();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(
				"C:\\Users\\pradeep.chauhan\\eclipse-workspace2\\AutomationProject\\extentReport\\MyExtentReport.html");
		extentReport.attachReporter(sparkReport);
		
		ExtentTest test1 = extentReport.createTest("Test 1");
		extentReport.createTest("Test 1")
		.log(Status.INFO, "info1")
		.log(Status.INFO, "info1")
		.log(Status.INFO, "info1")
		.log(Status.PASS, "pss")
		.log(Status.WARNING,"warning")
		.log(Status.WARNING,"warning")
		.log(Status.SKIP, "skip")
		.log(Status.FAIL, "fail")
		.log(Status.FAIL, "fail");
		
		
		/*test1.pass("This is pass");
		ExtentTest test2 = extentReport.createTest("Test 2");
		test2.log(Status.FAIL,"This test failed");
		extentReport.createTest("Test 2").skip("This is skipped");
		*/
		
		
		extentReport.flush();
		Desktop.getDesktop().browse(new File(
				"C:\\\\Users\\\\pradeep.chauhan\\\\eclipse-workspace2\\\\AutomationProject\\\\extentReport\\\\MyExtentReport.html")
						.toURI());

	}

}
