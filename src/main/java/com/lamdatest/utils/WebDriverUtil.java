package com.lamdatest.utils;

import org.openqa.selenium.JavascriptExecutor;

import com.lamdatest.driver.DriverManager;

public class WebDriverUtil {
	
	/**
	 * This method will scroll down for 500 units
	 * @param driver
	 */
	public static void scrollAction(int yValue)
	{
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,"+yValue+")", "");
	}

}
