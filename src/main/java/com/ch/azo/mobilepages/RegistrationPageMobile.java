
package com.ch.azo.mobilepages;

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
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;
import junit.framework.TestCase;

public class RegistrationPageMobile
{

	/**
	 * This function is for User should enter First Name 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterFirstName()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.FIRST_NAME_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.FIRST_NAME_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.FIRST_NAME_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}
		

	}

	/**
	 * This function is for User should enter Last Name 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterLastName()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
//							ObjectConstants.LAST_NAME_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.LAST_NAME_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.LAST_NAME_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}


	/**
	 * This function is for User should enter Zipcode 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterZipCode()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
//							ObjectConstants.ZIPCODE_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.ZIPCODE_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.ZIPCODE_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}
	
	/**
	 * This function is for User should enter password 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPassword()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
//							ObjectConstants.PASSWORD_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.PASSWORD_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.PASSWORD_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User should enter Phone Number 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPhoneNumber()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
//							ObjectConstants.PHONE_NUMBER_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.PHONE_NUMBER_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.PHONE_NUMBER_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}


	/**
	 * This function is for User should enter Email Id 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterEmailId()
	{
//		try
//		{
//			String UName="test";
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhmmss");
//			String formattedDate = sdf.format(date);
//			String emailId=(UName+formattedDate+"@gmail.com");
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
//							ObjectConstants.EMAIL_ID_FIELD),emailId);
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
			String UName="test";
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhmmss");
			String formattedDate = sdf.format(date);
			String emailId=(UName+formattedDate+"@gmail.com");
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,ObjectConstants.EMAIL_ID_FIELD));
		//AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(emailId));
		AZOCommonUtils.sendKeysOnMobile(emailId);
		}else {
			SeleniumUtils.sendKeys(
					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE,
							ObjectConstants.EMAIL_ID_FIELD),emailId);
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User to click sign up button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickSignUp()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.SIGNUP_BUTTON));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * This function is for User should create an Autozone account by entering valid inputs
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void createAnAccount()
	{
		try
		{
			enterFirstName();
			enterLastName();
			enterZipCode();
			enterPhoneNumber();
			enterEmailId();
			enterPassword();
			clickSignUp();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * This function is for validating whether AZO account is created or not
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsAZOAccountCreatedInMobile()
	{
		boolean flag = false;
		try
		{
			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.REGISTRATIONPAGE, ObjectConstants.WELCOME_MESSAGE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}










}