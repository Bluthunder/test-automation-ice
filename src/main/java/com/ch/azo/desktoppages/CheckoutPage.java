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

public class CheckoutPage {

	/**
	 * This function is for User should enter First Name in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterFirstNameInAddress() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.FIRST_NAME_FIELD_IN_SHIPPING));
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
						ObjectConstants.FIRST_NAME_FIELD_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.FIRST_NAME),1);


	}

	/**
	 * This function is for User should enter Last Name in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterLastNameInAddress() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
						ObjectConstants.LAST_NAME_FIELD_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.LAST_NAME),1);


	}

	/**
	 * This function is for User should enter Zipcode in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterZipCodeInAddress() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ZIPCODE_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.SDD_ZIPCODE),1);


	}


	/**
	 * This function is for User should enter Phone Number in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterPhoneNumberInAddress() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE,
						ObjectConstants.PHONE_NUMBER_FIELD_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_PHONENO),1);

	}

	/**
	 * This function is for User should enter Email Id in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterEmailIdInAddress() {

		String UName = "testaccount";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYhmmss");
		String formattedDate = sdf.format(date);
		String emailId = (UName + formattedDate + "@gmail.com");
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.EMAIL_ID_IN_SHIPPING),
				emailId,3);

	}

	/**
	 * This function is for User should enter address in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterAddressInAddress() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ADDRESS1_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_ADDRESS1),3);



	}


	/**
	 * This function is for User to select state in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void selectStateInAddress(String State) {

		SeleniumUtils.dropDownByVisibleText(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.STATE_IN_SHIPPING), State);



	}


	/**
	 * This function is for User should enter city in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterCityInAddress() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.CITY_IN_SHIPPING),
				PropertyUtil.getObjectValue(ObjectConstants.SHIPPING_CITY1),3);



	}


	/**
	 * This function is for User to click save button in shipping address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickSaveButton() {

		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.SAVE_BUTTON_IN_SHIPPING));

		SeleniumUtils.wait(3);
	}


	/**
	 * This function is for User to click keep this address button in shipping
	 * address URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void clickKeepThisAddresseButton() {
		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.KEEP_THIS_ADDRESS_BUTTON));

		}catch (Exception e){
			System.out.println("Keep this address is not displayed");
		}
	}


	/**
	 * This function is for User should enter shipping address details URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterShippingDetails() {

		enterFirstNameInAddress();
		enterLastNameInAddress();
		enterPhoneNumberInAddress();
		enterEmailIdInAddress();
		enterAddressInAddress();
		enterCityInAddress();
		enterZipCodeInAddress();



	}

	/**
	 * This function is for User should enter complete shipping address.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterShippingAddress() {
		try {
			enterShippingDetails();
			selectStateInAddress("TENNESSEE");
			clickSaveButton();
			SeleniumUtils.wait(1);
			clickKeepThisAddresseButton();
		}catch(Exception e) {
			System.out.println("Warning: Shipping DetailsAddress form  is not displayed");
		}

	}





	/**
	 * This function is for User should enter billing address details URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */
	public static void enterBillingDetails() {

		enterFirstNameInAddress();
		enterLastNameInAddress();
		enterPhoneNumberInAddress();
		enterEmailIdInAddress();
		enterAddressInAddress();
		enterCityInAddress();
		enterZipCodeInAddress();



	}


	/**
	 * This function is for validating whether shipping address is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsShippingAddressDisplayed() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.SHIPPING_DETAILS));


		return flag;
	}

	/**
	 * This function is for validating whether billing address is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */

