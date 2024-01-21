package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class SimpleFormDemoPage {
	
	@FindBy(id = "user-message")private WebElement inputBoxEnterMessage;
	@FindBy(id = "showInput")private WebElement buttonGetCheckedvalue;
	@FindBy(xpath = "//div[@id='user-message']/p[@id='message']")private WebElement resultMessage;
	
	public SimpleFormDemoPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getInputBoxEnterMessage() {
		return inputBoxEnterMessage;
	}

	public WebElement getButtonGetCheckedvalue() {
		return buttonGetCheckedvalue;
	}

	public WebElement getResultMessage() {
		return resultMessage;
	}
	
}
