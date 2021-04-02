package com.workon.utilities.testUtil;

import com.workon.base.Page;
import com.workon.utilities.excelReader.ExcelReader;
import com.workon.utilities.ziputils.ZipUtils;

public class TestUtil extends Page {
	
	

	//Checking that the excel sheet contains run modes 
	//then calling this functions in the test cases to check whether it is Yes or No
public static boolean isTestRunnable(String testName, ExcelReader excel){
		
		String sheetName="test_suite";
		int rows = excel.getRowCount(sheetName);
		
		
		for(int rNum=2; rNum<=rows; rNum++){
			
			String testCase = excel.getCellData(sheetName, "TCID", rNum);
			
			if(testCase.equalsIgnoreCase(testName)){
				
				String runmode = excel.getCellData(sheetName, "Runmode", rNum);
				
				if(runmode.equalsIgnoreCase("Y"))
					return true;
				else
					return false;
			}
			
			
		}
		return false;
	}


	public static void sendReport() {
		/* EmailManager.sendEmailWithAttachment(); */
	}
	
	public static void zipReport() {
		
		ZipUtils.zipReportFolder();
		
	}
	
	
	



}
