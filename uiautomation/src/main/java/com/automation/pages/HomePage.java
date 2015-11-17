package com.automation.pages;

/* For each page in your project, create one separate file like this, so that if there are any changes to the app only this file needs to be changed.
 * Keep the naming convention as <Page Name>Page  
 * The page should extend the "SeleniumWrapper" class, so that the methods are available to use
 * Create one function each for logical flow within your application
 */
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.framework.SeleniumWrapper;

public class HomePage extends SeleniumWrapper{


	public HomePage(WebDriver driver) throws IOException
	{
		super(driver);
	}

	public HomePage sendMail(String subject,String body,String to) throws InterruptedException, IOException{

		clickElement(homepage_compose);
		sendTextToElement(homepage_mailTo,to);
		sendTextToElement(homepage_mailSubject, subject);
		sendTextToElement(homepage_mailBody, body);
		clickElement(homepage_sendMailBtn);
		Thread.sleep(20000);
		return new HomePage(driver);

	}

	public LoginPage logOut() throws IOException{
		clickElement(homepage_profileImgBtn);
		clickElement(homepage_logout);
		assertElementPresent(login_signIn);
		return new LoginPage(driver);
	}

}
