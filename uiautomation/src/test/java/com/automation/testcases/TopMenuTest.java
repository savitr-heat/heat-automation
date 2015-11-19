package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.framework.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.HeatLoginPage;

public class TopMenuTest extends BaseTest {
	
/*@Test
	public void login() throws Exception {

		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Incident();
		//topMenu.ServiceRequest();
		//topMenu.Problem();
		//topMenu.change();
		topMenu.Release();
		topMenu.Knowledge();
		topMenu.CI();
		topMenu.More();
	}*/

	@Test
	public void incidentTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Incident();
		topMenu.logoutFrmApp();

	}
	
	/*@Test
	public void ServiceRequestTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Incident();	
		topMenu.logoutFrmApp();

	}
	@Test
	public void ProblemTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Problem();
		topMenu.logoutFrmApp();

	}
	@Test
	public void changeTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.change();
		topMenu.logoutFrmApp();

	}
	@Test
	public void ReleaseTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Release();
		topMenu.logoutFrmApp();

	}
	@Test
	public void KnowledgeTest() throws Exception {
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.Knowledge();
		topMenu.logoutFrmApp();

	}
	@Test
	public void CItest() throws Exception{
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.CI();
		topMenu.logoutFrmApp();

	}
	@Test
	public void MoreTest() throws Exception{
		topMenu.loginToApp("connector.test", "conrotcd3$");
		topMenu.More();
		topMenu.logoutFrmApp();

	}*/
	
	
	
	
}
