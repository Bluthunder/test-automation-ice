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

public class StoreLocationPageMobile
{

	/**
	 * This function is for User to click on select store
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnSelectStore()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.SET_STORE_BUTTON));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click on change store button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnChangeStore()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_CHANGE_STORE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to enter zipcode in search text box
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void enterZipcode()
	{
//		try
//		{
//			SeleniumUtils.sendKeys(
//					ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE,
//							ObjectConstants.IN_ZIPCODE),
//					PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE,ObjectConstants.IN_ZIPCODE));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
		}else {
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE,ObjectConstants.IN_ZIPCODE),
		PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE));
		}
		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click on search button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnSearchStore()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SEARCH));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * This function is for User to click on set store button
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnSetStore()
	{
		try
		{
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SET_STORE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	/**
	 * This function is to set store in Home page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void setStoreOnHomePage()
	{
		try
		{
			clickOnSelectStore();
			clickOnChangeStore();
			enterZipcode();
			clickOnSearchStore();
			clickOnSetStore();
									
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * This function is for validating whether selected store is displayed
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsStoreDisplayed()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.TEXT_STORE_DETAIL_HOMEPAGE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
}