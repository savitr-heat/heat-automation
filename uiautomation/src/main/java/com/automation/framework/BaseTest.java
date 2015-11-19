package com.automation.framework;

/*
 * This file contains initialization & tear down methods
 * This will be extended while creating any test suites
 */
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.framework.DriverFactory.browserType;
import com.automation.pages.HeatLoginPage;
import com.automation.pages.TopMenu;
import com.automation.pages.LoginPage;

public class BaseTest extends ExcelReader {

	WebDriver driver;
	protected LoginPage loginPage;
	protected HeatLoginPage heatLoginPage;
	protected TopMenu topMenu;
	ExcelReader reader;

	@BeforeTest
	public void init() throws IOException {

		loginPage = new LoginPage(driver);
		heatLoginPage = new HeatLoginPage(driver);
		topMenu = new TopMenu(driver);
		reader = new ExcelReader();
	}

	@BeforeSuite
	public void setup() {

		driver = DriverFactory.getWebDriver(browserType.Chrome);
		//driver.navigate().to("http://gmail.com");
		driver.navigate().to("https://connector-stg.saasit.com/");
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
