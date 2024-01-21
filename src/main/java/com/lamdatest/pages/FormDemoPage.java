package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lamdatest.driver.DriverManager;

public class FormDemoPage {

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement buttonSubmit;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement textBoxName;
	@FindBy(id = "inputEmail4")
	private WebElement textBoxEmail;
	@FindBy(name = "password")
	private WebElement textBoxPassword;
	@FindBy(name = "company")
	private WebElement textBoxCompany;
	@FindBy(name = "website")
	private WebElement textBoxWebsite;
	@FindBy(name = "country")
	private WebElement dropdownCountry;
	@FindBy(name = "city")
	private WebElement textBoxCity;
	@FindBy(id = "inputAddress1")
	private WebElement textBoxAdress1;
	@FindBy(id = "inputAddress2")
	private WebElement textBoxAdress2;
	@FindBy(id = "inputState")
	private WebElement textBoxState;
	@FindBy(name = "zip")
	private WebElement textBoxZipcode;
	@FindBy(xpath = "//h2[.='Input form validations']/..//p")
	private WebElement successMessag;

	public FormDemoPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public WebElement getButtonSubmit() {
		return buttonSubmit;
	}

	public WebElement getTextBoxName() {
		return textBoxName;
	}

	public WebElement getTextBoxEmail() {
		return textBoxEmail;
	}

	public WebElement getTextBoxPassword() {
		return textBoxPassword;
	}

	public WebElement getTextBoxCompany() {
		return textBoxCompany;
	}

	public WebElement getTextBoxWebsite() {
		return textBoxWebsite;
	}

	public WebElement getDropdownCountry() {
		return dropdownCountry;
	}

	public WebElement getTextBoxCity() {
		return textBoxCity;
	}

	public WebElement getTextBoxAdress1() {
		return textBoxAdress1;
	}

	public WebElement getTextBoxAdress2() {
		return textBoxAdress2;
	}

	public WebElement getTextBoxState() {
		return textBoxState;
	}

	public WebElement getTextBoxZipcode() {
		return textBoxZipcode;
	}
	
	
	public WebElement getSuccessMessag() {
		return successMessag;
	}

	public void enterDetails() {
		textBoxName.sendKeys("LamdaTestAdmin");
		textBoxEmail.sendKeys("lamdatest123@gmail.com");
		textBoxPassword.sendKeys("lamda@4238");
		textBoxCompany.sendKeys("Lamda");
		textBoxWebsite.sendKeys("lamdaTest.co.in");
		
		Select select=new Select(dropdownCountry);
		select.selectByVisibleText("India");
		textBoxCity.sendKeys("Tamilnadu");
		textBoxAdress1.sendKeys("Tamilnadu,Chennai");
		textBoxAdress2.sendKeys("Tamilnadu,Chennai");
		textBoxState.sendKeys("Chennai");
		textBoxZipcode.sendKeys("600012");
	}

}
