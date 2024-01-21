package com.lamdatest.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	/**
	 * Private constructor to avoid external instantiation
	 */
	private DriverManager() {
	}

	public static ThreadLocal<WebDriver> drLocal = new ThreadLocal<WebDriver>();

	/**
	 * Returns the thread safe {@link org.openqa.selenium.WebDriver} instance
	 * fetched from ThreadLocal variable.
	 * 
	 * @author Sravan Kumar M
	 * @return {@link org.openqa.selenium.WebDriver} instance
	 */
	public static WebDriver getDriver() {
		return drLocal.get();
	}

	/**
	 * Set the WebDriver instance to thread local variable
	 * 
	 * @author Sravan Kumar M 
	 * @param driverref {@link org.openqa.selenium.WebDriver} instance that needs to
	 *                  saved from Thread safety issues.
	 */
	public static void setDriver(WebDriver driverref) {
		drLocal.set(driverref);
	}

	/**
	 * Calling remove method on Threadlocal variable ensures to set the default
	 * value to Threadlocal variable. It is much safer than assigning null value to
	 * ThreadLocal variable.
	 * 
	 * @author Sravan Kumar M
	 */
	public static void unload() {
		drLocal.remove();
	}


}
