package com.project.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	

	public void onStart(ITestContext context) {
		System.out.println(" Test execution is started..");
		
	}

	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started..");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass");
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		
	}

		public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
	
	

}