package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;
import com.methods.MenuModule;
import com.methods.MultipleTabPage;

public class TestCase3002 extends BaseTest{
	
	public TestCase3002()
	{
		super();
	}
	
	@Test
	public void More_Menu() throws Exception
	{
		ExtentTest test= extent.createTest("More_Menu");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		Thread.sleep(3000);
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		MenuModule.openMenuOption();
		Thread.sleep(3000);
		
		MenuModule.selectSkill("Java");
		String actual= MenuModule.getselectedSkillText().toString();
		
		Assert.assertEquals(actual, "You Have Selected Java Menu Option.","Sucess");
		Thread.sleep(3000);
		test.log(Status.PASS, "You Have Selected Java Menu Option.");
		test.pass("Verified");
		
		MenuModule.openSubMenusOption();
		Thread.sleep(3000);
		
	}

}
