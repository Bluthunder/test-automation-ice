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

public class SignInPage {

	/**
	 * This function is for User should enter valid username URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName() {
		//AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD));
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID),3);

	}

	/**
	 * This function is for User should enter valid password URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD));
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD),1);

	}

	/**
	 * This function is for User to click sign In button URL.
	 * 
	 * @throws Throwable 
	 * Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickSignInButton() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.SIGN_IN_BUTTON_IN_SIGNIN_PAGE));
		SeleniumUtils.wait(2);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.SIGN_IN_BUTTON_IN_SIGNIN_PAGE));

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount() {
		SeleniumUtils.wait(3);
		enterUserName();
		enterPassword();
		clickSignInButton();

	}

	/**
	 * This function is for validating whether AZO account is created or not URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsUserLoggedIn() {
		boolean flag = false;
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.LOGGED_IN_ACCOUNT));
		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.LOGGED_IN_ACCOUNT),2);

		return flag;
	}

	/**
	 * This function is for User should enter valid username1 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName1() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD));
		SeleniumUtils.wait(2);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_1),2);

	}

	/**
	 * This function is for User should enter valid password1 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword1() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD));
		SeleniumUtils.wait(2);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD_1),1);

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount1() {

		enterUserName1();
		enterPassword1();
		clickSignInButton();

	}

	/**
	 * This function is for User should enter valid username2 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName2() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_2));

	}

	/**
	 * This function is for User should enter valid password2 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword2() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD_2));

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount2() {

		enterUserName2();
		enterPassword2();
		clickSignInButton();

	}

	/**
	 * This function is for User should enter valid username3 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName3() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_3));

	}

	/**
	 * This function is for User should enter valid password3 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword3() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD_3));

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount3() {

		enterUserName3();
		enterPassword3();
		clickSignInButton();

	}

	/**
	 * This function is for User should enter valid username4 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName4() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_4));

	}

	/**
	 * This function is for User should enter valid password4 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword4() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD_4));

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount4() {

		enterUserName4();
		enterPassword4();
		clickSignInButton();

	}

	/**
	 * This function is for User should enter valid username5 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterUserName5() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.EMAIL_ID_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.REGISTERED_EMAILID_5));

	}

	/**
	 * This function is for User should enter valid password5 URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPassword5() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.SIGNINPAGE, ObjectConstants.PASSWORD_TEXT_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PASSWORD_5));

	}

	/**
	 * This function is for User to Sign In to AZO URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/10/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void signInToAccount5() {

		enterUserName5();
		enterPassword5();
		clickSignInButton();

	}

}