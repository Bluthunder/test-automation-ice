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

public class YMME {

	public static void clickOnHamburgerMenu() {

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.HAMBURGER_MENU));

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.HAMBURGER_MENU));

	}

	/**
	 * This function is for User to select Vehicle Year URL.
	 * 
	 * @throws Throwable 
	 * Created By: Himanshu 
	 * Created Date: 10/02/2020 
	 * Last Modified By:
	 * Last Modified Date:
	 */
	public static void selectYear() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_YEAR_VEHICLE));
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_YEAR_VEHICLE),
				PropertyUtil.getObjectValue(ObjectConstants.YEAR),2);
		SeleniumUtils.wait(1);
	

	}

	/**
	 * This function is for User to select Vehicle Make URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void selectMake() throws Exception {

		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_MAKE_VEHICLE));

		SeleniumUtils.wait(1);
//		            SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME,ObjectConstants.MAKE_VEHICLE_BUTTON),
//							PropertyUtil.getObjectValue(ObjectConstants.MAKE));
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_MAKE_VEHICLE),
				PropertyUtil.getObjectValue(ObjectConstants.MAKE),1);
		
	}
	
	
	public static void clickYMME() throws Exception {

		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MYVEHICLE_ADDVEHICLE));
	}


	/**
	 * This function is for User to select Vehicle Model URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void selectModel() throws Exception {

		SeleniumUtils.wait(1);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_MODEL_VEHICLE));
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_MODEL_VEHICLE),
				PropertyUtil.getObjectValue(ObjectConstants.MODEL),1);
		
	}

	/**
	 * This function is for User to select Vehicle Engine URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void selectEngine() throws Exception {
		SeleniumUtils.wait(2);
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_ENGINE_VEHICLE));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.ENGINE_FIRST_OPTION));
		SeleniumUtils.wait(1);
		//SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.IN_ENGINE_VEHICLE),
			//	PropertyUtil.getObjectValue(ObjectConstants.ENGINE),1);
		
	}

	/**
	 * This function is used for selecting vehicle Via YMME URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static void vehicleSet() throws Exception {
		selectYear();
		selectMake();
		selectModel();
		selectEngine();

	}

	/**
	 * This function is used for validating vehicle is set via ymme URL.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isVehicleDisplayed() {
		boolean flag = false;
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.VEHICLE_SET));
		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.VEHICLE_SET),1);

		return flag;
	}
	/**
	 * This function is used for validating My vehicle page is opened with empty vehicle.
	 * 
	 * @throws Throwable Created By: Himanshu Created Date: 10/02/2020 Last Modified
	 *                   By: Last Modified Date:
	 */
	public static boolean isEmptyVehiclePageDisplayed() {
		boolean flag = false;
		SeleniumUtils.wait(2);
		AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MYVEHICLE_EMPTY));
		flag = SeleniumUtils
				.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MYVEHICLE_EMPTY),1);

		return flag;
	}
	
	public static void MyVehicle()
    {
                    SeleniumUtils.wait(1);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.BUTTON_MYACCOUNT_HOME));
                    SeleniumUtils.wait(1);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.MY_VEHICLE));
                    SeleniumUtils.wait(3);
    }
    
    public static void ServiceHistory()
    {
    	            SeleniumUtils.wait(8);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.SERVICE_HISTORY));
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.CONTINUE_BUTTON));
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.NICK_NAME),
                                                    PropertyUtil.getObjectValue(ObjectConstants.NICKNAME),2);
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.COLOR),
                                                    PropertyUtil.getObjectValue(ObjectConstants.VEHCOLOR),2);
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.VIN),
                                                    PropertyUtil.getObjectValue(ObjectConstants.VEHVIN),2);
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.PLATE_NUMBER),
                                                    PropertyUtil.getObjectValue(ObjectConstants.PLATENUMBER),2);
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.CURRENT_MILEAGE),
                                                    PropertyUtil.getObjectValue(ObjectConstants.CURRENTMILEAGE),2);
                    SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MILEAGE_RATE),
                                                    PropertyUtil.getObjectValue(ObjectConstants.MILEAGERATE),2);
SeleniumUtils.dropDownByVisibleText(
                                                    ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.FREQUENCY), "Per Day");
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.SAVE_BUTTON));
    }
    
    public static boolean IsMyVehiclePageDisplayed() {
                    boolean flag = false;
                    AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MYVEHICLE_PAGE));
                    flag = SeleniumUtils
                                                    .iSDisplayed(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.MYVEHICLE_PAGE),2);

                    return flag;
    }
    public static boolean IsServiceHistoryUpdated() {
                    boolean flag = false;
                    AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.EST_MILEAGE_TITLE));
                    flag = SeleniumUtils
                                                    .iSDisplayed(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.EST_MILEAGE_TITLE),2);

                    return flag;
    }
    
    public static boolean IsCurrentVehicleSet() {
                    boolean flag = false;
                    AZOCommonUtils.waitUntilElementIsVisible(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.CURRENT_VEHICLE));
                    flag = SeleniumUtils
                              .iSDisplayed(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.CURRENT_VEHICLE),2);

                    return flag;
    }
    public static void close()
    {
                    SeleniumUtils.wait(5);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.REMOVE));
                    SeleniumUtils.wait(1);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.REMOVE_BUTTON));
    }
    
    public static void CurrentVehicleSet()
    {
                    SeleniumUtils.wait(1);
                    SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.YMME, ObjectConstants.SET_CURRENT_VEHICLE));
    }



}