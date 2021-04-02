package com.workon.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 0;

	public boolean retry(ITestResult arg0) {

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
