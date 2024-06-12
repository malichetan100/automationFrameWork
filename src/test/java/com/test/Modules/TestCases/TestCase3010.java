package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CSSPropertiesModulePage;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class TestCase3010 extends BaseTest{
	public TestCase3010()
	{
		super();
	}
	
	@Test
	public void More_CSS_Properties() throws Exception
	{
		ExtentTest test= extent.createTest("More_CSS_Properties");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		CSSPropertiesModulePage.openCssProperties();
		Thread.sleep(3000);
		
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfLinks(2));
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfLinks(3));
		String Acual1=CSSPropertiesModulePage.getCSSValueOfLinks(2);
		String Acual2=CSSPropertiesModulePage.getCSSValueOfLinks(3);
		
		Assert.assertEquals(Acual1, Acual1,"Sucess");
		test.log(Status.PASS, "CSS Properties 1 verfied sucessfully");
		test.pass("Verified");
		Assert.assertEquals(Acual2, Acual2,"Sucess");
		test.log(Status.PASS, "CSS Properties 2 verfied sucessfully");
		test.pass("Verified");
		
		Thread.sleep(3000);
		CSSPropertiesModulePage.openCssPropertiesTab("Labels");
		Thread.sleep(3000);
		
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfLabels("Primary"));
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfLabels("Success"));
		
		String Acual3=CSSPropertiesModulePage.getCSSValueOfLabels("Primary");
		String Acual4=CSSPropertiesModulePage.getCSSValueOfLabels("Success");
		
		Assert.assertEquals(Acual3, Acual3,"Sucess");
		test.log(Status.PASS, "CSS Properties 3 verfied sucessfully");
		test.pass("Verified");
		Assert.assertEquals(Acual4, Acual4,"Sucess");
		test.log(Status.PASS, "CSS Properties 4 verfied sucessfully");
		test.pass("Verified");
		
		Thread.sleep(3000);
		CSSPropertiesModulePage.openCssPropertiesTab("Buttons");
		Thread.sleep(3000);
		
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfButton("Warning"));
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfButton("Danger"));
		
		String Acual5=CSSPropertiesModulePage.getCSSValueOfButton("Warning");
		String Acual6=CSSPropertiesModulePage.getCSSValueOfButton("Danger");
		
		Assert.assertEquals(Acual5, Acual5,"Sucess");
		test.log(Status.PASS, "CSS Properties 5 verfied sucessfully");
		test.pass("Verified");
		Assert.assertEquals(Acual6, Acual6,"Sucess");
		test.log(Status.PASS, "CSS Properties 6 verfied sucessfully");
		test.pass("Verified");
		
		Thread.sleep(3000);
		CSSPropertiesModulePage.openCssPropertiesTab("Alerts");
		Thread.sleep(3000);
		
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfAlert(2));
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfAlert(3));
		
		String Acual7=CSSPropertiesModulePage.getCSSValueOfAlert(2);
		String Acual8=CSSPropertiesModulePage.getCSSValueOfAlert(3);
		
		Assert.assertEquals(Acual7, Acual7,"Sucess");
		test.log(Status.PASS, "CSS Properties 7 verfied sucessfully");
		test.pass("Verified");
		Assert.assertEquals(Acual8, Acual8,"Sucess");
		test.log(Status.PASS, "CSS Properties 8 verfied sucessfully");
		test.pass("Verified");
		
		Thread.sleep(3000);
		CSSPropertiesModulePage.openCssPropertiesTab("Progress Bars");
		Thread.sleep(3000);
		
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfProgressBar(3));
		System.out.println("The back ground color is "+CSSPropertiesModulePage.getCSSValueOfProgressBar(4));
		
		String Acual9=CSSPropertiesModulePage.getCSSValueOfProgressBar(3);
		String Acual10=CSSPropertiesModulePage.getCSSValueOfProgressBar(4);
		
		Assert.assertEquals(Acual9, Acual9,"Sucess");
		test.log(Status.PASS, "CSS Properties 9 verfied sucessfully");
		test.pass("Verified");
		Assert.assertEquals(Acual10, Acual10,"Sucess");
		test.log(Status.PASS, "CSS Properties 10 verfied sucessfully");
		test.pass("Verified");
	}

}
