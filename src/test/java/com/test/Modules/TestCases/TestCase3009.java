package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LinksModulePage;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class TestCase3009 extends BaseTest{
	public TestCase3009()
	{
		super();
	}
	
	@Test
	public void More_Links() throws Exception
	{
		ExtentTest test= extent.createTest("More_Links");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		LinksModulePage.openLinks();
		Thread.sleep(3000);
		
		LinksModulePage.OpenMultiple_links("Link 1");
		
		LinksModulePage.windowSwitch(1);
		
		String Actual="https://www.workinglinks.co.uk/";
		String exepected=wd.getCurrentUrl();
		System.out.println(exepected);
		Assert.assertEquals(Actual, exepected, "Link 1 Working");
		test.log(Status.PASS, "Link 1 Working");
		test.pass("Verified");
		
		Thread.sleep(3000);
		wd.close();
		Thread.sleep(3000);
		LinksModulePage.windowSwitch(0);
		
		Thread.sleep(3000);
		
		LinksModulePage.OpenMultiple_links("Link 2");
		
		LinksModulePage.windowSwitch(1);
		
		String Actual_1="https://www.google.co.in/";
		String exepected_1=wd.getCurrentUrl();
		System.out.println(exepected);
		Assert.assertEquals(Actual_1, exepected_1, "Link 2 Working");
		test.log(Status.PASS, "Link 2 Working");
		test.pass("Verified");
		Thread.sleep(3000);
		wd.close();
		
		Thread.sleep(3000);
		LinksModulePage.windowSwitch(0);
		
		Thread.sleep(3000);
		
		LinksModulePage.OpenMultiple_links("Link 3");
		
		LinksModulePage.windowSwitch(1);
		
		String Actual_2="https://jalatechnologies.com/";
		String exepected_2=wd.getCurrentUrl();
		System.out.println(exepected);
		Assert.assertEquals(Actual_2, exepected_2, "Link 3 Working");
		test.log(Status.PASS, "Link 3 Working");
		test.pass("Verified");
		Thread.sleep(3000);
		wd.close();
		Thread.sleep(3000);
		LinksModulePage.windowSwitch(0);	
		
		LinksModulePage.openLinksTab("Broken Links");
		Thread.sleep(3000);
		LinksModulePage.openLinksTab("Image Links");
		Thread.sleep(3000);
		LinksModulePage.openLinksTab("Status Codes");
		Thread.sleep(3000);
		LinksModulePage.openLinksTab("Working Links");

		
		
		
		
	}

}
