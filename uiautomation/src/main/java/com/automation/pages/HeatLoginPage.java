package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.HeatWrapper;
import com.automation.framework.Locators;

public class HeatLoginPage extends HeatWrapper {
	
	public HeatLoginPage(WebDriver driver) throws IOException
	{
		super(driver);
	}
	public void loginToApp(String username, String password) throws Exception
	{
		if (username == null && password == null)
		{
			throw new Exception("User name & password are mandatory");
		}
		
		sendTextToElement(Locators.LoginPage.username, username);
		sendTextToElement(Locators.LoginPage.password, password);
		clickElement(Locators.LoginPage.loginBtn);
		
		if(isElementDisplayed(Locators.Generic.submitBtn))
		{
			clickElement(Locators.Generic.submitBtn);
		}
		isElementDisplayed(Locators.Generic.logOutBtn);
	}
	
	public void invalidlogin(String username, String password) throws Exception
	{
		if (username == null && password == null)
		{
			throw new Exception("User name & password are mandatory");
		}
		
		sendTextToElement(Locators.LoginPage.username, username);
		sendTextToElement(Locators.LoginPage.password, password);
		clickElement(Locators.LoginPage.loginBtn);
	    
		isElementDisplayed(Locators.Generic.accessDenied);
	}
	public void logoutFrmApp() throws Exception{
		
		clickElement(Locators.LogOutPage.LogOutBtn);
		clickElement(Locators.LogOutPage.confirmYes);
		
		
	}

}
