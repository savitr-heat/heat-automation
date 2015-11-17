package com.automation.framework;

/* 
 * This is place where you will define the element locators
 * Provide details how you want to identify the element & data
 * Typically handlled with controlled modification
 */
public class ElementLocators {

	public static final String login_username = "id:Email";
	public static final String login_password = "id:Passwd";
	public static final String login_next = "id:next";
	public static final String login_signIn = "id:signIn";

	public static final String homepage_compose = "xpath://div[text()='COMPOSE']";
	public static final String homepage_mailTo = "name:to";
	public static final String homepage_mailSubject = "name:subjectbox";
	public static final String homepage_mailBody = "xpath://div[@class='Am Al editable LW-avf']";
	public static final String homepage_sendMailBtn = "xpath://div[text()='Send']";
	public static final String homepage_profileImgBtn = "xpath://a[contains(@title,'Google Account')]/span";
	public static final String homepage_logout = "xpath://a[text()='Sign out']";

}
