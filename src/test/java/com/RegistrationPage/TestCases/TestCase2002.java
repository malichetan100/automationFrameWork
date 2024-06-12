package com.RegistrationPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CreatePage;
import com.methods.HomePage;
import com.methods.LoginPage;

public class TestCase2002 extends BaseTest{
	
	public TestCase2002()
	{
		super();
	}
	
	@Test
	public void Registering_The_User_Cancel() throws Exception{
		ExtentTest test= extent.createTest("Registering_The_User_Cancel");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
	Thread.sleep(5000);
	Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
	Thread.sleep(2000);
	test.log(Status.PASS, "The SignIn Page is Displayed");
	test.pass("Verified");
	System.out.println("The LoginPage is displayed");
	
	LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
	//LoginPage.loginToApplication("training@jalaacademy.com", "jobprogram");
	Thread.sleep(2000);
	
	Thread.sleep(5000);
	System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.pass("Verified");

	HomePage.openEmployeeDropdown();
	Thread.sleep(2000);
	HomePage.openCreateOption();
	Thread.sleep(2000);
	CreatePage.registerAStudent("Chetan", "Mali", "malichetan@gmail.com","7204330225","M");
	Thread.sleep(5000);

	/*
	 * 1  QA-Automation
	 * 2  Full Stack Developer
	 * 3  DevOps
	 * 4  Middleware
	 * 5  AWS
	 * 6  WebServices
	 */
	CreatePage.checkSkills(1);
	Thread.sleep(5000);
	CreatePage.checkSkills(6);
	Thread.sleep(5000);
	
	CreatePage.selectCountry("India");
	Thread.sleep(5000);
	
	CreatePage.selectCity("Pune");
	Thread.sleep(5000);
	
	CreatePage.openCancel();
	
	Thread.sleep(6000);
	LoginPage.openLogOut();
}
}