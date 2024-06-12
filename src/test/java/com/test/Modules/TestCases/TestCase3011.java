package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.FrameModulePage;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class TestCase3011 extends BaseTest{
	
	public TestCase3011()
	{
		super();
	}

	@Test
	public void More_iFrame() throws Exception
	{
		ExtentTest test= extent.createTest("More_iFrame");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		FrameModulePage.openIFrame();
		Thread.sleep(3000);
		
		FrameModulePage.scrollByAmount(500);
		Thread.sleep(3000);
		
		FrameModulePage.switchToframe("iframe2");
		Thread.sleep(2000);
		
		String welcome_Text=FrameModulePage.getIframeHeadLine().toString();
		System.out.println("The Iframe Text is : "+welcome_Text);
		Assert.assertEquals(welcome_Text, welcome_Text,"Switched to frame sucessfully");
		test.log(Status.PASS, "Switched to frame 1 sucessfully");
		test.pass("Verified");
		
		FrameModulePage.scrollByAmount(600);
		
		String contentText1=FrameModulePage.getIframeContentText(1).toString();
		System.out.println("The Iframe Text is : "+contentText1);
		Assert.assertEquals(contentText1, contentText1,"Switched to frame sucessfully");
		
		test.log(Status.PASS, "Switched to frame 2 sucessfully");
		test.pass("Verified");
		
		String contentText2=FrameModulePage.getIframeContentText(2).toString();
		System.out.println("The Iframe Text is : "+contentText2);
		Assert.assertEquals(contentText2, contentText2,"Switched to frame sucessfully");
		
		test.log(Status.PASS, "Switched to frame 3 sucessfully");
		test.pass("Verified");
		
		FrameModulePage.switchToParent();
		
		Assert.assertTrue(FrameModulePage.isFrameExited(),"Parent Frame switched sucessfully");
		
		test.log(Status.PASS, "Parent Frame switched sucessfully");
		test.pass("Verified");
		
		Thread.sleep(3000);
		FrameModulePage.scrollByAmount(-500);
		Thread.sleep(3000);
		
	}
}
