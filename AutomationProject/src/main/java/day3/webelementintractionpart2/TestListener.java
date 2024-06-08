package day3.webelementintractionpart2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started ");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccess ");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestFailure");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestFailure");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage ");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart ");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish ");
		
	}
	
	

}
