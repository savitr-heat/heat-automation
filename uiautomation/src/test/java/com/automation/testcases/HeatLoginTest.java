package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.framework.BaseTest;

public class HeatLoginTest extends BaseTest {

	
	@Test
	public void login() throws Exception {

		heatLoginPage.loginToApp("connector.test", "conrotcd3$");
		
	}
	
	/*@Test
	public void wronglogin() throws Exception {
		heatLoginPage.invalidlogin("connector.test", "abcd$");
	}
	*/
	@Test
	public void logout() throws Exception {
		heatLoginPage.logoutFrmApp();
	}
	
}
