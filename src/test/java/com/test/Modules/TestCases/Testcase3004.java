package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CollapsibleContentPage;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class Testcase3004 extends BaseTest{
	
	public Testcase3004()
	{
		super();
	}

	@Test
	public void More_Coolapse_content() throws Exception
	{
		ExtentTest test= extent.createTest("More_Coolapse_content");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		CollapsibleContentPage.openCollapsibleContent();
		Thread.sleep(3000);
		
		CollapsibleContentPage.openTextContent("Know your goals and Prioritize Wisely");
		Thread.sleep(3000);
		String actual_1=CollapsibleContentPage.getCollapseText("One").toString();
		Assert.assertEquals(actual_1, actual_1,"Sucess");
		Thread.sleep(3000);
		test.log(Status.PASS, "User is able to verify the text");
		test.pass("Verified");
		
		CollapsibleContentPage.openTextContent("Be focused and Eliminate Distractions");
		Thread.sleep(3000);
		String actual_2=CollapsibleContentPage.getCollapseText("Two").toString();
		Assert.assertEquals(actual_2, actual_2,"Sucess");
		Thread.sleep(3000);
		test.log(Status.PASS, "User is able to verify the text");
		test.pass("Verified");
		
		CollapsibleContentPage.openMultipleCollapse();
		Thread.sleep(3000); 
    
		CollapsibleContentPage.openTextContent("Collaborate with Colleagues");
		Thread.sleep(3000);
		String actual_3=CollapsibleContentPage.getCollapseText("Four").toString();
		Assert.assertEquals(actual_3, actual_3,"Sucess");
		Thread.sleep(3000);
		test.log(Status.PASS, "User is able to verify the text");
		test.pass("Verified");
		
		CollapsibleContentPage.openTextContent("Collaborate with Colleagues");
		Thread.sleep(3000);
		
		CollapsibleContentPage.openTextContent("Learn Anything Quickly");
		Thread.sleep(3000);
		String actual_4=CollapsibleContentPage.getCollapseText("Five").toString();
		Assert.assertEquals(actual_4, actual_4,"Sucess");
		test.log(Status.PASS, "User is able to verify the text");
		test.pass("Verified");
		
		Thread.sleep(3000);
		CollapsibleContentPage.openTextContent("Learn Anything Quickly");
		Thread.sleep(3000);
        
    
	}
}




