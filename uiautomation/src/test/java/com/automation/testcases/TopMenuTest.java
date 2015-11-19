package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.framework.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.HeatLoginPage;

public class TopMenuTest extends BaseTest {
	
	@Test
	public void login() throws Exception {

		heatLoginPage.loginToApp("connector.test", "conrotcd3$");
		
	}

	@Test
	public void incidentTest() throws Exception {
		topMenu.Incident();
	}
	
	@Test
	public void ServiceRequestTest() throws Exception {
		topMenu.ServiceRequest();
	}
	@Test
	public void ProblemTest() throws Exception {
		topMenu.Problem();
	}
	@Test
	public void changeTest() throws Exception {
		topMenu.change();
	}
	@Test
	public void ReleaseTest() throws Exception {
		topMenu.Release();
	}
	@Test
	public void KnowledgeTest() throws Exception {
		topMenu.Knowledge();
	}
	@Test
	public void CItest() throws Exception{
	topMenu.CI();
	}
	@Test
	public void MoreTest() throws Exception{
	topMenu.More();
	}
	
	
	
	
}
