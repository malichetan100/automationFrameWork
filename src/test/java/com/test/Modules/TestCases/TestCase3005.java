package com.test.Modules.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.ImageModulePage;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

public class TestCase3005 extends BaseTest{
	
	public TestCase3005()
	{
		super();
	}

	@Test
	public void More_Images() throws Exception
	{
		ExtentTest test= extent.createTest("More_Images");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
	
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		ImageModulePage.openImages();
		Thread.sleep(3000);
		
		ImageModulePage.uploadImage();
		Thread.sleep(3000);
		
		ImageModulePage.enterFilename("Photofile");
		Thread.sleep(3000);
		
		ImageModulePage.openUploadBtn();
		Thread.sleep(8000);
		Assert.assertTrue(ImageModulePage.isImageUploadSucessmsgDisplayed(), "Image uploaded sucessfully");
		Thread.sleep(3000);
		test.log(Status.PASS, "Image uploaded sucessfully");
		test.pass("Verified");
		
		ImageModulePage.openCloaseMessage();
		Thread.sleep(3000);
		ImageModulePage.openDeleteImage();
		Thread.sleep(8000);
		Assert.assertTrue(ImageModulePage.isImageDeleted(), "Image deleted sucessfully");
		test.log(Status.PASS, "Image deleted sucessfully");
		test.pass("Verified");
	}
}
