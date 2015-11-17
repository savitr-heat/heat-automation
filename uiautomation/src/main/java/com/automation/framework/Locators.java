package com.automation.framework;

public interface Locators {
	interface Generic {
		public static final String logOutBtn = "id:ext-gen160";
		public static final String submitBtn = "xpath://button[text()='Submit']";
		public static final String accessDenied = "xpath:/html/body/div[1]/div/div[1]/div[2]/form/div[4]/button";
	}
	interface LoginPage {
		public static final String username = "id:UserName";
		public static final String password = "id:Password";
		public static final String loginBtn = "xpath://button[text()='Login']";
		public static final String forgotPass = "Forgot Password?";
		
	}
	interface IncidentPage {
		public static final String description ="id:ext-comp-1790";
	}
	interface LogOutPage{
		public static final String LogOutBtn ="id:ext-gen160";
		public static final String confirmYes ="id:ext-gen214";
	}
}
