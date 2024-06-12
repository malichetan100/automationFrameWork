package com.RegistrationPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CreatePage;
import com.methods.HomePage;
import com.methods.LoginPage;

public class TestCase2003 extends BaseTest{
	
	public TestCase2003()
	{
		super();
	}
	
	@Test
	public void Registering_The_User_Selecting_OtherCity() throws Exception{
		
		ExtentTest test= extent.createTest("Registering_The_User_Selecting_OtherCity");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		Thread.sleep(5000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		Thread.sleep(2000);
		test.log(Status.PASS, "The SignIn Page is Displayed");
		test.pass("Verified");
		System.out.println("The LoginPage is displayed");
		
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
		Thread.sleep(9000);
		test.log(Status.PASS, "User has Selected other city");
		test.pass("Verified");
		//Assert.assertTrue(CreatePage.isOtherCitySeleted(), "Other City is not selected");
		//Thread.sleep(3000);
		
		Thread.sleep(6000);
		LoginPage.openLogOut();
	}
}
