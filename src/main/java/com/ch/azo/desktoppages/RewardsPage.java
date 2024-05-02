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

public class RewardsPage {

	/**
	 * This function is for User to click my account dropdown in Homepage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickLinkOrderHistory() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.ORDER_HISTORY_LINK_IN_MYACCOUNT));
		SeleniumUtils.wait(2);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.ORDER_HISTORY_LINK_IN_MYACCOUNT));

	}

	/**
	 * This function is for validating Rewards activity Button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsButtonRewardsActivityDisplayed() {
		boolean flag = false;
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_ACTIVITY_BUTTON));
		SeleniumUtils.wait(2);
		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_ACTIVITY_BUTTON));

		return flag;
	}

	/**
	 * This function is for User to click rewards activity button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickRewardsActivityBtn() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_ACTIVITY_BUTTON));
		SeleniumUtils.wait(2);
		SeleniumUtils
				.click(ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_ACTIVITY_BUTTON));

	}

	/**
	 * This function is for validating Text Rewards Balance URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsRewardsBalanceDisplayed() {
		boolean flag = false;
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_BALANCE_TEXT));
		SeleniumUtils.wait(2);
		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.REWARDSPAGE, ObjectConstants.REWARDS_BALANCE_TEXT));

		return flag;
	}

}