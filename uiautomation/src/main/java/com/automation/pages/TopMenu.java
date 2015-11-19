package com.automation.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.Locators;
import com.automation.framework.SeleniumWrapper;


public class TopMenu extends SeleniumWrapper {
	
	public TopMenu(WebDriver driver) throws IOException{

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
public void logoutFrmApp() throws Exception{
		
		clickElement(Locators.LogOutPage.LogOutBtn);
		clickElement(Locators.LogOutPage.confirmYes);
		
		
	}
	
	public void Incident () throws Exception{
		isElementDisplayed(Locators.TopMenu.NewIncident);
		clickElement(Locators.TopMenu.incidentMenu);
		
	} 
	public void ServiceRequest() throws Exception{
		
		isElementDisplayed(Locators.TopMenu.NewService);	
		clickElement(Locators.TopMenu.ServiceRequest);
	}
	public void Problem() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewProblem);	
		clickElement(Locators.TopMenu.Problem);
	}
	public void change() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewChange);	

		clickElement(Locators.TopMenu.Change);
	
	}
	public void Release() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewRelease);	
		clickElement(Locators.TopMenu.Release);
		
	}
	public void Knowledge() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewKnowledge);	
		clickElement(Locators.TopMenu.Knowledge);
		
	}
	public void CI() throws Exception{
		isElementDisplayed(Locators.TopMenu.CI);
		clickElement(Locators.TopMenu.NewCI);	
	}
	public void More() throws Exception{
		isElementDisplayed(Locators.TopMenu.More);
		clickElement(Locators.TopMenu.moreLinks);	
		
	}

}

