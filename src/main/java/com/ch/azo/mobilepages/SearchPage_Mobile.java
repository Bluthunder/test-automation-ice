package com.ch.azo.mobilepages;

import static org.testng.Assert.assertEquals;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;

public class SearchPage_Mobile
{
	WebDriver driver;
	/**
	 * This function is for User to search for a product
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void searchForAnItemInMobile()
	{
//		SeleniumUtils.wait(1);
//		SeleniumUtils.sendKeys(
//				ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.SEARCH_TEXT_BOX_MOBILE),
//				PropertyUtil.getObjectValue(ObjectConstants.AZO_ITEM));
//		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.SEARCH_IMAGE_ICON_MOBILE));
//		SeleniumUtils.wait(1);
		try
		{
		if(PropertyUtil.getConfigValue("BROWSER_NAME").contains("seetest")) {
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE,ObjectConstants.SEARCH_TEXT_BOX_MOBILE));
		AZOCommonUtils.sendKeysOnMobile(PropertyUtil.getObjectValue(ObjectConstants.AZO_ITEM));
		}else {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.SEARCH_TEXT_BOX_MOBILE));
		SeleniumUtils.sendKeys(
		ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE,ObjectConstants.SEARCH_TEXT_BOX_IN_SR_PAGE),
		PropertyUtil.getObjectValue(ObjectConstants.AZO_ITEM));
		}
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.SEARCH_IMAGE_ICON_MOBILE));
		SeleniumUtils.wait(1);
		} catch (Exception e)
		{
		e.printStackTrace();
		}

	}
	
	
	/**
	 * This function is for User to click on first product on search result page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnFirstSearchResultPageInMobile()
	{
		try
		{
			SeleniumUtils.wait(3);
			SeleniumUtils.javaScriptExecutorDown("200");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.FIRST_ITEM_SEARCHPAGE_MOBILE));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is to navigate to shelf page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void navigateToShelfPageInMobile()
	{
		try
		{
			searchForAnItemInMobile();
			clickOnFirstSearchResultPageInMobile();
			
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

	public static boolean IsSearchResultPageDisplayedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE_MOBILE, ObjectConstants.SEARCH_RESULT_PAGE_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
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

	public static boolean IsShelfPageDisplayedInMobile()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE_MOBILE, ObjectConstants.SHELFPAGE_HEADER_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
}