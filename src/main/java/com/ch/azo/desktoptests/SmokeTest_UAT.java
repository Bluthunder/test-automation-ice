package com.ch.azo.desktoptests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.ch.azo.common.base.AzoAbstractTest;
import com.ch.azo.desktoppages.CartPage;
import com.ch.azo.desktoppages.CheckoutPage;
import com.ch.azo.desktoppages.HomePage;
import com.ch.azo.desktoppages.PDPPage;
import com.ch.azo.desktoppages.RegistrationPage;
import com.ch.azo.desktoppages.SearchPage;
import com.ch.azo.desktoppages.ShelfPage;
import com.ch.azo.desktoppages.SignInPage;
import com.ch.azo.desktoppages.StoreLocationPage;
import com.ch.azo.desktoppages.YMME;
import com.ch.common.utils.AZOCommonUtils;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.utils.SeleniumUtils;

public class SmokeTest_UAT extends AzoAbstractTest
{

	public void LaunchAZOUrl() throws IOException
	{
		AZOCommonUtils.desktopView();
		AZOCommonUtils.AZOURL(AbstractTestCaseReport.runConfig);
		AZOCommonUtils.handleGotItPopUp();

	}

	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void SanityUAT_TC01_CreateAnAccount(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickCreateAccountLink();
				RegistrationPage.createAnAccount();
				SeleniumUtils.wait(4);
				AZOCommonUtils.assertTest(testcase,RegistrationPage.IsAZOAccountCreated(),"User is able to create an AZO account successfully",
						"User is not able to create an AZO account successfully");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to create an AZO account successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}


	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void SanityUAT_TC02_SignInSignOutwithExistingAccount(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickSignInLink();
				SignInPage.signInToAccount();
				HomePage.clickLogoutLink();
				AZOCommonUtils.assertTest(testcase,HomePage.IsUserLoggedOut(),"User is able to logged out from an AZO account successfully",
						"User is not able to logged out from an AZO account successfully");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to login to an AZO account successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}

