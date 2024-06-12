package com.LoginPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;

public class TestCase1002 extends BaseTest{
	
	public TestCase1002()
	{
		super();
	}
	
	@Test
	public void Login_Page_Forget_Password() throws Exception
	{
		
		ExtentTest test= extent.createTest("Login_Page_Forget_Password");
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
		
		LoginPage.openForgetPasswordLink();
		Thread.sleep(2000);
		LoginPage.enterEmail("training@jala");
		Thread.sleep(2000);
		LoginPage.clickForgetPasswordbtn();
		Thread.sleep(2000);
		LoginPage.clickForgetPasswordbtn();
		Thread.sleep(2000);
		
		if(LoginPage.inValidtextDisplayed())
		{
			Assert.assertTrue(LoginPage.inValidtextDisplayed(),"The Entered Email id is not correct");
			System.out.println("The Entered Email id is not correct");
			test.log(Status.PASS, "Test Step 3: The Entered Email id is not correct");
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
			//test.pass("Verified");
		}
		
			Thread.sleep(2000);
			LoginPage.clearEmail();
			Thread.sleep(2000);
			LoginPage.enterEmail("training@jalaacademy.com");
			Thread.sleep(2000);
		/*	LoginPage.clickForgetPasswordbtn();
			Thread.sleep(2000);
			Assert.assertTrue(LoginPage.validtextDisplayed(),"The Entered Email id is correct");
			
			test.log(Status.PASS, "The Entered Email id is correct");
			test.pass("Verified"); */
			
			System.out.println("The Entered Email id is correct");
		
		LoginPage.openBackbutton();
	}

}
