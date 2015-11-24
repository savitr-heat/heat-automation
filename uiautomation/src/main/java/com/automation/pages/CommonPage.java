package com.automation.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.HeatWrapper;
import com.automation.framework.Locators;

public class CommonPage extends HeatWrapper{

	public CommonPage(WebDriver driver) throws IOException{
		super(driver);
	}
	public void LogoImage() throws Exception{
		isElementDisplayed(Locators.Generic.Logo);
	}
	public void About() throws Exception{
		
		isElementDisplayed(Locators.Common.Help);
		clickElement(Locators.Common.Help);
		clickElement(Locators.Common.About);
		isElementDisplayed(Locators.Common.AboutBox);
	}
	public void AboutTitle() throws Exception{
		isElementDisplayed(Locators.Common.AboutBoxtitle);
	}
	public void AboutCloseIcon() throws Exception{
		isElementDisplayed(Locators.Common.AboutBoxClose);
	}
	public void AboutBoxOk() throws Exception{
		isElementDisplayed(Locators.Common.AboutBoxOk);
	}
	public void AboutBoxIcon() throws Exception{
		isElementDisplayed(Locators.Common.AboutBoxIcon);
	}
	public void UserName() throws Exception{
		isElementDisplayed(Locators.Common.UserName);
	}
	public void SubMenu() throws Exception{
		clickElement(Locators.Common.UserName);
		isElementDisplayed(Locators.Common.SubMenu);
	}
	public void SubMenuLinks()throws Exception{
		isElementDisplayed(Locators.Common.IconPassword);
		isElementDisplayed(Locators.Common.IconLocale);
		isElementDisplayed(Locators.Common.IconPicture);
	}
	public void More() throws Exception {
		isElementDisplayed(Locators.Common.More);
		clickElement(Locators.Common.More);
		isElementDisplayed(Locators.Common.MorePop);
	}
	public void Locale() throws Exception {
		isElementDisplayed(Locators.Common.Locale);
		clickElement(Locators.Common.Locale);
		isElementDisplayed(Locators.Common.LocaleSubMenu);
		isElementDisplayed(Locators.Common.SelectedLocale);
		//System.out.print("")
	}
 public void Incident() throws Exception{
	 	isElementDisplayed(Locators.TopMenu.incidentMenu);
		clickElement(Locators.TopMenu.incidentMenu);
		isElementDisplayed(Locators.TopMenu.NewIncident);
		
		isElementDisplayed(Locators.IncidentPage.Summery);
		isElementDisplayed(Locators.IncidentPage.Status);

	 
 }

}
