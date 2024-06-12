package com.LoginPage.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;


public class TestCase1001 extends BaseTest{
	
	public TestCase1001()
	{
		super();
	}
	
	@Test
	public void Login_Page_1() throws Exception
	{
		ExtentTest test= extent.createTest("Login_Page_1");
		test.log(Status.PASS, "Test Step 1: User Launched Website");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass("Verified");
		Thread.sleep(10000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		Thread.sleep(2000);
		test.log(Status.PASS, "Test Step 2: The SignIn Page is Displayed");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass("Verified");
		System.out.println("The LoginPage is displayed");
	}

}
