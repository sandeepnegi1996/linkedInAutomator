package com.workon.utilities.comments;

import java.util.ArrayList;
import java.util.List;

import com.workon.utilities.excelReader.ExcelReader;

public class Comments {
	

	
public static List<String> getComments(ExcelReader excel) {
		
		List<String> commentsList=new ArrayList<>();
		
		String sheetName="comment_suite";
		int rows=excel.getRowCount(sheetName);
		
		for(int i=2;i<rows;i++) {
			
			String singleComment=excel.getCellData(sheetName, "COMMENTS",i);
			commentsList.add(singleComment);
			
		}
		
		
		return commentsList;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static boolean isTestRunnable(String testName, ExcelReader excel){
	 * 
	 * String sheetName="test_suite"; int rows = excel.getRowCount(sheetName);
	 * 
	 * 
	 * for(int rNum=2; rNum<=rows; rNum++){
	 * 
	 * String testCase = excel.getCellData(sheetName, "TCID", rNum);
	 * 
	 * if(testCase.equalsIgnoreCase(testName)){
	 * 
	 * String runmode = excel.getCellData(sheetName, "Runmode", rNum);
	 * 
	 * if(runmode.equalsIgnoreCase("Y")) return true; else return false; }
	 * 
	 * 
	 * } return false;
	 * 
	 * }
	 */
	
	
	
}
