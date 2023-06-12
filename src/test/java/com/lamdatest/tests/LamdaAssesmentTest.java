package com.lamdatest.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.lamdatest.driver.DriverManager;
import com.lamdatest.pages.FormDemoPage;
import com.lamdatest.pages.SeleniumPlaygroundPage;
import com.lamdatest.pages.SimpleFormDemoPage;
import com.lamdatest.pages.SliderDemoPage;
import com.lamdatest.utils.WebDriverUtil;

public class LamdaAssesmentTest extends BaseTest {

	@Test
	public void Scenario_1Test() {
		SeleniumPlaygroundPage seleniumPlaygroundPage = new SeleniumPlaygroundPage();
		SimpleFormDemoPage simpleFormDemoPage = new SimpleFormDemoPage();
		
		seleniumPlaygroundPage.getLinkSimpleFormDemo().click();
		String Url = DriverManager.getDriver().getCurrentUrl();
		Assert.assertTrue(Url.contains("simple-form-demo"), "URL not contains 'simple-form-demo' ");
		Reporter.log("Successfully navigated to simple-form-demo page",true);

		String value = "Welcome to LambdaTest";
		simpleFormDemoPage.getInputBoxEnterMessage().sendKeys(value);
		simpleFormDemoPage.getButtonGetCheckedvalue().click();
		String resultMessage = simpleFormDemoPage.getResultMessage().getText();
		Assert.assertEquals(resultMessage, value);
		Reporter.log("Value Entered Welcome to LambdaTest is successfully reflected as same in your message section",true);

	}
	
	
	@Test
	public void Scenario_2Test() throws InterruptedException {
		SeleniumPlaygroundPage seleniumPlaygroundPage = new SeleniumPlaygroundPage();
		SliderDemoPage sliderDemoPage=new SliderDemoPage();
		
		WebElement slider = sliderDemoPage.getInputSlider15();
		seleniumPlaygroundPage.getLinkDragAndDrop().click();
		
		Actions actions=new Actions(DriverManager.getDriver());
		actions.dragAndDropBy(slider, 215, 0).perform();
		
		String result=sliderDemoPage.getRangeoutput15().getText();
		Assert.assertEquals(result, "95");
		Reporter.log("Successfully drag and dropped to 95 Value",true);
		
		
	}
	
	@Test
	public void Scenario_3Test() throws InterruptedException {
		SeleniumPlaygroundPage seleniumPlaygroundPage = new SeleniumPlaygroundPage();
		FormDemoPage formDemoPage=new FormDemoPage();
		
		seleniumPlaygroundPage.getLinkInputForm().click();
		WebDriverUtil.scrollAction(200);
		formDemoPage.getButtonSubmit().click();
		String toolTipMessage=formDemoPage.getTextBoxName().getAttribute("validationMessage");
		Assert.assertTrue(toolTipMessage.equals("Please fill out this field."));
		formDemoPage.enterDetails();
		formDemoPage.getButtonSubmit().click();
		Assert.assertTrue(formDemoPage.getSuccessMessag().isDisplayed()); 
		String resultMessage=formDemoPage.getSuccessMessag().getText();
		Reporter.log(resultMessage+" is Displayed",true);
	}

}
