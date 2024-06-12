package com.test.inSingleClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CreatePage;
import com.methods.HomePage;
import com.methods.LoginPage;

public class Single_Class_TestCase extends BaseTest{
	
	public Single_Class_TestCase()
	{
		super();
	}

	@Test(priority = 1, groups = {"login_logout"})
	public void Login_And_Logout() throws Exception{
		
		ExtentTest test= extent.createTest("Login_And_Logout");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
	Thread.sleep(2000);
	Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
	Thread.sleep(2000);
	test.log(Status.PASS, "The SignIn Page is Displayed");
	test.pass("Verified");
	System.out.println("The LoginPage is displayed");
	Thread.sleep(2000);
	
	LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
	//LoginPage.loginToApplication("training@jalaacademy.com", "jobprogram");
	Thread.sleep(5000);
	System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	
	test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.pass("Verified");
	
	LoginPage.openLogOut();
	Thread.sleep(2000);
	Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
	test.log(Status.PASS, "The SignIn Page is Displayed");
	test.pass("Verified");
	Thread.sleep(2000);
	System.out.println("Sucessfully Logged Out");
}
	
	
	@Test(priority = 2, groups = {"regi","Registering_The_User_Save"})
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
	
	@Test(priority = 3, groups = {"regi","Registering_The_User_Cancel"})
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
	
	@Test (priority = 4, groups = {"regi","Registering_The_User_Selecting_OtherCity"})
	public void Registering_The_User_Selecting_OtherCity() throws Exception{
		
		ExtentTest test= extent.createTest("Registering_The_User_Selecting_OtherCity");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		Thread.sleep(5000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		Thread.sleep(2000);
		System.out.println("The LoginPage is displayed");
		
		test.log(Status.PASS, "The SignIn Page is Displayed");
		test.pass("Verified");
		
		//LoginPage.loginToApplication("training@jalaacademy.com", "jobprogram");
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
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
		
		//CreatePage.selectOtherCitycheckbox();
		//Thread.sleep(3000);
		
		CreatePage.enterOtherCityText("Belagavi");
		System.out.println(CreatePage.isOtherCitySeleted());
		test.log(Status.PASS, "User has selected other city");
		test.pass("Verified");
		Thread.sleep(9000);
		//Assert.assertTrue(CreatePage.isOtherCitySeleted(), "Other City is not selected");
		//Thread.sleep(3000);
		
		Thread.sleep(6000);
		LoginPage.openLogOut();
	}
}
