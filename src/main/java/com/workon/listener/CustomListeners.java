package com.workon.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.workon.utilities.loggers.Log;

public class CustomListeners implements ITestListener{
	
	private static final String CUSTOM="##############################################################";
	
	public String getCustomization() {
		return CustomListeners.CUSTOM;
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
	
		Log.info(getCustomization());
		Log.info("");
		Log.info(result.getName());
		Log.info("");
		Log.info(getCustomization());
		
		
	}
	
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Log.info(getCustomization());
		Log.info("");
		Log.info("Test Case Sucessfully Completed ");
		Log.info("Test Case Finished is : "+result.getName());
		Log.info("");
		Log.info(getCustomization());
		
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		Log.info(getCustomization());
		Log.info("");
		Log.info("Test case is failed");
		Log.info("");
		Log.info("Failed Test case name is : "+result.getName());
		Log.info("");
		Log.info(getCustomization());
		
		
	}
	
	public void onTestFinish(ITestResult result) {
		
		Log.info(getCustomization());
		Log.info("");
		Log.info("");
		Log.info(" Test is Finished "+result.getTestClass().getName());
		Log.info("");
		Log.info(getCustomization());
		
	}
		

}
