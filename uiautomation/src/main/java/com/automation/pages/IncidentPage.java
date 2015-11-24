/**
 * 
 */
package com.automation.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.HeatWrapper;
import com.automation.framework.Locators;

/**
 * @author sravanthi
 *
 */
public class IncidentPage extends HeatWrapper {
	
	public IncidentPage(WebDriver driver) throws IOException{
		super(driver);
	}
	public void IncidentHome() throws Exception{
	 	isElementDisplayed(Locators.TopMenu.incidentMenu);
		clickElement(Locators.TopMenu.incidentMenu);
		isElementDisplayed(Locators.TopMenu.NewIncident);
	
		isElementDisplayed(Locators.IncidentPage.Summery);
		isElementDisplayed(Locators.IncidentPage.Status);

	 
 }
	public void PageNumber(String number) throws Exception {
		
		isElementDisplayed(Locators.IncidentPage.PageText);
		sendTextToElement(Locators.IncidentPage.PageText, number);

	}
	public void TableElement() throws Exception{
		
		getElementCount(Locators.IncidentPage.Column);
		getElementCount(Locators.IncidentPage.Row);
		
	
		
	}
	


}
