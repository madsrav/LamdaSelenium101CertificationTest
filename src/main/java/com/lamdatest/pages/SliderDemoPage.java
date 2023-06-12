package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class SliderDemoPage {
	@FindBy(xpath = "//h4[text()=' Default value 15']/..//input")
	private WebElement inputSlider15;
	@FindBy(id = "rangeSuccess")
	private WebElement rangeoutput15;

	public SliderDemoPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getInputSlider15() {
		return inputSlider15;
	}

	public WebElement getRangeoutput15() {
		return rangeoutput15;
	}

}
