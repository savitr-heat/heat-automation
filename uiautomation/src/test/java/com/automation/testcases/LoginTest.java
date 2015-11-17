package com.automation.testcases;

/*
 * This is your test suite, where you will write your test cases
 * Avoid using direct selenium functions over here, so that maintenance will be easier in future
 * Follow the annotations so that proper grouping of test cases can be done.
 * Each test suite will extend BaseTest
 */
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.framework.BaseTest;
import com.automation.pages.HomePage;

public class LoginTest extends BaseTest {

	@Test
	public void loginAndSendMail() throws InterruptedException, IOException {

		HomePage homePage = loginPage.loginToApp("pageobjectmodel@gmail.com", "interOP@123");
		homePage.sendMail("Test", "Testing Page object demo", "pageobjectmodel@gmail.com");
		homePage.logOut();
	}

	@Test
	public void loginAndSendMailUsingExcel() throws Exception {

		setSheetName("Sheet1");
		setTestDataId("TC1");

		HomePage homePage = loginPage.loginToApp(getTestDataFromExcel("UserName"), getTestDataFromExcel("Password"));
		homePage.sendMail("Test", "Testing Page object demo", "pageobjectmodel@gmail.com");
		homePage.logOut();
	}

	@Parameters({ "username", "password" })
	@Test(enabled = false)
	public void loginAndSendMailUsingXml(String UserName, String password) throws Exception {

		HomePage homePage = loginPage.loginToApp(UserName, password);
		homePage.sendMail("Test", "Testing Page object demo", "pageobjectmodel@gmail.com");
		homePage.logOut();
	}
	
}
