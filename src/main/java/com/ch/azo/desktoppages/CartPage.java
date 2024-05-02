package com.ch.azo.desktoppages;

import static org.testng.Assert.assertEquals;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

public class CartPage {
	/**
	 * This function is to click on checkout button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnCheckoutButton() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CHECKOUT_BUTTON));
		SeleniumUtils.wait(1);
		SeleniumUtils.javaScriptExecutorDown("200");
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CHECKOUT_BUTTON));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to click on continue shopping button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnContinueShoppingButton() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CONTINUE_SHOPPING_BUTTON));
		SeleniumUtils.wait(1);
		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CONTINUE_SHOPPING_BUTTON));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to click on paypal in cart URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnPaypalInCart() {

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.PAYPAL_OPTION_IN_CART));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to click on continue shopping button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterMailIdInPaypal() {

		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID),
				PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID),1);
		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.NEXT_BUTTON_INPAYPAL));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to click on continue shopping button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPaswordInPaypal() {

		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_PASSWORD),
				PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD),1);
		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_PAYPAL_LOGIN));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to click on continue button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnContinueButton() {

		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_CONTINUE_PAYPAL));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is to paypal URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void paypalPayment() {

		enterMailIdInPaypal();
		enterPaswordInPaypal();
		clickOnContinueButton();

	}

	/**
	 * This function is for validating whether cart page is empty URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsCartPageEmpty() {
		return SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.TEXT_CART_EMPTY),2);

	}
	

	/**
	 * This function is for validating user navigated to cart page.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/28/2021 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsCartPageDisplayed() {
		boolean flag = false;
		SeleniumUtils.wait(2);
		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.CART_PAGE_HEADER),1);

		return flag;
	}
	
	/**
	 * This function is for User to increase the quantity.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickIncrementBtn(int quantityIncr) {
		
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INCREMENT_BUTTON));
		for(int i=1;i<=quantityIncr;i++) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INCREMENT_BUTTON));
		}
		SeleniumUtils.wait(2);
	}
	
	/**
	 * This function is used to verify increased quantity.
	 * @return 
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isQauntityIncreased() {
		boolean flag = false;
		
		String initialQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INPUT_QUANTITY), "value",1);
		
		clickIncrementBtn(1);
		String currentQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INPUT_QUANTITY), "value",1);
		if(initialQuantity.equals(currentQuantity)) {
			flag = false;
		}else {
			flag =true;
		}
		return flag;
	} 
	
	/**
	 * This function is for User to decrease the quantity .
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickDecrementBtn(int quantityDecr) {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.DECREMENT_BUTTON));
		for(int i=1;i<=quantityDecr;i++) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.DECREMENT_BUTTON));
		}
		SeleniumUtils.wait(2);
	}
	
	/**
	 * This function is used to verify decreased quantity.
	 * @return 
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static boolean isQauntityDecreased() {
		boolean flag = false;
		
		String initialQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INPUT_QUANTITY), "value",1);
		clickDecrementBtn(1);
		String currentQuantity = SeleniumUtils.getAttributes(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.INPUT_QUANTITY), "value",1);
		if(initialQuantity.equals(currentQuantity)) {
			flag = false;
		}else {
			flag =true;
		}
		return flag;
	} 
	
	/**
	 * This function is for User to click on ship to home in Cart Page.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectSthInCart() {
		SeleniumUtils.wait(2);
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STH_PDP));
			SeleniumUtils.wait(1);
		}

	/**
	 * This function is to verify sth is selected.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static boolean IsSTHSelected() {
		boolean flag = false;
					flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.SELECTED_STH_OPTION),1);
		return flag;
	}
	
	/**
	 * This function is for User to click on bopus in Cart Page.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectBopusInCart() {
		SeleniumUtils.wait(2);
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.PDP, ObjectConstants.RADIO_BUTTON_STOREPICKUP_PDP));
			SeleniumUtils.wait(1);
	
	}
	
	/**
	 * This function is to verify Bopus is selected.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static boolean IsBopusSelected() {
		boolean flag = false;
		flag = SeleniumUtils.isSelected(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.SELECTED_BOPUS_OPTION),1);
					flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.SELECTED_BOPUS_OPTION),1);
		return flag;
	}

	/**
	 * This function is for User to remove the items in Cart.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void removeItemsEmptyCartPage() {
		
		SeleniumUtils.wait(2);
		List<WebElement> linkRemove = SeleniumUtils.getAllElements(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_REMOVE));
		
		for(int i=1;i<=linkRemove.size();i++) {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_REMOVE));
			SeleniumUtils.wait(1);
		}
	}
}