package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;
import com.methods.TooltipModulePage;

public class TestCase3007 extends BaseTest{
	public TestCase3007()
	{
		super();
	}
	
	@Test
	public  void More_Tootip() throws Exception
	{
		ExtentTest test= extent.createTest("More_Tootip");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		TooltipModulePage.openToolTip();
		Thread.sleep(3000);
		
		TooltipModulePage.hoverOnToolTipBtn();
		Thread.sleep(3000);
		
		String Actual_String= TooltipModulePage.getTooltipText().toString();
		System.out.println(Actual_String);
		
		Assert.assertEquals(Actual_String, Actual_String,"Tooltip is displayed");
		test.log(Status.PASS, "Tooltip is Verified sucessfully");
		test.pass("Verified");
	}

}
