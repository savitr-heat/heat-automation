package com.automation.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.HeatWrapper;
import com.automation.framework.Locators;


public class TopMenu extends HeatWrapper {
	
	public TopMenu(WebDriver driver) throws IOException{

		super(driver);
	}
	
	
	public void Incident () throws Exception{
		isElementDisplayed(Locators.TopMenu.incidentMenu);
		clickElement(Locators.TopMenu.incidentMenu);
		isElementDisplayed(Locators.TopMenu.NewIncident);

		
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
		
		isElementDisplayed(Locators.TopMenu.Change);	
		clickElement(Locators.TopMenu.Change);
		isElementDisplayed(Locators.TopMenu.NewChange);	

	
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

