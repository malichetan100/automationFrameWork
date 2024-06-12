package com.DataProvider.TestCase;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.methods.BaseTest;
import com.methods.LoginPage;

public class TestCase5001 extends BaseTest{
	
	public TestCase5001()
	{
		super();
	}
	
	@Test(dataProvider = "testData", dataProviderClass = DataProvider_1.class)
	public void TestCase_On_DataProvider(String userName, String Password) throws Exception
	{
		ExtentTest test= extent.createTest("TestCase_On_DataProvider");
		test.log(Status.PASS, " Test Step 1 : User Launched Website");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass( MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()));
		
		Thread.sleep(3000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		test.log(Status.PASS, "Test Step 2 : The SignIn Page is Displayed");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		
		Thread.sleep(2000);
		System.out.println("The LoginPage is displayed");
		
		LoginPage.loginToApplication(userName,Password);
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, " Test Step 3 : The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		
		
		//test.addScreenCaptureFromPath(captureScreenshot());
	}
	
	

}
