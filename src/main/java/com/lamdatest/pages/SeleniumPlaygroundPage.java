package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class SeleniumPlaygroundPage extends Basepage{

	
	@FindBy(xpath = "//a[text()='Simple Form Demo']")private WebElement linkSimpleFormDemo;
	@FindBy(xpath = "//a[text()='Drag & Drop Sliders']")private WebElement linkDragAndDrop;
	@FindBy(xpath = "//a[contains(@href,'input-form')]")private WebElement linkInputForm;	
	public SeleniumPlaygroundPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getLinkSimpleFormDemo() {
		return linkSimpleFormDemo;
	}

	public WebElement getLinkDragAndDrop() {
		return linkDragAndDrop;
	}

	public WebElement getLinkInputForm() {
		return linkInputForm;
	}	
}
