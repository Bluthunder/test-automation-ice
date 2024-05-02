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
import com.ch.common.utils.TestDataFileUtility;
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;
import junit.framework.TestCase;

public class ShelfPage {
	/**
	 * This function is used for validating List view option in shelf page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isListViewSelected() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.LIST_VIEW_BUTTON));

	
		return flag;
	}

	/**
	 * This function is used for select grid view option in shelf page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void selectGridView() {
		
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.GRID_VIEW_BUTTON));
	

	}

	/**
	 * This function is used for validating Grid view option in shelf page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isGridViewSelected() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.GRID_VIEW_BUTTON));

		return flag;
	}

	/**
	 * This function is used to verify filter option in PLP page.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isPLPFilterDisplayed() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.FILTER_OPTION_PLP),1);

		return flag;
	}
	
	/**
	 * This function is for User to select filter in PLP.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectFilterInPLP() {
		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.SELECT_FILTER_OPTION_PLP));
		
	}
	
	/**
	 * This function is used to verify filter option in PLP page.
	 * 
	 * @throws Throwable Created By: Tejaswini Created Date: 04/27/2021 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isPLPFilterApplied() {
		boolean flag = false;
		

			flag = SeleniumUtils.iSDisplayed(
					ExcelProperty.getElementValue(ModuleNames.SHELFPAGE, ObjectConstants.APPLIED_FILTER),1);

		return flag;
	}
}
	

