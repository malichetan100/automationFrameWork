package com.test.Modules.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;
import com.methods.SliderModulePage;

public class TestCase3006 extends BaseTest{
	public TestCase3006()
	{
		super();
	}
	
	@Test
	public void More_Slider() throws Exception
	{
		ExtentTest test= extent.createTest("More_Slider");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		SliderModulePage.openSlider();
		Thread.sleep(3000);
		
		SliderModulePage.openMoveSlider();
	}

}
