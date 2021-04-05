package com.workon.dataprovider;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class DP {

	public String getUser(String user) {
		String rootDir = System.getProperty("user.dir");
		Properties prop = new Properties();
		String configPath = rootDir + "\\src\\main\\resources\\config\\config.properties";

		try (FileInputStream input = new FileInputStream(configPath);) {

			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(user);
	}

	@DataProvider(name = "ntidProvider")
	public Object[][] ntidProvider() {

		String workontestuser1 = getUser("testUser1");
		return new Object[][] { { workontestuser1 }};
	}
	


}
