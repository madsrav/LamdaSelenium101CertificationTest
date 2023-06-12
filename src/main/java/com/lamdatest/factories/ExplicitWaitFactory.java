package com.lamdatest.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lamdatest.constants.FrameworkConstants;
import com.lamdatest.driver.DriverManager;
import com.lamdatest.enums.WaitingStrategy;

public final class ExplicitWaitFactory {
	/**
	 * Private constructor to avoid external instantiation
	 */
	private ExplicitWaitFactory() {
	}

	/**
	 * 
	 * @author Pavan Kumar T
	 * @param waitStrategy Strategy to be applied to find a web element
	 *                     {@link com.lamdatest.enums.WaitingStrategy}
	 * @param by           By locator of the webelement
	 * @return web element Locates and return the web element
	 */
	public static WebElement performExplicitWait(WaitingStrategy waitStrategy, By by) {
		WebElement element = null;
		if (waitStrategy == WaitingStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(),
					Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
					.until(ExpectedConditions.elementToBeClickable(by));
		} else if (waitStrategy == WaitingStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(),
					Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if (waitStrategy == WaitingStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(),
					Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		} else if (waitStrategy == WaitingStrategy.NONE) {
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
	}
}
