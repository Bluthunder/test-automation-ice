package com.ch.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.config.RunConfig;
import com.ch.constants.FileConstants;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.FrameworkException;
import com.ch.reports.TestCaseDetail;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;
import com.ch.utils.Type;

import io.appium.java_client.AppiumDriver;

public class AZOCommonUtils {

	private AZOCommonUtils() {

	}

	public static void AZOURL(RunConfig config) throws IOException {

		if (config.getEnvironment() == null) {
			String environment = PropertyUtil.getConfigValue("ENVIRONMENT");
			config.setEnvironment(environment);
		}

		String url = getAutUrl(config.getEnvironment());
		config.setAutURL(url);
		System.out.println(" AUTURL in config " + config.getAutURL());
		System.out.println(" environment in config " + config.getEnvironment());

		String addCookie = PropertyUtil.getConfigValue("ADD_COOKIE");
		if (addCookie != null && addCookie.equalsIgnoreCase("true")) {
			try {
				System.out.println(" Adding cookie");
				DriverFactory.getDriver().get(url);
				Cookie ck = new Cookie("uxt-token", "mobilefirst");
				DriverFactory.getDriver().manage().addCookie(ck);
				System.out.println("*** Added single cookie **********" + ck.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (addCookie != null && addCookie.equalsIgnoreCase("false")) {
			try {
				DriverFactory.getDriver().get(url);
				writeToFile(DriverFactory.getDriver());
				readCookie(DriverFactory.getDriver());
				System.out.println("*** Cookies from file Cookie Added ************************");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		long navigationStart = System.currentTimeMillis();

		if (config.getBrowser().equalsIgnoreCase("IE")) {
			Runtime.getRuntime().exec(FileConstants.AUTH_IE);
		}
		if (config.getBrowser().equalsIgnoreCase("IE")) {
			SeleniumUtils
					.getURL(PropertyUtil.getPropertyValue(ObjectConstants.AZO_URL, FileConstants.SERVER_PROPERTY_FILE));

			SeleniumUtils.wait(3);
			try {
				((JavascriptExecutor) DriverFactory.getDriver())
						.executeScript("javascript:document.getElementById('invalidcert_continue').click()");
			} catch (Exception e) {
			}
		} else {
			SeleniumUtils.getURL(url);
			SeleniumUtils.wait(3);
		}

		System.out.println(" Loading URL " + url);
		// printCookies(DriverFactory.getDriver());
		// long navigationStart = System.currentTimeMillis();
		// SeleniumUtils.getURL(url);
		boolean isDocumentReady = waitForJSandJQueryToLoad(DriverFactory.getDriver());
		System.out.println("waitForJSandJQueryToLoad isDocumentReady " + isDocumentReady);
		long documentReady = System.currentTimeMillis();
		long loadTimeInSeconds = (documentReady - navigationStart) / 1000;
		String logBody = String.format("Page Load Time is %s seconds.", loadTimeInSeconds);
		System.out.println(logBody);

	}

	private static String getAutUrl(String environment) {

		String url = null;
		if (environment != null) {
			if (environment.equalsIgnoreCase("dev")) {
				url = PropertyUtil.getPropertyValue("AUT_URL_DEV", FileConstants.SERVER_PROPERTY_FILE);
			} else if (environment.equalsIgnoreCase("stage")) {
				url = PropertyUtil.getPropertyValue("AUT_URL_STAGE", FileConstants.SERVER_PROPERTY_FILE);

			} else if (environment.equalsIgnoreCase("qa")) {
				url = PropertyUtil.getPropertyValue("AUT_URL_QA", FileConstants.SERVER_PROPERTY_FILE);
			}
		}
		return url;
	}

	public static void mobileView(RunConfig config) {
		String os = config.getOs();
		switch (os.trim().toUpperCase()) {

		case "DESKTOP":
		case "IOS":
		case "ANDROID":
			break;
		case "CHROME":
			DriverFactory.getDriver().manage().window().setSize(new Dimension(375, 812));
			break;
		default:
			DriverFactory.getDriver().manage().window().setSize(new Dimension(360, 640));
		}
	}

	public static void desktopView() {
		DriverFactory.getDriver().manage().window().maximize();

	}

	public static void tabletView() {
		DriverFactory.getDriver().manage().window().setSize(new Dimension(900, 668));
	}

	public static float getFloatFromString(String value) {
		if (value.contains("$") && value.contains(",") && value.contains(".")) {

			String[] a = value.split(",");
			String[] b = a[0].split("\\$");
			String var = a[1] + b[1];
			return Float.parseFloat(var);
		} else if (value.startsWith("$") && value.contains(".")) {

			return Float.parseFloat(value.substring(1));
		} else if (value.contains(".")) {

			return Float.parseFloat(value);
		} else if (value.startsWith("$")) {

			return Float.parseFloat(value.substring(1));
		} else if (!(value.contains("$") && value.contains("."))) {

			return Float.parseFloat(value);
		}
		return 0;
	}

	public static String setupEnvironment(String URL) {
		String environmentName = "";

		if (URL.contains("www.")) {
			environmentName = "STAGE";
		} else if (URL.contains("qa3")) {
			environmentName = "QA3";
		} else {
			environmentName = "QA4";
		}
		System.out.println("environmentName ->" + environmentName);
		return environmentName;
	}

	public static String createRandomPhoneNumber() {
		int num1, set2;
		Random generator = new Random();
		num1 = 9;
		set2 = generator.nextInt(643612349) + 100;
		String str1 = Integer.toString(num1);
		String phoneNumber = str1 + set2;
		return phoneNumber;

	}

	/**
	 * This function is used for validating SDD in SHELF/ PDP/ CART URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isSDDOptionDisplayed() {
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.SDD_TEXT_IN_SHELF), 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * This function is used for validating cutoff time for SDD in SHELF/ PDP/ CART
	 * URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isCutOffTimeDisplayed() {
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.CUTOFF_TIME_TEXT), 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void handleGotItPopUp() {
		boolean flag = false;
		try {
			SeleniumUtils.wait(2);
			flag = SeleniumUtils
					.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.GOT_IT_POPUP), 1);
			if (flag) {
				SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.GOT_IT_POPUP));

			}

		} catch (Exception e) {
			flag = false;
		}

	}

	public static boolean isHandleLiveChatPopUp() {
		boolean flag = false;
		try {

			// SeleniumUtils.wait(2);
			flag = SeleniumUtils
					.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.LIVE_CHAT_POPUP));

		} catch (Exception e) {
			flag = false;
		}
		return flag;

	}

	public static void handleLiveChatPopUp() {
		if (isHandleLiveChatPopUp()) {
			System.out.println("true");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.LIVE_CHAT_POPUP));

		} else {
			System.out.println("false");
		}
	}

	/**
	 * This function is to close the browser URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void closeTheBrowser() {
		try {

			SeleniumUtils.quitDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function is used for validating NDD in SHELF/ PDP/ CART URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isNDDOptionDisplayed() {
		boolean flag = false;
		try {

			flag = SeleniumUtils
					.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.NDD_TEXT), 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void clickHamburgerMenuInMob() {
		try {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE,
					ObjectConstants.HAMBURGER_MENU_LINK_MOBILE));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickSigninLinkInMob() {
		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.SIGNIN_LINK_MOBILE));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendKeysOnMobile(String inputVal) {
		try {
			String browserName = PropertyUtil.getConfigValue("BROWSER_NAME");
			switch (browserName.trim()) {

			case "iossafari":
			case "seetest_iOS":
			case "seetest_android":
				AppiumDriver ad = (AppiumDriver) new DriverFactory().getDriver();
				for (int i = 0; i < inputVal.length(); i++) {
					char c = inputVal.charAt(i);
					String s = new StringBuilder().append(c).toString();
					ad.getKeyboard().sendKeys(s);
				}
				ad.hideKeyboard();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 private void AcceptLocationAlert(boolean accept)
//
//
//	     {​​​​​​​
//	         if(osType.equalsIgnoreCase("android")) {​​​​​​​
//	             AcceptLocationAlertAndroid(accept,(AndroidDriver) DriverFactory.getDriver());
//	             }​​​​​​​ 
//	         else if(osType.equalsIgnoreCase("ios")) {​​​​​​​
//	                 AcceptLocationAlertIOS(accept,(IOSDriver) DriverFactory.getDriver());
//	             }​​​​​​​
//	     }​​​​​​​
//
//
//	     private void AcceptLocationAlertIOS(boolean accept, IOSDriver iOSDriver)
//
//
//	     {​​​​​​​
//	         try {​​​​​​​
//	                 Set<String> contextNames = iOSDriver.getContextHandles();
//	                 for (String contextName : contextNames)
//	                 {​​​​​​​ 
//	                     System.out.println(contextName); 
//	                 }​​​​​​​ 
//	                 String cur = iOSDriver.getContext();
//	                 System.out.println(cur);
//	                 iOSDriver.context("NATIVE");
//	                 if(accept)
//	                 {​​​​​​​
//	                     //iOSDriver.findElement(By.xpath("//*[@class='UIAView' and @width>0 and ./*[@text='OK']]")).click();
//	                     iOSDriver.findElement(By.xpath("//*[@text='Allow']")).click();
//	                 }​​​​​​​
//	                 else
//	                 {​​​​​​​
//	                     iOSDriver.findElement(By.xpath("//*[@class='UIAView' and @width>0 and ./*[@text='Don’t Allow']]")).click();
//	                 }​​​​​​​
//	     
//	                 iOSDriver.context("WEBVIEW_1");
//	         }​​​​​​​ catch (Exception e) {​​​​​​​
//	                 iOSDriver.context("WEBVIEW_1");
//	         }​​​​​​​
//	     }​​​​​​​
//	     
//	     
//	     private void AcceptLocationAlertAndroid(boolean accept, AndroidDriver androidDriver)
//	     {​​​​​​​
//	         try {​​​​​​​
//	                 Set<String> contextNames = androidDriver.getContextHandles();
//	                 for (String contextName : contextNames)
//	                 {​​​​​​​ 
//	                     System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1 
//	                 }​​​​​​​ 
//	                 String cur = androidDriver.getContext();
//	                 System.out.println(cur);
//	                 androidDriver.context("NATIVE");
//	                 if(accept)
//	                 {​​​​​​​
//	                     androidDriver.findElement(By.xpath("//*[@text='Allow']")).click();
//	                 }​​​​​​​
//	                 else
//	                 {​​​​​​​
//	                     androidDriver.findElement(By.xpath("//*[@text='Block']")).click();
//	                 }​​​​​​​
//	     
//	                 androidDriver.context("WEBVIEW_1");
//	         }​​​​​​​ catch (Exception e) {​​​​​​​
//	                 androidDriver.context("WEBVIEW_1");
//	         }​​​​​​​
//	     }​​​​​​​
//

	public static void writeToFile(WebDriver driver) {
		try {
			String base_dir = new File(".").getCanonicalPath();
			File myObj = new File(base_dir + "/resources/cookie.data");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				FileWriter fileWriter = new FileWriter(myObj);
				BufferedWriter bwrite = new BufferedWriter(fileWriter);
				for (Cookie ck : DriverFactory.getDriver().manage().getCookies()) {

					String value = ck.getValue();
					if (value != null && value.trim().length() > 1) {
						value = ck.getValue();
					} else {
						value = "null";
					}
					bwrite.write((ck.getName() + ";" + value + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
							+ ck.getExpiry() + ";" + ck.isSecure()));
					bwrite.newLine();
				}
				bwrite.close();
				fileWriter.close();
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void readCookie(WebDriver driver) {
		try {
			String base_dir = new File(".").getCanonicalPath();
			File file = new File(base_dir + "/resources/cookie.data");// resources//cookie.data

			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				// System.out.println("strline -->" + strline);
				String name = null;
				String value = null;
				String domain = null;
				String path = null;
				String expirydDateStr = null;
				String isSecureStr = null;
				if (token.hasMoreTokens()) {
					name = token.nextToken();
				}
				if (token.hasMoreElements()) {
					value = token.nextToken();
				}
				if (token.hasMoreElements()) {
					domain = token.nextToken();
				}
				if (token.hasMoreElements()) {
					path = token.nextToken();
				}
				if (token.hasMoreElements()) {
					expirydDateStr = token.nextToken();
				}
				if (token.hasMoreElements()) {
					isSecureStr = token.nextToken();
				} else if (token.hasMoreElements()) {
					// value = token.nextToken();
				}
				boolean isSecure = false;
				Date expiry = null;

				if (expirydDateStr != null && !expirydDateStr.equalsIgnoreCase("null")) {
					DateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
					try {
						expiry = format.parse(expirydDateStr);

					} catch (ParseException e) {

						e.printStackTrace();
					}

				}
				if (isSecureStr != null) {
					// System.out.println("isSecureStr -->" + isSecureStr);
					isSecure = new Boolean(isSecureStr).booleanValue();
				}
				Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
				// System.out.println(ck);
				driver.manage().addCookie(ck); // This will add the stored cookie to your current session

			}
			Buffreader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void assertTest(TestCaseDetail testcase, boolean assertValue, String pass, String fail) {
		testcase.assertTrue(assertValue, pass, fail);
		if (assertValue) {
			testcase.pass(pass);
		}
		try {
			AbstractTestCaseReport.sendPassOrFailInfo(testcase);
		} catch (FrameworkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AZOCommonUtils.closeTheBrowser();
	}

	public static void waitUntilElementIsVisible(ExcelBean bean) {

		String type = bean.getType();
		String element = bean.getValue();
		// WebElement element1 = null;

		WebDriverWait Explicitwait = new WebDriverWait(DriverFactory.getDriver(), 5);
		// wait until element is visible
		if (type.equals(Type.CSSSELECTOR.name())) {

			// Explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
			Explicitwait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(element))));
		} else if (type.equals(Type.XPATH.name())) {
			// Explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
			Explicitwait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(element))));
		}

	}

	public static boolean waitForJSandJQueryToLoad(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					System.out.println(" jQuery.active ");
					Long jQueryActiveFlag = (Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active");
					System.out.println(" jQuery.active value " + jQueryActiveFlag);
					return (jQueryActiveFlag == 0);
				} catch (Exception e) {
					// no jQuery present
					return true;
				}
			}
		};

		// wait for Javascript to load
		// "complete" means the document was fully read and all resources (like images)
		// are loaded too.
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				System.out.println(" return document.readyState ");
				Object readyState = ((JavascriptExecutor) driver).executeScript("return document.readyState");
				System.out.println(" return document.readyState " + readyState.toString());
				return (readyState.toString().equals("complete"));
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

}
