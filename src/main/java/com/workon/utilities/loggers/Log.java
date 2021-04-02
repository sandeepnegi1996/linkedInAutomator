package com.workon.utilities.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	private static Logger logger = LogManager.getLogger("devpinoyLogger");

	public static void startTestCase(String testCaseName) {

		logger.info("*******************************************************************************************");

		logger.info("****************************************************************************************");

		logger.info("$$$$$$$$$$$$$$$$$$$$$                 " + testCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

		logger.info("****************************************************************************************");

		logger.info("*******************************************************************************************");

	}

	public static void endTestCase(String testCaseName) {

		logger.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");
		
		logger.info("*******************************************************************************************");

		logger.info("****************************************************************************************");

		logger.info("XXXXXXXXXXXXXXXXXXXXXX                 " + testCaseName + "       XXXXXXXXXXXXXXXXXXXXXXXXXX");

		logger.info("****************************************************************************************");

		logger.info("*******************************************************************************************");

		logger.info("X");

		

	}

	public static void info(String message) {
		logger.info("=====================================================");

		logger.info("************** " + message + " ********************");
		logger.info("=====================================================");

	}

	public static void warn(String message) {
		logger.info("=====================================================");

		logger.info("************** " + message + " ********************");
		
		logger.info("=====================================================");

	}

	public static void error(String message) {
		logger.info("=====================================================");

		logger.info("************** " + message + " ********************");
		logger.info("=====================================================");

	}

	public static void fatal(String message) {
		logger.info("=====================================================");


		logger.info("************** " + message + " ********************");
		logger.info("=====================================================");


	}

	public static void debug(String message) {

		logger.info("=====================================================");

		logger.info("************** " + message + " ********************");
		logger.info("=====================================================");


	}

}
