package com.LoginPage.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;

public class TestCase1004 extends BaseTest{

	public TestCase1004()
	{
		super();
	}
	
	@Test
	public void Login_And_Logout() throws Exception{
		
		ExtentTest test= extent.createTest("Login_And_Logout");
		test.log(Status.PASS, "Test Step 1: User Launched Website : "+wd.getCurrentUrl());
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass("Verified");
	Thread.sleep(2000);
	Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
	Thread.sleep(2000);
	test.log(Status.PASS, "Test Step 2: The SignIn Page is Displayed");
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
	//test.pass("Verified");
	System.out.println("The LoginPage is displayed");
	Thread.sleep(2000);
	
//	LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
	//LoginPage.loginToApplication("training@jalaacademy.com", "jobprogram");
	Thread.sleep(5000);
	System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	
	test.log(Status.PASS, "Test Step 3 : The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
	//test.pass("Verified");
	
	LoginPage.openLogOut();
	Thread.sleep(2000);
	Assert.assertTrue(LoginPage.isSignInDisplayed(),"Sucessfully Logged Out");
	test.log(Status.PASS, "Test Step 4 : Sucessfully Logged Out");
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
	//test.pass("Verified");
	Thread.sleep(2000);
	System.out.println("Sucessfully Logged Out");
}
}