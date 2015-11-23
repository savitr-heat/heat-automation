package com.automation.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class HeatWrapper extends SeleniumWrapper {

	protected WebDriver driver;
	public Properties prop;

	public HeatWrapper(WebDriver driver) throws IOException {
		super(driver);
		this.driver = driver;
		loadProperties();
	}

	private void loadProperties() throws IOException {
		prop = new Properties();
		String propFilename = "src/main/resources/elementLocators.properties";
		InputStream in = new FileInputStream(propFilename);
		prop.load(in);
	}

	public void loginToApp(String username, String password) throws Exception {
		if (username == null && password == null) {
			throw new Exception("User name & password are mandatory");
		}

		isElementDisplayed(Locators.LoginPage.username);
		sendTextToElement(Locators.LoginPage.username, username);
		sendTextToElement(Locators.LoginPage.password, password);
		clickElement(Locators.LoginPage.loginBtn);

		if (isElementDisplayed(Locators.Generic.submitBtn)) {
			clickElement(Locators.Generic.submitBtn);
		}
		isElementDisplayed(Locators.Generic.logOutBtn);
	}

	public void invalidlogin(String username, String password) throws Exception {
		if (username == null && password == null) {
			throw new Exception("User name & password are mandatory");
		}

		sendTextToElement(Locators.LoginPage.username, username);
		sendTextToElement(Locators.LoginPage.password, password);
		clickElement(Locators.LoginPage.loginBtn);

		isElementDisplayed(Locators.Generic.accessDenied);
	}

	public void logoutFrmApp() throws Exception {

		clickElement(Locators.LogOutPage.LogOutBtn);
		clickElement(Locators.Generic.confirmYes);

	}

}
