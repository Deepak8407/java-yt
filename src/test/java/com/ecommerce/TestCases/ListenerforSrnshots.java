package com.ecommerce.TestCases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerforSrnshots extends BaseClassScreenshots implements ITestListener {
	
		@Override
		public void onTestStart(ITestResult result) {
			
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			
		}
		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Test Failed....");
			failed();
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			
		}
}
