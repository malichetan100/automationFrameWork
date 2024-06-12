package com.LoginPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;

public class TestCase1003 extends BaseTest{
	
	public TestCase1003()
	{
		super();
	}
	
	@Test
	public void Login_Page_Admin_Page() throws Exception
	{
		ExtentTest test= extent.createTest("Login_Page_Admin_Page");
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
		
		LoginPage.openAdminLogin();
		Thread.sleep(2000);
		LoginPage.adminLogin("training@jalaacademy.com", "jobprogram");
		Thread.sleep(2000);
		LoginPage.openLoginButton();
		Thread.sleep(2000);
		
		if(LoginPage.isadminCredentialAlertDisplayed())
		{
			Assert.assertTrue(LoginPage.isadminCredentialAlertDisplayed(),"The User Id or password is not correct, "
					+ "Please enter valid user id and password");
			test.log(Status.PASS, "Test Step 3 : The User Id or password is not correct, "
					+ " Please enter valid user id and password");
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
			//test.pass("Verified");
			System.out.println("Sucessfully entered the credentials");
		}
		LoginPage.openBackbutton();
		
	}

}
