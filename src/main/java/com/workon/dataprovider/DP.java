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
	
	@DataProvider(name = "currentLoginUser")
	public Object[][] currentLoginUser() {

		String workontestuser = getUser("testUser");
		return new Object[][] { { workontestuser }};
	}

	@DataProvider(name = "serialApproverProvider")
	public Object[][] serialApproverProvider() {

		String workontestuser1 = getUser("testUser1");
		String workontestuser2 = getUser("testUser2");
		return new Object[][] { { workontestuser1, workontestuser2 } };
	}

	@DataProvider(name = "parallelApproverProvider")
	public Object[][] parallelApproverProvider() {

		String workontestuser1 = getUser("testUser1");
		String workontestuser2 = getUser("testUser2");
		return new Object[][] { { workontestuser1, workontestuser2 } };
	}

	// ccProvider
	@DataProvider(name = "ccProvider")
	public Object[][] ccProvider() {

		String workontestuser1 = getUser("testUser1");
		String workontestuser2 = getUser("testUser2");
		return new Object[][] { { workontestuser1, workontestuser2 } };

	}

	// forward Request Provider
	@DataProvider(name = "forwardRequestProvider")
	public Object[][] forwardRequestProvider() {

		String workontestuser = getUser("testUser");
		String workontestuser1 = getUser("testUser1");

		return new Object[][] { { workontestuser, workontestuser1 } };

	}

	// substitute provider
	@DataProvider(name = "substituteProvider")
	public Object[][] subtitueProvider() {

		String workontestuser1 = getUser("testUser1");

		return new Object[][] { { workontestuser1 } };
	}

	// BCD user testing
	@DataProvider(name = "bcdUserProvider")
	public Object[][] bcdUserProvider() {

		String bcdUser = getUser("bcdUser");

		return new Object[][] { { bcdUser } };
	}

	// BCD group testing
	@DataProvider(name = "bcdGroupProvider")
	public Object[][] bcdGroupProvider() {

		String bcdGroup = getUser("bcdGroup");

		return new Object[][] { { bcdGroup } };
	}

	// BCD group testing
	@DataProvider(name = "wpdGroupProvider")
	public Object[][] wpdGroupProvider() {

		String wpdGroup = getUser("wpdGroup");

		return new Object[][] { { wpdGroup } };
	}

}
