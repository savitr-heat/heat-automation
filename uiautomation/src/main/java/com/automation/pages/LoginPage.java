package com.automation.pages;

/* For each page in your project, create one separate file like this, so that if there are any changes to the app only this file needs to be changed.
 * Keep the naming convention as <Page Name>Page  
 * The page should extend the "SeleniumWrapper" class, so that the methods are available to use
 * Create one function each for logical flow within your application
 */
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{


	public LoginPage(WebDriver driver) throws IOException{

		super(driver);
	}

	public HomePage loginToApp(String username,String pwd) throws InterruptedException, IOException{
		if(isElementDisplayed(login_username)){
			sendTextToElement(login_username, username);
			clickElement(login_next);}
		sendTextToElement(login_password, pwd);
		clickElement(login_signIn);
		return new HomePage(driver);
	}


}
