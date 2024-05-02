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

public class HomePage {

	/**
	 * This function is for User to click sign In link URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickSignInLink() {
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_LINK));
		SeleniumUtils.wait(2);
	}

	/**
	 * This function is for User to click logout link URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickLogoutLink() {
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGN_OUT_BUTTON));
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGN_OUT_BUTTON));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGN_OUT_BUTTON));

	}

	/**
	 * This function is for User to click Create Account link URL.
	 * 
	 * @throws Exception
	 * @throws Throwable 
	 * Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickCreateAccountLink() throws Exception {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.CREATE_ACCOUNT_BUTTON));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.CREATE_ACCOUNT_BUTTON));

	}

	/**
	 * This function is for User to click Create Account link URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickOnClosePopUp() {

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.CLOSE_POP_UP));

	}

	/**
	 * This function is for validating whether AZO account is logged out or not URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsUserLoggedOut() {
		boolean flag = false;
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN));
		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SIGNIN_DROPDOWN),2);
		return flag;
	}

	/**
	 * This function is for User to click YMME link in Homepage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickYMMELink() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.ADD_VEHICLE_LINK_HOMEPAGE));
		SeleniumUtils
		.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.ADD_VEHICLE_LINK_HOMEPAGE));

	}

	/**
	 * This function is for User to click my account dropdown in Homepage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickMyAccountDrpdwn() {
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.BUTTON_MYACCOUNT_HOME));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.BUTTON_MYACCOUNT_HOME));

	}

	/**
	 * This function is for User to click my account link in dropdown in Homepage
	 * URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickMyAccountLinkInDrpdwn() {
		SeleniumUtils.wait(3);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.MYACCOUNT_IN_DROPDOWN));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.MYACCOUNT_IN_DROPDOWN));

	}

	/**
	 * This function is for validating Orderhistory link in my account URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsOrderHistoryDisplayed() {
		boolean flag = false;

		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.ORDER_HISTORY_LINK_IN_MYACCOUNT));

		return flag;
	}

	/**
	 * This function is for User should navigate to my account page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void navigateToMyAcntPage() {

		clickMyAccountDrpdwn();
		clickMyAccountLinkInDrpdwn();

	}

	/**
	 * This function is for User should set Url1 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl1() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL1));

	}

	/**
	 * This function is for validating user is at URL_1 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_1Set() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL1));

		return flag;
	}

	/**
	 * This function is for User should set Url2 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl2() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL2));

	}

	/**
	 * This function is for validating user is at URL_2 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_2Set() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL2));

		return flag;
	}

	/**
	 * This function is for User should set Url3 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl3() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL3));

	}

	/**
	 * This function is for validating user is at URL_3 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_3Set() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL3));

		return flag;
	}

	/**
	 * This function is for User should set Url4 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl4() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL4));

	}

	/**
	 * This function is for validating user is at URL_4 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_4Set() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL4));

		return flag;
	}

	/**
	 * This function is for User should set Url5 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl5() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL5));

	}

	/**
	 * This function is for validating user is at URL_5 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_5Set() {
		boolean flag = false;

		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL5));

		return flag;
	}

	/**
	 * This function is for User should set Url6 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void setUrl6() {

		SeleniumUtils.getURL(PropertyUtil.getObjectValue(ObjectConstants.URL6));

	}

	/**
	 * This function is for validating user is at URL_6 landing page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsURL_6Set() {
		boolean flag = false;
		return flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TEXT_URL6),1);

	}


	/**
	 * This function is for User should click Hamberger Menu .
	 * 
	 * @throws Throwable Created By: ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnHambergerMenu() {

		try {
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.HAMBERGER_MENU));
		}
		catch(Exception e){
			System.out.println("Hamberger Menu Not Clicked");
		}
	}

	/**
	 * This function is for User should click Top Deal Link .
	 * 
	 * @throws Throwable Created By: ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnTopDealsLink() {

		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.TOP_DEAL_LINK));
		}
		catch(Exception e){
			System.out.println("Top Deals Link Not Clicked");
		}
	}

	/**
	 * This function is for User should click on one of the products .
	 * 
	 * @throws Throwable Created By: ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnAnyOfTheProducts() {

		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.FIRST_PRODUCT));
		}
		catch(Exception e){
			System.out.println("Any product is not  Clicked");
		}
	}
}


