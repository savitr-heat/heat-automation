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
	interface TopMenu {
       public static final String home = "id:ext-gen20";
       public static final String incidentMenu = "id:ext-gen24";
       public static final String ServiceRequest = "id:ext-gen28";
       public static final String Problem = "id:ext-gen32";
       public static final String Release ="id:ext-gen40";
       public static final String Change = "id:ext-gen36";
       public static final String plusButton = "id:ext-gen17";
      // public static final String moreLink = "id:ext-gen1029"
       public static final String Knowledge ="id:ext-gen44";
       public static final String CI ="id:ext-gen48";
       public static final String More= "id:ext-gen158";
       public static final String NewIncident ="id:ext-gen139";
       //public static final String NewService ="link:New Service Request";
       public static final String NewService ="id:ext-gen139";
      // public static final String NewProblem="link:New Problem";
       public static final String NewProblem="id:ext-gen139";
       public static final String NewChange ="id:ext-gen139";
       public static final String NewRelease ="xpath://*[@id='ext-gen139']";
       public static final String NewKnowledge="id:ext-gen158";
       public static final String NewCI= "id:ext-gen158";
       public static final String moreLinks="id:ext-comp-1306";
       public static final String PlusLinks ="id:ext-comp-1010";

    	   
            
	}
	
}
