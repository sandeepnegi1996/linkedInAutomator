package com.workon.testrunner;

import org.testng.TestNG;

import com.workon.testcases.generic.TestCase_BCDIntegrationUsers;

public class TestRunner {

	static TestNG testng;

	public static void main(String[] args) {


		TestNG testng = new TestNG();


		testng.setTestClasses(new Class[] {

				TestCase_BCDIntegrationUsers.class,
				
				
				/*
				 * TestCase_AP8DRequestCreation.class, TestCase_APMAZERequestCreation.class,
				 * TestCase_RBUBKPARequestCreation.class, TestCase_STGARequestCreation.class,
				 * TestCase_RBGARequestCreation.class, TestCase_EMEAAVGRequestCreation.class,
				 * TestCase_APGARequestCreation.class,
				 * TestCase_AMLACSALTPRECOLANCRequestCreation.class,
				 * TestCase_CNTERMRequestCreation.class, TestCase_SaveAsDraft.class,
				 * TestCase_DeleteAsDraft.class, TestCase_CopyRequest.class,
				 * TestCase_PrintRequest.class, TestCase_SuspendRequest.class,
				 * TestCase_ForwardRequest.class, TestCase_SerialRequestCreation.class,
				 * TestCase_ParallelRequestCreation.class, TestCase_CCList.class,
				 * TestCase_VerifyButtonsRBGA.class
				 */
				 

		}
		);

		testng.run();

		
		// regression
		/*
		 * testng.setTestClasses(new Class[] { TestCase_SaveAsDraft.class,
		 * TestCase_DeleteAsDraft.class, TestCase_CopyRequest.class,
		 * TestCase_PrintRequest.class, TestCase_SuspendRequest.class,
		 * TestCase_ForwardRequest.class, TestCase_SerialRequestCreation.class,
		 * TestCase_ParallelRequestCreation.class, TestCase_CCList.class,
		 * TestCase_VerifyButtonsRBGA.class });
		 */

		// Dashboard

		// TestCase_DashboardSessionExpiredIsuue
		// testng.setTestClasses(new Class[] {
		// TestCase_DashboardSessionExpiredIsuue.class });

	}

}
