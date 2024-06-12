package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class LoginPage_Locators extends BaseTest {
	
	protected static WebElement username()
	{
		return wd.findElement(By.name("UserName"));
	}
	
	protected static WebElement password()
	{
		return wd.findElement(By.name("Password"));
	}
	
	protected static WebElement loginButton()
	{
		return wd.findElement(By.id("btnLogin"));
	}
	
	protected static WebElement signInText()
	{
		return wd.findElement(By.xpath("//p[@class='login-box-msg']"));
	}
	

	protected static WebElement forgetPassword()
	{
		return wd.findElement(By.linkText("Forgot Password"));
	}
	
	protected static WebElement forgetEmail()
	{
		return wd.findElement(By.id("Email"));
	}
	
	protected static WebElement forgetPasswordBtn()
	{
		return wd.findElement(By.id("btnForgotPassword"));
	}

	protected static WebElement inValidEmail()
	{
		return wd.findElement(By.className("toast-title"));
	}
	
	protected static WebElement ValidEmail()
	{
		return wd.findElement(By.xpath("//div[@class='toast toast-success']"));
	}
	
	protected static WebElement backbutton()
	{
		return wd.findElement(By.linkText("Back"));
	}
	
	protected static WebElement adminLogin()
	{
		return wd.findElement(By.linkText("Admin Login"));
	}
	
	protected static WebElement adminUserName()
	{
		return wd.findElement(By.id("UserName"));
	}
	
	protected static WebElement adminPassword()
	{
		return wd.findElement(By.id("Password"));
	}
	
	protected static WebElement adminCredentialAlert()
	{
		return wd.findElement(By.id("dvAlert"));
	}
	
	protected static WebElement logOut()
	{
		return wd.findElement(By.linkText("Logout"));
	}
	
	
}
