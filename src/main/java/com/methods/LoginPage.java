package com.methods;

import com.Weblocators.LoginPage_Locators;

public class LoginPage extends LoginPage_Locators{

 
	public static void loginToApplication(String usrname,String pwd)
	{
		
		username().sendKeys(usrname);
		password().sendKeys(pwd);
		openLoginButton();	
	}
	
	public static void openLoginButton()
	{
		loginButton().click();
	}
	
	public static boolean isSignInDisplayed()
	{
		return signInText().isDisplayed();
	}
	
	public static String getSignInText()
	{
		return signInText().getText();
	}
	
	public static void openForgetPasswordLink()
	{
		forgetPassword().click();
	}
	
	public static void enterEmail(String Email)
	{
		forgetEmail().sendKeys(Email);
	}
	
	public static void clearEmail()
	{
		forgetEmail().clear();
	}
	
	public static void clickForgetPasswordbtn()
	{
		forgetPasswordBtn().click();
	}
	
	public static String getinValidEmailtext()
	{
		return inValidEmail().getText();
	}
	
	public static boolean inValidtextDisplayed()
	{
		return inValidEmail().isDisplayed();
	}
	
	public static String getValidEmailtext()
	{
		return ValidEmail().getText();
	}
	
	public static boolean validtextDisplayed()
	{
		return ValidEmail().isDisplayed();
	}
	
	public static void openBackbutton()
	{
		backbutton().click();
	}
	
	public static void openAdminLogin()
	{
		adminLogin().click();
	}
	
	public static void adminLogin(String usrname,String pass)
	{
		adminUserName().sendKeys(usrname);
		adminPassword().sendKeys(pass);
	}
	
	public static boolean isadminCredentialAlertDisplayed()
	{
		return adminCredentialAlert().isDisplayed();
	}
	
	public static void openLogOut()
	{
		logOut().click();
	}
	
	
}
