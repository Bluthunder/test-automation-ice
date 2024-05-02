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
import org.openqa.selenium.support.ui.Select;
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

public class CheckoutPageMobile
{

	/**
	 * This function is for User should enter First Name in shipping address 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterFirstNameInAddressInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.FIRST_NAME_FIELD_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.FIRST_NAME_FIELD_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.FIRST_NAME_FIELD_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User should enter Last Name in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterLastNameInAddressInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.LAST_NAME_FIELD_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.LAST_NAME_FIELD_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.LAST_NAME_FIELD_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}


	/**
	 * This function is for User should enter Zipcode in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterZipCodeInAddressInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.ZIPCODE_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.SDD_ZIPCODE));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.ZIPCODE_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.SDD_ZIPCODE));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.ZIPCODE_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.SDD_ZIPCODE));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	
	/**
	 * This function is for User should enter Phone Number in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPhoneNumberInAddressInMobile()
    {
//        try
//        {
//        	SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.PHONE_NUMBER_FIELD_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
        	
        	try
    		{
    		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
    		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.PHONE_NUMBER_FIELD_IN_SHIPPING));
    		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
    		}else {
    		SeleniumUtils.sendKeys(
    		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.PHONE_NUMBER_FIELD_IN_SHIPPING),
    		PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO));
    		}

    		} catch (Exception e)
    		{
    		e.printStackTrace();
    		}
        
    }


	/**
	 * This function is for User should enter Email Id in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterEmailIdInAddressInMobile()
	{
//		try
//		{
//			String UName="test";
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhmmss");
//			String formattedDate = sdf.format(date);
//			String emailId=(UName+formattedDate+"@gmail.com");
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.EMAIL_ID_IN_SHIPPING),emailId);
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
//			String UName="test";
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhmmss");
//			String formattedDate = sdf.format(date);
//			String emailId=(UName+formattedDate+"@gmail.com");
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
			
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.EMAIL_ID_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_5));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.EMAIL_ID_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_5));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}
	/**
	 * This function is for User should enter address in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterAddressInAddressInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.ADDRESS1_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_ADDRESS1));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.ADDRESS1_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_ADDRESS1));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.ADDRESS1_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_ADDRESS1));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}
	/**
	 * This function is for User to select state in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void selectStateInAddressInMobile(String State)
	{
		try
		{
//			SeleniumUtils.dropDownByVisibleText(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//                    ObjectConstants.STATE_IN_SHIPPING), State);
			Select dropdown = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@name='state']")));
			//dropdown.selectByValue("TENNESSEE");
			dropdown.selectByValue("TN");
//			WebElement element = DriverFactory.getDriver().findElement(By.xpath(ExcelProperty
//                    .getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID).getValue()));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
//		try
//		{
//		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
//		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.STATE_IN_SHIPPING));
//		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(State));
//		By driver;
//		
//		
//		
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='state']")));
//		dropdown.selectByValue("TN");
//		
//		}else {
////		SeleniumUtils.sendKeys(
////		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.STATE_IN_SHIPPING),
////		PropertyUtil.getObjectValue(State));
//			SeleniumUtils.dropDownByVisibleText(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//                  ObjectConstants.STATE_IN_SHIPPING), State);
//		}
//
//		} catch (Exception e)
//		{
//		e.printStackTrace();
//		}

	}
	/**
	 * This function is for User should enter city in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterCityInAddressInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.CITY_IN_SHIPPING),
//					PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_CITY1));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.CITY_IN_SHIPPING));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_CITY1));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.CITY_IN_SHIPPING),
		PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_CITY1));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User to click save button in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickSaveButtonInMobile()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.SAVE_BUTTON_IN_SHIPPING));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click keep this address button in shipping address
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickKeepThisAddresseButtonInMobile()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.KEEP_THIS_ADDRESS_BUTTON));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * This function is for User should enter shipping address details
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterShippingDetailsInMobile()
	{
		try
		{
			enterFirstNameInAddressInMobile();
			enterLastNameInAddressInMobile();
			enterPhoneNumberInAddressInMobile();
			enterEmailIdInAddressInMobile();
			enterAddressInAddressInMobile();
			enterCityInAddressInMobile();
			enterZipCodeInAddressInMobile();
						
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User should enter billing address details
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterBillingDetailsInMobile()
	{
		try
		{
			enterFirstNameInAddressInMobile();
			enterLastNameInAddressInMobile();
			enterPhoneNumberInAddressInMobile();
			enterEmailIdInAddressInMobile();
			enterAddressInAddressInMobile();
			enterCityInAddressInMobile();
			enterZipCodeInAddressInMobile();
						
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * This function is for validating whether shipping address is displayed
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsShippingAddressDisplayedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGEMOBILE, ObjectConstants.SHIPPING_DETAILS_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * This function is for validating whether billing address is displayed
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsBillingAddressDisplayedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGEMOBILE, ObjectConstants.BILLING_DETAILS_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * This function is for User should enter credit card number
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterCreditCardNumberInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.CARD_NUMBER_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.CC_NO1));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.CARD_NUMBER_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.CC_NO1));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.CARD_NUMBER_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.CC_NO1));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	/**
	 * This function is for User should enter Credit Card Expiry Date 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterCCExpiryDateInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.EXPIRY_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.CC_EXP1));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.EXPIRY_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.CC_EXP1));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.EXPIRY_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.CC_EXP1));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}


	

	/**
	 * This function is for User should enter Credit Card CVV 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterCreditCardCVVInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
//							ObjectConstants.SECURITY_FIELD),
//					PropertyUtil.getObjectValue(ObjectConstants.CC_CVV1));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.SECURITY_FIELD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.CC_CVV1));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.SECURITY_FIELD),
		PropertyUtil.getObjectValue(ObjectConstants.CC_CVV1));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}


	

	

	/**
	 * This function is for User should enter all the valid inputs for creditcard
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterCreditCardDetailsInMobile()
	{
		try
		{
			enterCreditCardNumberInMobile();
			enterCCExpiryDateInMobile();
			enterCreditCardCVVInMobile();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	
	
	/**
	 * This function is for User should enter Paypal EmailID 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPaypalEmailAddressInMobile()
	{
//		try
//		{
//			 SeleniumUtils.wait(4);
//			WebElement element = DriverFactory.getDriver().findElement(By.xpath(ExcelProperty
//                    .getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID).getValue()));
//			element.clear();
//			SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.CARTPAGE,ObjectConstants.IN_PAYPAL_MAIL_ID),
//					PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			SeleniumUtils.wait(4);
			WebElement element = DriverFactory.getDriver().findElement(By.xpath(ExcelProperty
                    .getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID).getValue()));
			element.clear();
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.IN_PAYPAL_MAIL_ID));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.IN_PAYPAL_MAIL_ID),
		PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}

	
	/**
	 * This function is for User should click Paypal Checkout from Cartpage 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickPaypalInCartInMobile()
	{
		try
		{
				SeleniumUtils.javaScriptExecutorDown("200");
				SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.PAYPAL_OPTION_IN_CART));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	

	/**
	 * This function is for User should click Paypal Login Button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickPaypalLoginBtnInMobile()
	{
		try
		{
			SeleniumUtils.javaScriptExecutorDown("80");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_PAYPAL_LOGIN));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User should enter Paypal Password 
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterPaypalPasswordInMobile()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.CARTPAGE,ObjectConstants.IN_PAYPAL_PASSWORD),
//					PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD));
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.IN_PAYPAL_PASSWORD));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,ObjectConstants.IN_PAYPAL_PASSWORD),
		PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD));
		}

		} catch (Exception e)
		{
		e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User should click Continue Button in Paypalpage
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickContinueInPaypalInMobile()
	{
		try
		{
			SeleniumUtils.wait(4);
			SeleniumUtils.javaScriptExecutorDown("300");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_CONTINUE_PAYPAL));
			SeleniumUtils.wait(4);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User should pay via paypal navigating through cartpage
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void ExpressPaypalCartPage()
	{
		try
		{
			 clickPaypalInCartInMobile();
			 SeleniumUtils.wait(5); 
	            clickOnAcceptCookiesPaypal();
	            enterPaypalEmailAddressInMobile();
	            enterPaypalPasswordInMobile();
	            clickPaypalLoginBtnInMobile();
	            clickContinueInPaypalInMobile();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	/**
	 * This function is for validating Paypal payment via cartpage
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsPaypalPaymentInitiatedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.COMPLETE_PURCHASE_BUTTON));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * This function is for User should click Paypal payment in Checkout page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickPaypalRadioBtnInMobile()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_RADIO_BUTTON));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User should click on complete purchase button in Checkout page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnCompletePurchaseBtnInMobile()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.COMPLETE_PURCHASE_BUTTON));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is to validate that user is clicked on paypal radio button in checkout
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsPaypalRadioBtnClickedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_CHECKOUT_BUTTON));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * This function is for User should click Paypal Checkout Button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu 
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickPaypalCheckoutBtnInMobile()
	{
		try
		{
			SeleniumUtils.wait(4);
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_CHECKOUT_BUTTON));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User should pay via paypal navigating through Checkoutpagge
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void paypalPaymentInCheckoutInMobile()
	{
		try
		{
			 clickPaypalRadioBtnInMobile();
	            clickPaypalCheckoutBtnInMobile();
	            SeleniumUtils.wait(3); 
	            clickOnAcceptCookiesPaypal();
	            enterPaypalEmailAddressInMobile();
	            enterPaypalPasswordInMobile();
	            clickPaypalLoginBtnInMobile();
	            clickContinueInPaypalInMobile();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is to validate that user is in order confirmation page after Paypal payment/after complete purchase
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsOrderConfirmationPageDisplayedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ORDER_CONFIRMATION_TEXT));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	
	/**
     * This function is for User should click Paypal Checkout Button
     * URL.
     * @throws Throwable
     * Created By:            Himanshu
     * Created Date:        10/02/2020
     * Last Modified By:   
     * Last Modified Date:   
     */
    public static void clickOnAcceptCookiesPaypal()
    {
        try
        {
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ACCEP_COOKIES_PAYPAL));
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

	
}
