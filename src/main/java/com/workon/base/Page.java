package com.workon.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.workon.utilities.excelReader.ExcelReader;
import com.workon.utilities.loggers.Log;

public class Page {

	public static WebDriver driver = null;
	public static Actions action = null;
	public static WebDriverWait wait = null;
	private static ChromeOptions chromeoptions = null;
	public static boolean isDashboardPUrl = false;
	public static Properties prop = null;
	public static FileInputStream input = null;
	public static FluentWait<WebDriver> fluentwait = null;
	public static JavascriptExecutor js=null;

	public static String rootDir = System.getProperty("user.dir");

	public static ExcelReader excel = new ExcelReader(rootDir + "\\src\\main\\resources\\excel\\testdata.xlsx");

	public static String getRootDir() {
		return System.getProperty("user.dir");
	}

	public static void initConfiguration() throws IOException {

		if (driver == null) {

			prop = new Properties();
			String configPath = getRootDir() + "\\src\\main\\resources\\config\\config.properties";
			input = new FileInputStream(configPath);
			prop.load(input);

			if (prop.getProperty("BROWSER_NAME").equals("chrome")) {

				setChromeDriverPath();
				driver = new ChromeDriver();

			}

			else if (prop.getProperty("BROWSER_NAME").equals("firefox")) {
				setFirefoxDriverPath();
				FirefoxOptions opts = new FirefoxOptions();
				opts.addArguments("-private");
				driver = new FirefoxDriver(opts);

			}

			else if (prop.getProperty("BROWSER_NAME").equals("internetexplorer")) {
				setInternetExplorerDriverPath();

				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-incognito");
				InternetExplorerOptions ops = new InternetExplorerOptions(capabilities);

				driver = new InternetExplorerDriver(ops);

			}

			try {

				String baseUrl = prop.getProperty("DashboardQUrl");

				driver.manage().window().maximize();
				driver.get(baseUrl);
				action = new Actions(driver);
				wait = new WebDriverWait(driver, 20);

				fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);

				Log.info("webdriver is created");
				 js = (JavascriptExecutor) driver;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	// quitBrowser
	public static void quitBrowser() {

		if (driver != null) {

			driver.quit();
			driver = null;

		}
	}

	public static void setChromeDriverPath() {
		String chromedriverPath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromedriverPath);

	}

	public static void setFirefoxDriverPath() {
		String firefoxdriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

	}

	public static void setInternetExplorerDriverPath() {
		String internetExplorerDriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\IEDriverServer.exe";

		System.setProperty("webdriver.ie.driver", internetExplorerDriverpath);

	}

	public static ChromeOptions setChromeOptions() {
		chromeoptions = new ChromeOptions();
		/*
		 * chromeoptions.addArguments("start-maximized");
		 * 
		 * chromeoptions.addArguments("disable-extensions");
		 * 
		 * chromeoptions.addArguments("--disable-popup-blocking");
		 * 
		 * chromeoptions.addArguments("--diable-infobars");
		 */
	//	chromeoptions.addArguments("--incognito");
		
		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
		 */

		return chromeoptions;
	}

	// click
	public static void click(WebElement element) {

		waitForElementToBePresent(element);

		try {
			element.click();
			Log.info("Clicked on the element:  " + element.toString());
		} catch (NoSuchElementException e) {
			Log.info("not able to click on the element" + element);
		} catch (Exception e) {
			Log.info("Not able to catch the exception using NoSuchElement Exceotion");
		}

	}

	// type
	public void type(WebElement element, String inputString) {

		waitForElementToBePresent(element);
		element.sendKeys(inputString);

		Log.info("Typed on the element :  " + element.toString());
	}

	// any child class can use this function to switch to the new tab
	public void switchToSecondTab(WebDriver driver) {

		Log.info("******  Switching to Second Tab  ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		itr.next();
		String secondWindow = itr.next();
		driver.switchTo().window(secondWindow);

	}

	// use this function to switch to the third tab

	public void switchToThirdTab(WebDriver driver) {

		Log.info("******  Swtiching to third tab ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		itr.next();
		itr.next();
		String thirdWindowId = itr.next();
		driver.switchTo().window(thirdWindowId);

	}

	public void switchToAnyTab(WebDriver driver, int tabNumber) {

		Log.info("******  Switching to Second Tab  ************");
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();

		String currentTab = "";
		for (int i = 1; i <= tabNumber; i++) {
			currentTab = itr.next();
		}

		driver.switchTo().window(currentTab);

	}

	public void selectOption(WebElement element, String value) {

		

		Select select = new Select(element);
		waitForElementToBePresent(element);
		waitForElementToBePresent(element);
		select.selectByValue(value);

	}


	public void clickOnWorkflowTab() {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Workflow')]"));
		waitForElementToBePresent(driver.findElement(By.xpath("//a[contains(text(),'Workflow')]")));

		element.click();
		Log.info("Clicked on the workflow tab ");
	}

	public void displayRequestKey() {

	
			Log.info(getRequestKey());

	}

	public static String getRequestKey() {

		WebElement element = driver.findElement(By.xpath("//b[contains(text(),'Key:')]//following-sibling::b//a"));
		waitForElementToBePresent(element);
		return element.getText();
	}

	public void clickOnSubmitButton() throws InterruptedException {

		WebElement submitButton = driver.findElement(By.xpath("//input[@id='WorkOnSubmitButton']"));

		
		submitButton.click();
		
		Thread.sleep(15000);


	}


	public static void waitForSeconds(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}


	public static WebElement waitForElementInSecondsExplicitly(By by) {

		return wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}


	public static boolean isElementPresent(final By by) {

		WebElement element = fluentwait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(by);
			}

		});

		if (element != null) {
			Log.info("Element is present :  " + by.toString());
			return true;
		}

		return false;

	}


	public static WebElement waitForElementToBePresent(WebElement element) {

		fluentwait.until(ExpectedConditions.visibilityOf(element));

		return element;

	}

	public static String getElementText(By by) {

		WebElement element = driver.findElement(by);
		waitForElementToBePresent(element);

		return element.getText();

	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public boolean isApproverButtonPresent() {
		List<WebElement> listOfWebElement = driver.findElements(By.xpath("//a[contains(text(),'Approve')]"));

		if (!listOfWebElement.isEmpty()) {
			Log.info(" *******   Approver Button Present  *********  ");
			return true;
		}

		Log.info("********  Approver Button not Present  **********");
		return false;
	}

	public void clickApproverButton() {
		WebElement approveElement = driver.findElement(By.xpath("//a[contains(text(),'Approve')]"));
		click(approveElement);

		Log.info("****  Clicking on the Approver Button  *******");
	}
	




}
