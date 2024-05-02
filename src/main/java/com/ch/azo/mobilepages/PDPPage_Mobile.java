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
import com.ch.utils.SeleniumUtils;

public class PDPPage_Mobile
{
	/**
	 * This function is for User to search for a product
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnFirstProductInShelfPageInMobile()
	{
		try{
			SeleniumUtils.javaScriptExecutorDown("200");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE_MOBILE, ObjectConstants.FIRST_PRODUCT_TITLE_MOBILE));
			SeleniumUtils.wait(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User to search for a product
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnAutoZoneLogoInPdpPage()
	{
		try{
			
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.AUTOZONE_LOGO));
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * This function is for User to search for a product
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnSecondProductInShelfPage()
	{
		try{
			SeleniumUtils.javaScriptExecutorDown("400");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.SECOND_PRODUCT_TITLE));
			SeleniumUtils.wait(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * This function is for validating whether user is navigated to PDP page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsPdpPageDisplayedInMobile()
	{
		boolean flag = false;
		try
		{
//SeleniumUtils.wait(5);
			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.PDP_MOBILE, ObjectConstants.PRODUCT_TITLE_IN_PDP_MOBILE));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * This function is for validating whether user is navigated to PDP page
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */

	public static boolean IsHomeDeliveryInStockInPdpPage()
	{
		boolean flag = false;
		try
		{

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.HOME_DELIVERY_IN_STOCK));

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * This function is for User to click on ship to home in PDP
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void selectSthInPdp()
	{
		try {
			SeleniumUtils.javaScriptExecutorDown("200");	
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STH_PDP));
		SeleniumUtils.wait(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * This function is for User to click on bopus in PDP
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void selectBopusInPdp()
	{
		try {
			
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STOREPICKUP_PDP));
		SeleniumUtils.wait(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * This function is for User to click on add to cart button in PDP
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnAddToCart()
	{
		try {	
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP_MOBILE, ObjectConstants.ADD_TO_CART_BUTTON_MOBILE));
		SeleniumUtils.wait(5);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * This function is for User to click on view cart button in PDP
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnGoToCartButton()
	{
		try {
			
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP_MOBILE, ObjectConstants.GO_TO_CART_BUTTON));
		SeleniumUtils.wait(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is for User to click on mini cart cart icon in Header
	 * URL.
	 * @throws Throwable
	 * Created By:			Himanshu Nayan
	 * Created Date:		10/02/2020
	 * Last Modified By:	
	 * Last Modified Date:	
	 */
	public static void clickOnMiniCartButton()
	{
		try {
			
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP_MOBILE, ObjectConstants.MINI_CART_BUTTON));
		SeleniumUtils.wait(5);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}