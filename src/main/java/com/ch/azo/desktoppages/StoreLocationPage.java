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

public class StoreLocationPage {

	/**
	 * This function is for User to click on select store URL.
	 * 
	 * @throws Exception
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnSelectStore() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.SET_STORE_BUTTON));
		SeleniumUtils.wait(2);
		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.SET_STORE_BUTTON));

	}

	/**
	 * This function is for User to click on change store button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnChangeStore() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_CHANGE_STORE));
		SeleniumUtils.wait(2);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_CHANGE_STORE));

	}

	/**
	 * This function is for User to enter zipcode in search text box URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterZipcode() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.IN_ZIPCODE));
		SeleniumUtils.wait(3);
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.IN_ZIPCODE),
				PropertyUtil.getObjectValue(ObjectConstants.ZIPCODE),1);

	}

	/**
	 * This function is for User to click on search button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnSearchStore() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SEARCH));
		SeleniumUtils.wait(2);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SEARCH));

	}

	/**
	 * This function is for User to click on set store button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnSetStore() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SET_STORE));
		SeleniumUtils.wait(2);
		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.BUTTON_SET_STORE));

	}

	/**
	 * This function is to set store in Home page URL.
	 * 
	 * @throws Exception
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void setStoreOnHomePage() throws Exception {

		clickOnSelectStore();

		clickOnChangeStore();
		enterZipcode();
		clickOnSearchStore();
		clickOnSetStore();

	}

	/**
	 * This function is for validating whether selected store is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsStoreDisplayed() {
		boolean flag = false;
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE, ObjectConstants.TEXT_STORE_DETAIL_HOMEPAGE));
		SeleniumUtils.wait(3);
		flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.STORELOCATORPAGE,
				ObjectConstants.TEXT_STORE_DETAIL_HOMEPAGE),2);

		return flag;
	}
}