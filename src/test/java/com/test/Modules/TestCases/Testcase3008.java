package com.test.Modules.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;
import com.methods.PopUpModulePage;

public class Testcase3008 extends BaseTest{
	
	public Testcase3008()
	{
		super();
	}
	
	@Test (alwaysRun = true)
	public void More_Alerts_PopUps() throws Exception
	{
		ExtentTest test= extent.createTest("More_Alerts_PopUps");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
		Thread.sleep(3000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass("Verified");
		
		MultipleTabPage.openMoreOption();
		Thread.sleep(3000);
		
		PopUpModulePage.openPopUps();
		Thread.sleep(3000);
		
		PopUpModulePage.openAlertBoxAccept();
		Thread.sleep(3000);
		
		PopUpModulePage.openConfirmBoxAccept();
		Thread.sleep(3000);
		
		PopUpModulePage.openConfirmBoxCancel();
		Thread.sleep(3000);
		
		PopUpModulePage.openPromptBox("Chetan");
		Thread.sleep(3000);
		
		PopUpModulePage.handleWindow("Chetan Mali");
		Thread.sleep(3000);
		
		PopUpModulePage.handleDupliacteTab();
	}
}
