package com.lamdatest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lamdatest.driver.DriverManager;
import com.lamdatest.enums.WaitingStrategy;
import com.lamdatest.factories.ExplicitWaitFactory;



public class Basepage {
	protected void click(By by, WaitingStrategy waitStrategy, String elementName) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
	}

	protected void sendKeys(By by, String value, WaitingStrategy waitStrategy, String elementName) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

}