	public static boolean IsBillingAddressDisplayed() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.BILLING_DETAILS));


		return flag;
	}

	/**
	 * This function is for User should enter credit card number URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterCreditCardNumber() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.CARD_NUMBER_FIELD));
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.CARD_NUMBER_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.CC_NO1),3);



	}


	/**
	 * This function is for User should enter Credit Card Expiry Date URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterCCExpiryDate() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.EXPIRY_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.CC_EXP1),3);



	}


	/**
	 * This function is for User should enter Credit Card CVV URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterCreditCardCVV() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.SECURITY_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.CC_CVV1),3);



	}

	/**
	 * This function is for User should enter all the valid inputs for creditcard
	 * URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterCreditCardDetails() {

		enterCreditCardNumber();
		enterCCExpiryDate();
		enterCreditCardCVV();


	}


	/**
	 * This function is for User should enter Paypal EmailID URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterPaypalEmailAddress() {

		SeleniumUtils.wait(4);
		// SeleniumUtils.sen
		WebElement element = DriverFactory.getDriver().findElement(By.cssSelector(
				ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID).getValue()));
		element.clear();
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_MAIL_ID),
				PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_MAILID));



	}


	/**
	 * This function is for User should click Next Button in Paypal URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickNextBtnInPaypal() {

		SeleniumUtils
		.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.NEXT_BUTTON_INPAYPAL));



	}


	/**
	 * This function is for User should click Paypal Checkout from Cartpage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickPaypalInCart() {

		SeleniumUtils.javaScriptExecutorDown("200");
		SeleniumUtils
		.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.PAYPAL_OPTION_IN_CART));



	}


	/**
	 * This function is for User should click Paypal Login Button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickPaypalLoginBtn() {

		SeleniumUtils.javaScriptExecutorDown("80");
		SeleniumUtils
		.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_PAYPAL_LOGIN));



	}

	/**
	 * This function is for User should enter Paypal Password URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterPaypalPassword() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.IN_PAYPAL_PASSWORD),
				PropertyUtil.getObjectValue(ObjectConstants.PAYPAL_PASSWORD),4);



	}


	/**
	 * This function is for User should click Continue Button in Paypalpage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickContinueInPaypal() {

		SeleniumUtils.wait(5);
		SeleniumUtils.javaScriptExecutorDown("300");
		
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_CONTINUE_PAYPAL));
		SeleniumUtils.wait(3);
		SeleniumUtils
		.click(ExcelProperty.getElementValue(ModuleNames.CARTPAGE, ObjectConstants.BUTTON_CONTINUE_PAYPAL));

	}


	/**
	 * This function is for User should pay via paypal navigating through cartpage
	 * URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void ExpressPaypalCartPage() {

		clickPaypalInCart();
		SeleniumUtils.wait(5);
		clickOnAcceptCookiesPaypal();
		enterPaypalEmailAddress();
		clickNextBtnInPaypal();
		enterPaypalPassword();
		clickPaypalLoginBtn();
		clickContinueInPaypal();


	}

	/**
	 * This function is for validating Paypal payment via cartpage URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean IsPaypalPaymentInitiated() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.COMPLETE_PURCHASE_BUTTON),2);


		return flag;
	}

	/**
	 * This function is for User should click Paypal payment in Checkout page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickPaypalRadioBtn() {

		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_RADIO_BUTTON));



	}


	/**
	 * This function is for User should click on complete purchase button in
	 * Checkout page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnCompletePurchaseBtn() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.COMPLETE_PURCHASE_BUTTON));
		SeleniumUtils.wait(1);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.COMPLETE_PURCHASE_BUTTON));

		
	}


	/**
	 * This function is to validate that user is clicked on paypal radio button in
	 * checkout URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean IsPaypalRadioBtnClicked() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_CHECKOUT_BUTTON),2);

		return flag;
	}

	/**
	 * This function is for User should click Paypal Checkout Button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickPaypalCheckoutBtn() {

		SeleniumUtils.wait(4);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PAYPAL_CHECKOUT_BUTTON));


	}

	/**
	 * This function is for User should pay via paypal navigating through
	 * Checkoutpagge URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void paypalPaymentInCheckout() {

		clickPaypalRadioBtn();
		SeleniumUtils.wait(2);
		clickPaypalCheckoutBtn();
		SeleniumUtils.wait(3);
		clickOnAcceptCookiesPaypal();
		enterPaypalEmailAddress();
		enterPaypalPassword();
		clickPaypalLoginBtn();
		clickContinueInPaypal();
		SeleniumUtils.wait(4);


	}

	/**
	 * This function is to validate that user is in order confirmation page after
	 * Paypal payment/after complete purchase URL.
	 * @throws Exception 
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean IsOrderConfirmationPageDisplayed() throws Exception {
		boolean flag = false;

		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ORDER_CONFIRMATION_TEXT));
		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ORDER_CONFIRMATION_TEXT),12);
		return flag;
	}

	/**
	 * This function is to validate that user is able to see same day delivery in
	 * checkout page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean IsSddDisplayedInCheckout() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.SDD_TEXT_FIELD),2);


		return flag;
	}

	/**
	 * This function is to validate that user is able to see same day delivery in
	 * checkout page URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean IsDeliveryDateDisplayedInCheckout() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.DELIVERY_DATE),2);

		return flag;
	}

	/**
	 * This function is for User should click Paypal Checkout Button URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnAcceptCookiesPaypal() {

		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ACCEP_COOKIES_PAYPAL));
		}
		catch(Exception e){
			System.out.println("Cookies pop up not displayed");
		}


	}

	/**
	 * This function is for User should click login button in Checkout page URL.
	 * 
	 * @throws Throwable Created By: Vamsi Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickLoginBtn() {

		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.LOGIN_BUTTON));
	}

	/**
	 * This function is for validating whether order number  is displayed URL.
	 * 
	 * @throws Throwable Created By: Himanshu Nayan Created Date: 10/02/2020 Last
	 *                   Modified By: Last Modified Date:
	 */



	public static boolean IsOrderNumberDisplayed() {
		boolean flag = false;

		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ORDER_NUMBER),4);

		return flag;
	}

	/**
	 * This function is for User should enter credit card number URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterGiftCardNumber() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARD_INPUT));
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARD_INPUT),
				PropertyUtil.getObjectValue(ObjectConstants.GIFTCARD_NUMBER),3);



	}

	/**
	 * This function is for User should enter credit card Pin URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterGiftCardPin() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARDPIN_INPUT));
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARDPIN_INPUT),
				PropertyUtil.getObjectValue(ObjectConstants.GIFTCARD_PIN),3);



	}
	
	/**
	 * This function is for User to click Gift Card arrow buttonL.
	 * 
	 * @throws Throwable 
	 * Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickGiftCard() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFT_CARD_BUTTON));
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFT_CARD_BUTTON));

	}
	
	public static void clickApplyRewards() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.APPLYREWARDS_BUTTON));
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.APPLYREWARDS_BUTTON));

	}
	
	
	
	/**
	 * This function is for User to click Apply button URL.
	 * 
	 * @throws Throwable 
	 * Created By: Himanshu Nayan 
	 * Created Date: 10/02/2020 Last
	 * Modified By: Last Modified Date:
	 */
	public static void clickApplyButton() {
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARDAPPLY_BUTTON));
		SeleniumUtils.wait(2);
		SeleniumUtils.click(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.GIFTCARDAPPLY_BUTTON));

	}

	public static void applyGiftCard() {
		clickGiftCard();
		enterGiftCardNumber();
		enterGiftCardPin();
		clickApplyButton();

	}

	/**
	 * This function is for User should enter Promo code.
	 * 
	 * @throws Throwable Created By: Ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void enterPromoCode() {

		SeleniumUtils.sendKeys(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PROMO_CODE_FIELD),
				PropertyUtil.getObjectValue(ObjectConstants.PROMO_CODE),1);



	}
	/**
	 * This function is for User should click Apply Promocode Button .
	 * 
	 * @throws Throwable Created By: ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void clickOnApplyPromoCodeButton() {

		try {
			SeleniumUtils.click(
					ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PROMO_APPLY_BUTTON));
			SeleniumUtils.wait(2);
		}
		catch(Exception e){
			System.out.println("Apply Button Not Clicked");
		}
	}

	/**
	 * This function is to validate that user is able to see promo code applied
	 * checkout page URL.
	 * 
	 * @throws Throwable Created By: Ravi Created Date: Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean isPromoCodeApplied() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.PROMO_CODE_VALIDATE),2);

		return flag;
	}

	/**
	 * This function is to validate that user is able to see ordewr number
	 * checkout page URL.
	 * 
	 * @throws Throwable Created By: Ravi Created Date:  Last Modified
	 *                   By: Last Modified Date:
	 */

	public static boolean validateOredrNumber() {
		boolean flag = false;


		flag = SeleniumUtils.iSDisplayed(
				ExcelProperty.getElementValue(ModuleNames.CHECKOUTPAGE, ObjectConstants.ORDER_NUMBER),12);

		return flag;
	}
}



