package com.ch.azo.mobiletests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.azo.desktoppages.HomePage;
import com.ch.azo.desktoppages.PDPPage;
import com.ch.azo.desktoppages.RegistrationPage;
import com.ch.azo.desktoppages.RewardsPage;
import com.ch.azo.desktoppages.SearchPage;
import com.ch.azo.desktoppages.SignInPage;
import com.ch.azo.desktoppages.StoreLocationPage;
import com.ch.azo.desktoppages.YMME;
import com.ch.azo.mobilepages.CartPageMobile;
import com.ch.azo.mobilepages.CheckoutPageMobile;
import com.ch.azo.mobilepages.HomePageMobile;
import com.ch.azo.mobilepages.RegistrationPageMobile;
import com.ch.azo.mobilepages.PDPPage_Mobile;
import com.ch.azo.mobilepages.SearchPage_Mobile;
import com.ch.azo.mobilepages.StoreLocationPageMobile;
import com.ch.azo.desktoppages.CartPage;
import com.ch.azo.desktoppages.CheckoutPage;
import com.ch.common.bean.User;
import com.ch.common.utils.AZOCommonUtils;
import com.ch.common.utils.TestDataFileUtility;
import com.ch.common.constants.ModuleNames;
import com.ch.common.constants.ObjectConstants;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.utils.DateUtil;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class SanityTestMobile extends AbstractTestCaseReport
{

	public void LaunchAZOMobUrl() throws IOException
    {
        AZOCommonUtils.mobileView(AbstractTestCaseReport.runConfig);
        AZOCommonUtils.AZOURL(AbstractTestCaseReport.runConfig);
        AZOCommonUtils.handleGotItPopUp();
      
    }
  
    @Test(groups = { "P1","Regression", "Sanity" })
    public void SanityMobile_TC01_CreateAnAccount(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.clickCreateAnAccountLinkInMob();
            	RegistrationPageMobile.createAnAccount();
            	testcase.assertTrue(RegistrationPageMobile.IsAZOAccountCreatedInMobile(),"User is able to create an AZO account successfully",
            			"User is not able to create an AZO account successfully");
                testcase.pass("User is able to create an AZO account successfully");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User should be able to create an AZO account successfully",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }

    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC02_SignInWithExistingAccountInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.signInToAccountInMobile();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	testcase.assertTrue(HomePageMobile.IsUserLoggedInMobile(),"User is able to login to an AZO account successfully",
            			"User is not able to login to an AZO account successfully");
                testcase.pass("User is able to login to an AZO account successfully");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User should not be able to login to an AZO account successfully",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC03_SignOutInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.signInToAccountInMobile();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	testcase.assertTrue(HomePageMobile.IsUserLoggedInMobile(),"User is able to login to an AZO account successfully",
            			"User is not able to login to an AZO account successfully");
            	///logout 
            	HomePageMobile.clickMyAccountLinkInMob();
            	HomePageMobile.clickSignouttLinkInMob();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	///
            	testcase.assertTrue(HomePageMobile.IsUserLoggedOutMobile(),"User is able to logged out from an AZO account successfully",
            			"User is not able to logged out from an AZO account successfully");
                testcase.pass("User is able to logged out from an AZO account successfully");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User shouldNOT be able to logged out from an AZO account successfully",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC04_ShelfPageInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
                testcase.pass("User is able to navigate to shelf page");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User isnot able to navigate to shelf page",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC05_PDPInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                testcase.pass("User is able to navigate to PDP page");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User isnot able to navigate to PDP page",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC06_VerifySearchInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	SearchPage_Mobile.searchForAnItemInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsSearchResultPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
                testcase.pass("User is able to navigate to search result page");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User is able to navigate to search result page",testcase, retry, e);
                e.printStackTrace();
            }
        }
    
   }
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC07_AddStoreAndChangeStoreInMobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
                testcase.pass("User is able add store in home page");
                AbstractTestCaseReport.sendPassOrFailInfo(testcase);
                AZOCommonUtils.closeTheBrowser();
                break;
            } 
            catch (Exception e){
            	testcase.retry("User is able add store in home page",testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC08_Guest_Order_Sth_Mobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectSthInPdp();
                PDPPage_Mobile.clickOnAddToCart();
               // PDPPage_Mobile.clickOnGoToCartButton();
                PDPPage_Mobile.clickOnMiniCartButton();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                //SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterShippingDetailsInMobile();
               //	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is not displayed");
            	testcase.pass("Order confirmation page is displayed");
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

    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC09_Guest_Order_Bopus_Mobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectBopusInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterBillingDetailsInMobile();
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is displayed");
            	testcase.pass("Order confirmation page is displayed");
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
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC10_Guest_Order_Mixed_Mobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectBopusInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
                PDPPage_Mobile.clickOnSecondProductInShelfPage();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectSthInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterBillingDetailsInMobile();
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is not displayed");
            	testcase.pass("Order confirmation page is displayed");
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
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC12_Register_Order_Sth_Mobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.signInToAccountInMobile();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	testcase.assertTrue(HomePageMobile.IsUserLoggedInMobile(),"User is able to login to an AZO account successfully",
            			"User is not able to login to an AZO account successfully");
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectSthInPdp();
                PDPPage_Mobile.clickOnAddToCart();
               // PDPPage_Mobile.clickOnGoToCartButton();
                PDPPage_Mobile.clickOnMiniCartButton();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                //SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterShippingDetailsInMobile();
               //	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is not displayed");
            	testcase.pass("Order confirmation page is displayed");
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
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC13_Register_Order_Bopus_Mobile(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.signInToAccountInMobile();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	testcase.assertTrue(HomePageMobile.IsUserLoggedInMobile(),"User is able to login to an AZO account successfully",
            			"User is not able to login to an AZO account successfully");
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectBopusInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterBillingDetailsInMobile();
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is displayed");
            	testcase.pass("Order confirmation page is displayed");
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
    @Test(groups = { "P1","Regression", "Sanity" })
    public void Sanity_TC14_Register_Order_Mixed(Method m)
    {
        String name = new Object() {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name, m);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
            	LaunchAZOMobUrl();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	AZOCommonUtils.clickSigninLinkInMob();
            	HomePageMobile.signInToAccountInMobile();
            	AZOCommonUtils.clickHamburgerMenuInMob();
            	testcase.assertTrue(HomePageMobile.IsUserLoggedInMobile(),"User is able to login to an AZO account successfully",
            			"User is not able to login to an AZO account successfully");
            	StoreLocationPageMobile.setStoreOnHomePage();
            	testcase.assertTrue(StoreLocationPageMobile.IsStoreDisplayed(),"User is able add store in home page",
            			"User is not able add store in home page");
            	SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
            	SeleniumUtils.wait(1);
                PDPPage_Mobile.clickOnFirstProductInShelfPageInMobile();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectBopusInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                SearchPage_Mobile.navigateToShelfPageInMobile();
            	testcase.assertTrue(SearchPage_Mobile.IsShelfPageDisplayedInMobile(),"User is able to navigate to shelf page",
            			"User is not able to navigate to shelf page");
                PDPPage_Mobile.clickOnSecondProductInShelfPage();
                testcase.assertTrue(PDPPage_Mobile.IsPdpPageDisplayedInMobile(),"User is able to navigate to PDP page",
            			"User is not able to navigate to PDP page");
                PDPPage_Mobile.selectSthInPdp();
                PDPPage_Mobile.clickOnAddToCart();
                CartPageMobile.clickOnCheckoutButtonInMobile();
                SeleniumUtils.wait(1);
               	CheckoutPageMobile.enterBillingDetailsInMobile();
               	CheckoutPageMobile.selectStateInAddressInMobile("TENNESSEE");
               	CheckoutPageMobile.clickSaveButtonInMobile();
            	SeleniumUtils.wait(1);
            	CheckoutPageMobile.clickKeepThisAddresseButtonInMobile();
            	SeleniumUtils.wait(3);
            	CheckoutPageMobile.enterCreditCardDetailsInMobile();
            	CheckoutPageMobile.clickOnCompletePurchaseBtnInMobile();
            	SeleniumUtils.wait(5);        	
            	testcase.assertTrue(CheckoutPageMobile.IsOrderConfirmationPageDisplayedInMobile(),"Order confirmation page is displayed",
             			"Order confirmation page is not displayed");
            	testcase.pass("Order confirmation page is displayed");
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

}