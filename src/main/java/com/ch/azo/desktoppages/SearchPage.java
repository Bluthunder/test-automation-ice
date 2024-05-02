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

public class SearchPage {
	/**
	 * This function is for User to search for a product URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void searchForAnItem(String item) {
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SEARCH_TEXTBOX),
				item,2);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SEARCH_BUTTON));
		SeleniumUtils.wait(1);

	}

	/**
	 * This function is for User to click on first product on search result page
	 * URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnFirstSearchResultPage() {

		SeleniumUtils.wait(3);
		SeleniumUtils.javaScriptExecutorDown("200");
		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE, ObjectConstants.FIRST_ITEM_SEARCHPAGE));

	}

	/**
	 * This function is to navigate to shelf page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void navigateToShelfPage(String item) {

		searchForAnItem(item);
		clickOnFirstSearchResultPage();

	}

	/**
	 * This function is for validating whether selected store is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsSearchResultPageDisplayed() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SEARCHPAGE, ObjectConstants.TEXT_SEARCH_VERIFY),3);

		return flag;
	}

	/**
	 * This function is for validating whether selected store is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsShelfPageDisplayed() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.SHELFPAGE_HEADER),3);

		return flag;
	}
}