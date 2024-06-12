package com.test.Modules.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.AutoCompletepage;
import com.methods.BaseTest;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class TestCase3003 extends BaseTest{
	
	public TestCase3003()
	{
		super();
	}
	
	@Test
	public void More_AutotoComplete() throws Exception
	{
		ExtentTest test= extent.createTest("More_AutotoComplete");
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
		
		AutoCompletepage.openAutoCompleteOption();
		Thread.sleep(3000);
		
		AutoCompletepage.enterSinglevalue("JavaScript");
		Thread.sleep(5000);
		
		AutoCompletepage.openMultipleValues();
		Thread.sleep(3000);
		
		AutoCompletepage.enterMultiplevalue("Java");
		Thread.sleep(3000);
		AutoCompletepage.enterMultiplevalue("JavaScript");
		Thread.sleep(3000);
	}

}
