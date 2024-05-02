package com.ch.azo.desktoppages;

import static org.testng.Assert.assertEquals;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.common.bean.CardDetails;
import com.ch.common.bean.NewAddress;
import com.ch.common.utils.AZOCommonUtils;
import com.ch.common.utils.TestDataFileUtility;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;

import junit.framework.Test;
import junit.framework.TestCase;

public class RegistrationPage {
	/**
	 * This function is for User should enter First Name URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * 
	 * Modified By: Last Modified Date:
	 */
	public static void enterFirstName() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.FIRST_NAME_FIELD));
		SeleniumUtils.wait(2);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.FIRST_NAME_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME),3);

	}

	/**
	 * This function is for User should enter Last Name URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void enterLastName() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.LAST_NAME_FIELD));
		SeleniumUtils.wait(2);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.LAST_NAME_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME),3);

	}

	/**
	 * This function is for User should enter Zipcode URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterZipCode() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.ZIPCODE_FIELD));
		SeleniumUtils.wait(2);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.ZIPCODE_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE),3);

	}

	/**
	 * This function is for User should enter password URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.PASSWORD_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD),3);

	}

	/**
	 * This function is for User should enter Phone Number URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPhoneNumber() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.PHONE_NUMBER_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO),3);

	}

	/**
	 * This function is for User should enter Email Id URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterEmailId() {

		String UName = "test";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYhmmss");
		String formattedDate = sdf.format(date);
		String emailId = UName + formattedDate + "@gmail.com";
		System.out.println(emailId);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.EMAIL_ID_FIELD), emailId,3);

	}

	/**
	 * This function is for User to click sign up button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickSignUp() {

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.SIGNUP_BUTTON));
		SeleniumUtils.wait(2);
	}

	/**
	 * This function is for User should create an Autozone account by entering valid
	 * inputs URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void createAnAccount() {

		enterFirstName();
		enterLastName();
		enterZipCode();
		enterPhoneNumber();
		enterEmailId();
		SeleniumUtils.wait(3);
		enterPassword();
		clickSignUp();

	}

	/**
	 * This function is for validating whether AZO account is created or not URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsAZOAccountCreated() {
		boolean flag = false;
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.WELCOME_MESSAGE));
		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.WELCOME_MESSAGE),3);


		return flag;
	}

}