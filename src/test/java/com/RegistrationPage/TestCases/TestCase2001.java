package com.RegistrationPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CreatePage;
import com.methods.HomePage;
import com.methods.LoginPage;

public class TestCase2001 extends BaseTest{

	public TestCase2001()
	{
		super();
	}
	
	@Test
	public void Registering_The_User_Save() throws Exception
	{
		ExtentTest test= extent.createTest("Registering_The_User_Save");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		Thread.sleep(5000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		Thread.sleep(2000);
		test.log(Status.PASS, "The SignIn Page is Displayed");
		test.pass("Verified");
		System.out.println("The LoginPage is displayed");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
			//	"training@jalaacademy.com", "jobprogram");
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
	
		HomePage.openEmployeeDropdown();
		Thread.sleep(2000);
		HomePage.openCreateOption();
		
		CreatePage.registerAStudent("Chetan", "Mali", "malichetan@gmail.com","7204330225","M");
		Thread.sleep(5000);
		
		CreatePage.openSave();
		
		Thread.sleep(10000);
		
		Assert.assertTrue(CreatePage.isSearchGridDisplyaed(), "The Record is successFully Added");
		System.out.println("The Record is successFully Added");
		
		test.log(Status.PASS, "The Record is successFully Added");
		test.pass("Verified");
		
		Thread.sleep(6000);
		LoginPage.openLogOut();
		
	}
}
