package com.lamdatest.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.lamdatest.driver.Driver;



public class BaseTest {
	
	protected BaseTest() {
	}
	
	@Parameters(value={"browser","version","platform"})
	@BeforeMethod
	protected void setUp(String browser,String version,String platform){
		Driver.initDriver(browser, version, platform);
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}

}
