package com.automation.framework;

public interface Locators {
	interface Generic { 
		public static final String logOutBtn = "id:ext-gen160";
		public static final String submitBtn = "xpath://button[text()='Submit']";
		public static final String accessDenied = "xpath:/html/body/div[1]/div/div[1]/div[2]/form/div[4]/button";
		public static final String Logo="id:app-frame-logo";
		public static final String confirmYes= "id:ext-gen219";
		
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
       public static final String NewService ="id:ext-gen139";
       public static final String NewProblem="id:ext-gen139";
       public static final String NewChange ="id:ext-gen139";
       public static final String NewRelease ="xpath://*[@id='ext-gen139']";
       public static final String NewKnowledge="id:ext-gen158";
       public static final String NewCI= "id:ext-gen158";
       public static final String moreLinks="id:ext-comp-1306";
       public static final String PlusLinks ="id:ext-comp-1010";

    	       
	}
	interface Common {
		public static final String Help ="id:ext-gen167";
		public static final String About="id:ext-comp-1264";//xpath://html/body/div[11]/ul/li[4]/a/span";
		public static final String AboutBox ="id:ext-comp-1307";
		public static final String AboutBoxOk="id:ext-comp-1302";//xpath://html/body/div[13]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/em/button";
		public static final String AboutBoxIcon="class:ext-mb-icon  ext-mb-info";
		public static final String AboutBoxText="2015.2.1.13025 @ Built On 2015/11/18 UTC Deployed On 2015/11/20 00:34:20 UTC";
		public static final String AboutBoxClose="class:x-tool x-tool-close ";
		public static final String AboutBoxtitle="class:about-app-name";//xpath://;html/body/div[13]/div[1]/div/div/div/span";
		public static final String UserName="id:ext-gen171";
		public static final String SubMenu="id:ext-comp-1004";///html/body/div[13]
		public static final String ChangePasswordLink="xpath://html/body/div[13]/ul/li[1]/a";
		public static final String ChangeLocaleLink ="xpath://html/body/div[13]/ul/li[2]/a";
		public static final String ChangePictureLink="xpath://html/body/div[13]/ul/li[3]/a";
		public static final String IconPassword="xpath://html/body/div[14]/ul/li[1]/a/img";//id:ext-gen242
		public static final String IconLocale="id:ext-gen244";//xpath://html/body/div[13]/ul/li[2]/a/img";
		public static final String IconPicture ="id:ext-gen246";//xpath://html/body/div[13]/ul/li[3]/a/img";
		public static final String Configuration ="id:ext-gen174";
		public static final String MorePop ="id:ext-gen1308";
		public static final String More ="id:ext-gen166";
	
	};
	
}
