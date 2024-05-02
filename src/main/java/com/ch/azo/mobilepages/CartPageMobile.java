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

public class CartPageMobile
{
	/**
	 * This function is to click on checkout button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnCheckoutButtonInMobile()
	{
		try {
			//SeleniumUtils.javaScriptExecutorDown("200");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CHECKOUT_BUTTON));
			SeleniumUtils.wait(1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
	/**
	 * This function is to click on continue shopping button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnContinueShoppingButtonInMobile()
	{
		try {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CONTINUE_SHOPPING_BUTTON));
			SeleniumUtils.wait(1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
//	/**
//	 * This function is to click on paypal in cart
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void clickOnExpressPaypalInCartInMobile()
//	{
//		try {
//			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.PAYPAL_OPTION_IN_CART));
//			SeleniumUtils.wait(1);
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//	}
//	/**
//	 * This function is to 
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void enterMailIdInPaypalInMobile()
//	{
//		try {
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID),
//					PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID));
//			SeleniumUtils.wait(1);
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//	}
//	/**
//	 * This function is to 
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void enterPaswordInPaypalInMobile()
//	{
//		try {
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_PASSWORD),
//					PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD));
//			SeleniumUtils.wait(1);
//			
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//	}
//	/**
//	 * This function is to click on PAYPAL login button
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void clickOnPAYPALLoginButton()
//	{
//		try {
//			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_PAYPAL_LOGIN));
//			SeleniumUtils.wait(1);
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//	}
//	
//	/**
//	 * This function is to paypal
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void paypalPaymentInMobile()
//	{
//		try
//		{
//			enterMailIdInPaypalInMobile();
//			enterPaswordInPaypalInMobile();
//			clickOnPAYPALLoginButton();
//			
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//
//	}
//	/**
//	 * This function is to click on continue button
//	 * URL.
//	 * @throws Throwable
//	 * Created By:			Himanshu Nayan
//	 * Created Date:		10/02/2020
//	 * Last Modified By:	
//	 * Last Modified Date:	
//	 */
//	public static void clickOnContinueButton()
//	{
//		try {
//			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_CONTINUE_PAYPAL));
//			SeleniumUtils.wait(1);
//		}catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//	}
	
	
	/**
	 * This function is for validating whether cart page is empty
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsCartPageEmptyInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.TEXT_CART_EMPTY));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
}