	@Test(groups = {"Smoke","Regression","YMME" })
	public void SanityUAT_TC03_Add_Vehicle_to_Profile(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickSignInLink();
				SignInPage.signInToAccount();
				testcase.assertTrue(SignInPage.IsUserLoggedIn(),"User is able to login to an AZO account successfully",
						"User is not able to login to an AZO account successfully");
				testcase.pass("User is able to login to an AZO account successfully");
				HomePage.clickYMMELink();
				YMME.vehicleSet();
				testcase.assertTrue(YMME.isVehicleDisplayed(),"User is able to set vehicle successfully",
						"User is not able to set vehicle successfully");
				testcase.pass("User is able to set vehicle successfully");
				YMME.MyVehicle();
				testcase.assertTrue(YMME.IsMyVehiclePageDisplayed(),"User is navigated to MyVehicle page",
						"User is not navigated to MyVehicle page");
				testcase.pass("User is navigated to MyVehicle Page");
				YMME.ServiceHistory();
				testcase.assertTrue(YMME.IsServiceHistoryUpdated(),"Service History is created successfully",
						"Service History is not created successfully");
				testcase.pass("Service History is created successfully");
				YMME.close();
				AbstractTestCaseReport.sendPassOrFailInfo(testcase);
				AZOCommonUtils.closeTheBrowser();
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to logged out from an AZO account successfully",testcase, retry, e);
				e.printStackTrace();
			}
		}


	}

	@Test(groups = {"Smoke","Regression","YMME" })
	public void SanityUAT_TC04_Remove_Vehicle_from_Profile(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickSignInLink();
				SignInPage.signInToAccount();
				testcase.assertTrue(SignInPage.IsUserLoggedIn(),"User is able to login to an AZO account successfully",
						"User is not able to login to an AZO account successfully");
				testcase.pass("User is able to login to an AZO account successfully");
				HomePage.clickYMMELink();
				YMME.vehicleSet();
				testcase.assertTrue(YMME.isVehicleDisplayed(),"User is able to set vehicle successfully",
						"User is not able to set vehicle successfully");
				testcase.pass("User is able to set vehicle successfully");
				YMME.MyVehicle();
				testcase.assertTrue(YMME.IsMyVehiclePageDisplayed(),"User is navigated to MyVehicle page",
						"User is not navigated to MyVehicle page");
				testcase.pass("User is navigated to MyVehicle Page");
				YMME.close();
				testcase.assertTrue(YMME.isEmptyVehiclePageDisplayed(),"User is able to remove vehicle successfully",
						"User is not able to remove vehicle successfully");
				testcase.pass("User is able to remove vehicle successfully");
				AbstractTestCaseReport.sendPassOrFailInfo(testcase);
				
				
				AZOCommonUtils.closeTheBrowser();
				break;

			} 
			catch (Exception e){
				testcase.retry("User should be able to logged out from an AZO account successfully",testcase, retry, e);
				e.printStackTrace();
			}
		}


	}

	@Test(groups = {"Smoke","Regression","YMME" })
	public void SanityUAT_TC05_Change_Primary_Vehicle_from_Profile(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickSignInLink();
				SignInPage.signInToAccount();
				testcase.assertTrue(SignInPage.IsUserLoggedIn(),"User is able to login to an AZO account successfully",
						"User is not able to login to an AZO account successfully");
				testcase.pass("User is able to login to an AZO account successfully");
				
				YMME.MyVehicle();
				testcase.pass("User is navigated to MyVehicle Page");
				HomePage.clickYMMELink();
				YMME.vehicleSet();
				testcase.assertTrue(YMME.isVehicleDisplayed(),"User is able to set vehicle successfully",
						"User is not able to set vehicle successfully");
				testcase.pass("User is able to set current vehicle");
				AbstractTestCaseReport.sendPassOrFailInfo(testcase);
				AZOCommonUtils.closeTheBrowser();
				break;

			} 
			catch (Exception e){
				testcase.retry("User should be able to logged out from an AZO account successfully",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}

	/*
	 * Created By:            Tejaswini
	 * Creation Date:         04/27/2021
	 * Last Modified By:
	 * Last Modification Date:
	 * Test Coverage:
	 * SanityUAT_TC06_User is able to use filters on PLP Page
	 */
	@Test(groups = { "P2", "Smoke", "Product" })
	public void SanityUAT_TC06_User_able_to_use_filters_on_PLP_Page(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(1);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(5);
				testcase.assertTrue(ShelfPage.isPLPFilterDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(5);
				ShelfPage.selectFilterInPLP();
				AZOCommonUtils.assertTest(testcase,ShelfPage.isPLPFilterApplied(),"Filter is applied in PLP page.",
						"Filter is not applied in PLP page");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to apply filter in shelf page.",testcase, retry, e);
				e.printStackTrace();	
			}
		}
	}


	@Test(groups = {"Smoke","Regression","P1" , "Product" })
	public void SanityUAT_TC07_ShelfPageBopusItemAddToCart(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("Spark Plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectBopusInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				AZOCommonUtils.assertTest(testcase,CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");

				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to navigate to cartpage successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}

	@Test(groups = {"Smoke","Regression","P1","Checkout" })
	public void SanityUAT_TC08_ShelfPageSDDItemAddToCart(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("Spark Plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);

				//And Verify that the SDD option is availale on PDP 
				testcase.assertTrue(AZOCommonUtils.isSDDOptionDisplayed(),"SDD Text is displayed in shelf page.",
						"SDD Text is not displayed in shelf page.");
		
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				AZOCommonUtils.assertTest(testcase,CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");

				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to navigate to cartpage successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}


	@Test(groups = {"Smoke","Regression","P1", "Checkout" })
	public void SanityUAT_TC09_ShelfPageNDDItemAddToCart(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);

				//And Verify that the NDD option is availale on PDP
				testcase.assertTrue(AZOCommonUtils.isNDDOptionDisplayed(),"NDD is displayed.",
						"NDD is not displayed.");


				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				AZOCommonUtils.assertTest(testcase,CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");

				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to navigate to cartpage successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}

	@Test(groups = {"Smoke","Regression","P1" ,"Checkout" })
	public void SanityUAT_TC10_ShelfPageSTHItemAddToCart(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				AZOCommonUtils.assertTest(testcase,CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");

				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to navigate to cartpage successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}

	}


	/*
	 * Created By:            Tejaswini
	 * Creation Date:         04/27/2021
	 * Last Modified By:
	 * Last Modification Date:
	 * Test Coverage:
	 * SanityUAT_TC06_User is able to use filters on PLP Page
	 */
	@Test(groups = { "P1", "Smoke" ,"Checkout" })
	public void SanityUAT_TC11_Increase_and_decrease_quantity_in_Mini_Cart(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(1);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.clickOnAddToCart();
				testcase.assertTrue(PDPPage.isQauntityIncreasedInMiniCart(),"User is able to increase the quantity in Mini Cart",
						"User is unable to increase the quantity in Mini Cart");
				AZOCommonUtils.assertTest(testcase,PDPPage.isQauntityDecreasedInMiniCart(),"User is able to decrease the quantity in Mini Cart",
						"User is unable to decrease the quantity in Mini Cart");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to update quantity in mini cart.",testcase, retry, e);
				e.printStackTrace();		
			}
		}
	}

	/*
	 * Created By:            Tejaswini
	 * Creation Date:         04/27/2021
	 * Last Modified By:
	 * Last Modification Date:
	 * Test Coverage:
	 * SanityUAT_TC06_User is able to use filters on PLP Page
	 */
	@Test(groups = { "P1", "Smoke", "Checkout" })
	public void SanityUAT_TC12_Cart_Page_Increase_And_Decrease_quantity(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(1);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				SearchPage.navigateToShelfPage("Spark Plug");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				SeleniumUtils.wait(1);
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				testcase.assertTrue(CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");
				testcase.assertTrue(CartPage.isQauntityIncreased(),"User is able to increase the quantity in Cart",
						"User is unable to increase the quantity in Cart");
				testcase.assertTrue(CartPage.isQauntityDecreased(),"User is able to decrease the quantity in Cart",
						"User is unable to decrease the quantity in Cart");
				CartPage.selectBopusInCart();
				CartPage.selectSthInCart();
				CartPage.removeItemsEmptyCartPage();
				AZOCommonUtils.assertTest(testcase,CartPage.IsCartPageEmpty(),"Items are removed and Cart is empty",
						"User is unable to remove items in Cart");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to navigate to cart page.",testcase, retry, e);
				e.printStackTrace();		
			}
		}
	}

	/*
	 * Created By:            Tejaswini
	 * Creation Date:         04/27/2021
	 * Last Modified By:
	 * Last Modification Date:
	 * Test Coverage:
	 * SanityUAT_TC13_Change store from cart page
	 */
	@Test(groups = { "P1", "Smoke" ,"Checkout" })
	public void SanityUAT_TC13_Change_store_from_cart_page(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(1);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();

				SearchPage.navigateToShelfPage("spark plug");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				SeleniumUtils.wait(1);
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				testcase.assertTrue(CartPage.IsCartPageDisplayed(),"User is able to navigate to cart page",
						"User is not able to navigate to cart page");
				StoreLocationPage.setStoreOnHomePage();
				SeleniumUtils.wait(1);
				AZOCommonUtils.assertTest(testcase,StoreLocationPage.IsStoreDisplayed(),"User is able add/change store in cart page",
						"User is not able add/change store in cart page");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to set/change store in cart page.",testcase, retry, e);
				e.printStackTrace();		
			}
		}
	}


	@Test(groups = { "P1", "Smoke" ,"Checkout"})
	public void SanityUAT_TC14_checkoutSTH_order_with_Ground_Shipping(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				SeleniumUtils.wait(1);
				CheckoutPage.clickSaveButton();
				SeleniumUtils.wait(1);
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterCreditCardDetails();
				SeleniumUtils.wait(1);
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(1);        	
				AZOCommonUtils.assertTest(testcase,CheckoutPage.IsOrderConfirmationPageDisplayed(),"Order confirmation page is displayed",
						"Order confirmation page is displayed");
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}

	@Test(groups = { "P1", "Smoke" ,"Checkout"})
	public void SanityUAT_TC15_checkout_STH_order_with_SDD_Shipping(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				SeleniumUtils.wait(1);
				CheckoutPage.clickSaveButton();
				SeleniumUtils.wait(1);
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(1);
				
				CheckoutPage.enterCreditCardDetails();
				SeleniumUtils.wait(1);
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(1);        	
				AZOCommonUtils.assertTest(testcase,CheckoutPage.IsOrderConfirmationPageDisplayed(),"Order confirmation page is displayed",
						"Order confirmation page is displayed");
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}
	@Test(groups = { "P1", "Smoke" ,"Checkout"})
	public void SanityUAT_TC16_checkout_STH_order_with_NDD_Shipping(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				SeleniumUtils.wait(1);
				CheckoutPage.clickSaveButton();
				SeleniumUtils.wait(1);
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterCreditCardDetails();
				SeleniumUtils.wait(1);
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(1);        	
				AZOCommonUtils.assertTest(testcase,CheckoutPage.IsOrderConfirmationPageDisplayed(),"Order confirmation page is displayed",
						"Order confirmation page is displayed");
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}
	
	
	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void SanityUAT_TC17_checkout_STH_order_with_Ground_Shipping_and_STH_order_with_NDD_shipping_and_BOPUS_order (Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOUrl();
				StoreLocationPage.setStoreOnHomePage();
				testcase.assertTrue(StoreLocationPage.IsStoreDisplayed(),"User is able add store in home page",
						"User is not able add store in home page");
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				SearchPage.navigateToShelfPage("Spark Plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				SeleniumUtils.wait(1);
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectBopusInPdp();
				SeleniumUtils.wait(1);
				PDPPage.clickOnAddToCart();
				SeleniumUtils.wait(1);
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(2);
				CartPage.clickOnCheckoutButton();
               	CheckoutPage.enterShippingDetails();
            	CheckoutPage.selectStateInAddress("TENNESSEE");
            	CheckoutPage.clickSaveButton();
            	SeleniumUtils.wait(1);
            	CheckoutPage.clickKeepThisAddresseButton();
            	SeleniumUtils.wait(1);
            	CheckoutPage.enterCreditCardDetails();
            	CheckoutPage.clickOnCompletePurchaseBtn();
            	SeleniumUtils.wait(3);        	
            	testcase.assertTrue(CheckoutPage.IsOrderConfirmationPageDisplayed(),"Order confirmation page is displayed",
             			"Order confirmation page is displayed");
            	testcase.pass("Order confirmation page is not displayed");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("Order confirmation page is displayed",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }



	
	

	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void SanityUAT_TC18_Checkout_with_Amex_CC_and_SignIn_during_checkout(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				SearchPage.navigateToShelfPage("Spark Plug ");
				PDPPage.clickOnFirstProductInShelfPage();
				PDPPage.selectSthInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				CartPage.clickOnCheckoutButton();
				CheckoutPage.clickLoginBtn();
				SeleniumUtils.wait(4);
				SeleniumUtils.switchingFrameById("loginFrame");
				SignInPage.signInToAccount();
				SeleniumUtils.switchingDefaultContent();
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				SeleniumUtils.wait(1);
				CheckoutPage.clickSaveButton();
				SeleniumUtils.wait(1);
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterCreditCardDetails();
				CheckoutPage.clickOnCompletePurchaseBtn();
				CheckoutPage.IsOrderConfirmationPageDisplayed();
				testcase.assertTrue(CheckoutPage.IsOrderNumberDisplayed(),"User is able to place order.",
						"User is not able to place order.");
				testcase.pass("User is able to place order");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to create an AZO account successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}
	}



	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void SanityUAT_TC19_place_an_order_with_Giftcard(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				SearchPage.navigateToShelfPage("Spark Plug ");
				PDPPage.clickOnFirstProductInShelfPage();
				PDPPage.selectSthInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				CartPage.clickOnCheckoutButton();
				CheckoutPage.enterShippingAddress();
				CheckoutPage.applyGiftCard();
				CheckoutPage.clickOnCompletePurchaseBtn();
				CheckoutPage.IsOrderConfirmationPageDisplayed();
				testcase.assertTrue(CheckoutPage.IsOrderNumberDisplayed(),"User is able to place order.",
						"User is not able to place order.");
				testcase.pass("User is able to place order");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to create an AZO account successfully",testcase, retry, e);
				e.printStackTrace();

			}
		}
	}

	@Test(groups = {"Smoke","Regression","MyAccount" })
	public void smoke_TC020_place_an_order_with_Rewrads(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				   LaunchAZOUrl();
				   HomePage.clickSignInLink();
	               SignInPage.signInToAccount4();
                   SearchPage.navigateToShelfPage("Spark plug ");
                   PDPPage.clickOnFirstProductInShelfPage();
                   PDPPage.selectSthInPdp();
                   PDPPage.clickOnAddToCart();
   				PDPPage.clickOnViewCartButton();
   				CartPage.clickOnCheckoutButton();
                  // CheckoutPage.enterShippingAddress();
 
                   CheckoutPage.clickApplyRewards();
                   CheckoutPage.clickOnCompletePurchaseBtn();
                   CheckoutPage.IsOrderConfirmationPageDisplayed();
                   testcase.assertTrue(CheckoutPage.IsOrderNumberDisplayed(),"User is able to place order.",
                   			"User is not able to place order.");
               testcase.pass("User is able to place order");
				break;
			} 
			catch (Exception e){
				testcase.retry("User should be able to create an AZO account successfully",testcase, retry, e);
				e.printStackTrace();
				
			}
		}
}


	@Test(groups = {"Smoke","Regression","P1" ,"Checkout" })
	public void SanityUAT_TC21_place_an_order_with_Promotions(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				//SearchPage.searchForAnItem();
				SearchPage.navigateToShelfPage("Spark Plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectBopusInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterPromoCode();
				CheckoutPage.clickOnApplyPromoCodeButton();
				SeleniumUtils.wait(4);                 
				testcase.assertTrue(CheckoutPage.isPromoCodeApplied(),"Promocode applied",
						"Promocode not applied");
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(3);
				CheckoutPage.enterCreditCardDetails();
				CheckoutPage.enterShippingAddress();
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(10);  
				CheckoutPage.validateOredrNumber();
				AZOCommonUtils.closeTheBrowser();
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed with promotion",testcase, retry, e);
				e.printStackTrace();

			}
		}
	}

	@Test(groups = { "Smoke","Regression","P2", "Checkout"})
	public void SanityUAT_TC22_Checkout_with_Visa_CC_for_deals_product(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				HomePage.clickOnHambergerMenu();
				SeleniumUtils.wait(5);
				HomePage.clickOnTopDealsLink();
				HomePage.clickOnAnyOfTheProducts();
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(3); 
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				CheckoutPage.clickSaveButton();
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(3);
				CheckoutPage.enterCreditCardDetails();
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(10);  
				CheckoutPage.validateOredrNumber();
				AZOCommonUtils.closeTheBrowser();
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}

	@Test(groups = { "Smoke","Regression","P1", "Checkout"})
	public void SanityUAT_TC23_place_an_order_with_PayPal_payment(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(3); 
				CartPage.clickOnCheckoutButton();
				SeleniumUtils.wait(1);
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				CheckoutPage.clickSaveButton();
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(3);
				CheckoutPage.paypalPaymentInCheckout();
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(10);  
				CheckoutPage.validateOredrNumber();
				AZOCommonUtils.closeTheBrowser();
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}

	@Test(groups = { "Smoke","Regression","Checkout", "P1"})
	public void SanityUAT_TC24_place_an_order_with_PayPal_Express(Method m)
	{
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
		Retry retry = new Retry(0);
		while (retry.retry())
		{
			try
			{
				LaunchAZOUrl();
				SearchPage.navigateToShelfPage("spark plug");
				testcase.assertTrue(SearchPage.IsShelfPageDisplayed(),"User is able to navigate to shelf page",
						"User is not able to navigate to shelf page");
				PDPPage.clickOnFirstProductInShelfPage();
				testcase.assertTrue(PDPPage.IsPdpPageDisplayed(),"User is able to navigate to PDP page",
						"User is not able to navigate to PDP page");
				PDPPage.selectSthInPdp();
				PDPPage.clickOnAddToCart();
				PDPPage.clickOnViewCartButton();
				SeleniumUtils.wait(3); 
				CheckoutPage.ExpressPaypalCartPage();
				SeleniumUtils.wait(2); 
				CheckoutPage.enterShippingDetails();
				CheckoutPage.selectStateInAddress("TENNESSEE");
				CheckoutPage.clickSaveButton();
				CheckoutPage.clickKeepThisAddresseButton();
				SeleniumUtils.wait(3);
				CheckoutPage.clickOnCompletePurchaseBtn();
				SeleniumUtils.wait(10);   
				CheckoutPage.validateOredrNumber();
				AZOCommonUtils.closeTheBrowser();
				break;
			} 
			catch (Exception e){
				testcase.retry("Order confirmation page is displayed",testcase, retry, e);
				e.printStackTrace();
			}
		}

	}


}