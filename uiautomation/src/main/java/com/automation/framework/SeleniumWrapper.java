package com.automation.framework;

/*
 * Do Not change this file without proper Code Review
 * This file is wrapper on core selenium commands to provide useful functions for creating test cases
 * I will be adding more & more functions to this library.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWrapper extends ElementLocators {

	protected WebDriver driver;
	public Properties prop;

	public SeleniumWrapper(WebDriver driver) throws IOException {
		this.driver = driver;
		loadProperties();
	}

	private void loadProperties() throws IOException {
		prop = new Properties();
		String propFilename = "src/main/resources/elementLocators.properties";
		InputStream in = new FileInputStream(propFilename);
		prop.load(in);
	}

	protected void clickElement(String locator) {

		waitForElementToClick(locator);
		getElement(locator).click();

	}
	
	protected String getElementText(String locator)
	{
		waitForElementToClick(locator);
		return getElement(locator).getText();
	}

	private void waitForElementToClick(String locator) {

		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		By by = getElementType(locatorType, locatorValue);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	private void waitForElementToDisplay(String locator) {

		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		By by = getElementType(locatorType, locatorValue);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	private WebElement getElement(String locator) {

		String locatorType = locator.split(":")[0];
		
		String locatorValue =  locator.split(":")[1];
		// System.out.println(locatorType + " and " + locatorValue);
		By by = getElementType(locatorType, locatorValue);
		return driver.findElement(by);

	}

	private By getElementType(String locatorType, String value) {

		By by = null;

		switch (locatorType) {

		case "xpath":
			by = By.xpath(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "id":
			by = By.id(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "class":
			by = By.className(value);
			break;
		case "link":
			by = By.linkText(value);
			break;
		case "partialLink":
			by = By.partialLinkText(value);
			break;
		case "tag":
			by = By.tagName(value);
			break;
		default:
			by = By.linkText(value);
			break;

		}

		return by;
	}

	protected void sendTextToElement(String locator, String text) {
		waitForElementToDisplay(locator);
		getElement(locator).sendKeys(text);

	}

	protected boolean isElementDisplayed(String locator) {

		int count = 1;
		if (getElement(locator).isDisplayed())
			return true;

		while (!(getElement(locator).isDisplayed()) && count < 10) {
			try {
				Thread.sleep(1000);
				count++;
			} catch (InterruptedException e) {

			}

		}
		return getElement(locator).isDisplayed();

	}

	
	protected boolean isElementDisplayed(String locator, Long time) {

		int count = 1;
		if (getElement(locator).isDisplayed())
			return true;

		while (!(getElement(locator).isDisplayed()) && count < 10) {
			try {
				Thread.sleep(time);
				count++;
			} catch (InterruptedException e) {

			}

		}
		return getElement(locator).isDisplayed();

	}

	protected void assertElementPresent(String locator) {
		waitForElementToDisplay(locator);
		Assert.assertTrue(isElementDisplayed(locator), "Element " + locator + "not displayed on page");

	}
	
	

}
