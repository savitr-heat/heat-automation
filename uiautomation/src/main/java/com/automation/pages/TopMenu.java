package com.automation.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.Locators;
import com.automation.framework.SeleniumWrapper;


public class TopMenu extends SeleniumWrapper {
	
	public TopMenu(WebDriver driver) throws IOException{

		super(driver);
	}
	public void Incident () throws Exception{
		isElementDisplayed(Locators.TopMenu.NewIncident,1500l);
		clickElement(Locators.TopMenu.incidentMenu);
		
	} 
	public void ServiceRequest() throws Exception{
		clickElement(Locators.TopMenu.ServiceRequest);
		isElementDisplayed(Locators.TopMenu.NewService);	
	}
	public void Problem() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewProblem,1500l);	
		clickElement(Locators.TopMenu.Problem);
	}
	public void change() throws Exception{
		clickElement(Locators.TopMenu.Change);
		isElementDisplayed(Locators.TopMenu.NewChange);	
	
	}
	public void Release() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewRelease,1500l);	
		clickElement(Locators.TopMenu.Release);
		
	}
	public void Knowledge() throws Exception{
		isElementDisplayed(Locators.TopMenu.NewKnowledge,1500l);	
		clickElement(Locators.TopMenu.Knowledge);
		
	}
	public void CI() throws Exception{
		isElementDisplayed(Locators.TopMenu.CI,1500l);
		clickElement(Locators.TopMenu.NewCI);	
	}
	public void More() throws Exception{
		isElementDisplayed(Locators.TopMenu.More,1500l);
		clickElement(Locators.TopMenu.moreLinks);	
		
	}
}

