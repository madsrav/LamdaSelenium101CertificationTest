package com.lamdatest.driver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Objects;

import org.testng.annotations.Parameters;

import com.lamdatest.enums.ConfigProperties;
import com.lamdatest.factories.DriverFactory;
import com.lamdatest.utils.PropertyFileUtil;



public class Driver {
	private Driver() {
	}

	@Parameters(value={"browser","version","platform"})
	public static void initDriver(String browser,String version,String platform) {
		if (Objects.isNull(DriverManager.getDriver()))// driver == null
		{
			try {
				DriverManager.setDriver(DriverFactory.getDriver(browser, version, platform));
			} catch (MalformedURLException e) {
				throw new RuntimeException("Please check capabilites of browser");
			}
			DriverManager.getDriver().get(PropertyFileUtil.readDataFromPropertyFile(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	/**
	 * Terminates the browser instance. Sets the threadlocal to default value, i.e
	 * null.
	 * 
	 * @author Sravan Kumar M
	 */
	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver()))// driver!=null
		{
			DriverManager.getDriver().quit();
			DriverManager.unload(); // getDriver() = null;
		}
	}

}
