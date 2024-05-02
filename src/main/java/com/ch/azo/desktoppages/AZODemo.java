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

public class AZODemo {

	public static void clickOnHamburgerMenu() {
		
			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.HAMBURGER_MENU));
		
	}

	public static void selectItem() {
		SeleniumUtils.wait(1);
		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SEARCH_TEXTBOX),
				PropertyUtil.getObjectValue(ObjectConstants.AZO_ITEM));
		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.HOMEPAGE, ObjectConstants.SEARCH_BUTTON));
		SeleniumUtils.wait(1);

	}
	
	

}