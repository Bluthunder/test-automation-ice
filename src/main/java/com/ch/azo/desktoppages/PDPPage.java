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
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;
import junit.framework.TestCase;

public class PDPPage {
	/**
	 * This function is for User to search for a product URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnFirstProductInShelfPage() {
		
			//SeleniumUtils.javaScriptExecutorDown("200");
			SeleniumUtils
					.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.FIRST_PRODUCT_IMG));
			SeleniumUtils.wait(1);
		
			
		}
	

	/**
	 * This function is for User to search for a product URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnAutoZoneLogoInPdpPage() {
		

			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.AUTOZONE_LOGO));

		
			
		}
	

	/**
	 * This function is for User to search for a product URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnSecondProductInShelfPage() {
		
			SeleniumUtils.javaScriptExecutorDown("400");
			SeleniumUtils
					.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.SECOND_PRODUCT_TITLE));
			SeleniumUtils.wait(1);
		
			
		}
	

	/**
	 * This function is for validating whether user is navigated to PDP page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsPdpPageDisplayed() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.PRODUCT_DESCRIPTION_PDP),3);

	
		return flag;
	}

	/**
	 * This function is for validating whether user is navigated to PDP page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsHomeDeliveryInStockInPdpPage() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.HOME_DELIVERY_IN_STOCK),1);

	
		return flag;
	}

	/**
	 * This function is for User to click on ship to home in PDP URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectSthInPdp() {
		
			SeleniumUtils.javaScriptExecutorDown("200");
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STH_PDP));
			SeleniumUtils.wait(1);
		
			
		}


	/**
	 * This function is for User to click on bopus in PDP URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectBopusInPdp() {
		

			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STOREPICKUP_PDP));
			SeleniumUtils.wait(1);
	
	}

	/**
	 * This function is for User to click on add to cart button in PDP URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnAddToCart() {
		
			AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.ADD_TO_CART_BUTTON));
			SeleniumUtils.wait(2);
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.ADD_TO_CART_BUTTON));
			SeleniumUtils.wait(2);
	
	}

	/**
	 * This function is for User to click on view cart button in PDP URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnViewCartButton() {
		
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.VIEW_CART_BUTTON));
		SeleniumUtils.wait(2);
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.VIEW_CART_BUTTON));
			SeleniumUtils.wait(1);
	
	}
	
	/**
	 * This function is for User to increment the quantity in Mini Cart.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickIncrementBtnInMiniCart(int quantityIncr) {
		
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INCREMENT));
		for(int i=1;i<=quantityIncr;i++) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INCREMENT));
		}
	}
	
	/**
	 * This function is used to verify quantity increased in Mini Cart.
	 * @return 
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isQauntityIncreasedInMiniCart() {
		boolean flag = false;
		
		String initialQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INPUT), "value",1);
		clickIncrementBtnInMiniCart(1);
		
		String currentQuantity =SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INPUT), "value",1);
		if(initialQuantity.equals(currentQuantity)) {
			flag = false;
		}else {
			flag =true;
		}
		return flag;
	} 
	
	/**
	 * This function is for User to decrease the quantity in Mini Cart.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickDecrementBtnInMiniCart(int quantityDecr) {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_DECREMENT));
		for(int i=1;i<=quantityDecr;i++) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_DECREMENT));
		}
	}
	
	/**
	 * This function is used to verify quantity decreased in Mini Cart.
	 * @return 
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isQauntityDecreasedInMiniCart() {
		boolean flag = false;
		
		String initialQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INPUT), "value",1);
		clickDecrementBtnInMiniCart(1);
		String currentQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.MINI_CART_INPUT), "value",1);
		if(initialQuantity.equals(currentQuantity)) {
			flag = false;
		}else {
			flag = true;
		}
		return flag;
	} 
}