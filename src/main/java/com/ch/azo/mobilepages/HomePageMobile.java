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
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;
import junit.framework.TestCase;

public class HomePageMobile 
{



	/**
	 * This function is for User should enter valid username 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterUserName()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,
//							ObjectConstants.EMAIL_ID_TEXT_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,ObjectConstants.EMAIL_ID_TEXT_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,ObjectConstants.EMAIL_ID_TEXT_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User should enter valid password 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPassword()
	{
		
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,
//							ObjectConstants.PASSWORD_TEXT_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
			
			try
			{
			if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,ObjectConstants.PASSWORD_TEXT_FIELD));
			AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
			}else {
			SeleniumUtils.sendKeys(
			ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE,ObjectConstants.PASSWORD_TEXT_FIELD),
			PropertyUtil.getObjectValue(ObjectConstants.PASSWORD));
			}

			} catch (Exception e)
			{
			e.printStackTrace();
			}

		

	}


	/**
	 * This function is for User to click sign In button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickSignInButton()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.SIGN_IN_BUTTON_IN_SIGNIN_PAGE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to Sign In to AZO
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void signInToAccountInMobile()
	{
		try
		{
			enterUserName();
			enterPassword();
			clickSignInButton();
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

	public static boolean IsUserLoggedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.MY_ACCOUNT_LINK_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * This function is for User to click create an account link in mob
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickCreateAnAccountLinkInMob()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.CREATE_AN_ACCOUNT_LINK_MOBILE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click my account link in mob
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickMyAccountLinkInMob()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.MY_ACCOUNT_LINK_MOBILE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click signout link in mob
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickSignouttLinkInMob()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.SIGNOUT_LINK_MOBILE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for validating whether user is logged out from the site or not
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsUserLoggedOutMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.HOMEPAGEMOBILE, ObjectConstants.SIGNIN_LINK_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}

}