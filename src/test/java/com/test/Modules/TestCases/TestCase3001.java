package com.test.Modules.TestCases;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.methods.LoginPage;
import com.methods.MultipleTabPage;

@Test
public class TestCase3001 extends BaseTest{
	
	public TestCase3001()
	{
		super();
	}
	
	public void More_MultlipleTab() throws Exception
	{
		ExtentTest test= extent.createTest("More_MultlipleTab");
		test.log(Status.PASS, "User Launched Website : "+wd.getCurrentUrl());
		test.pass("Verified");
		
	LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));	
	Thread.sleep(3000);
	System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.log(Status.PASS, "The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
	test.pass("Verified");
	
	MultipleTabPage.openMoreOption();
	Thread.sleep(3000);
	MultipleTabPage.openMultipleTab();
	Thread.sleep(3000);
	String actual_1=MultipleTabPage.getPlantosuceedtext().toString();
	
	Assert.assertEquals(actual_1, actual_1, "Sucess");
	test.log(Status.PASS, "User is able to verify the text");
	test.pass("Verified");
	Thread.sleep(3000);
	
	MultipleTabPage.enterTextPlantoSuceed_1("AAAAA");
	Thread.sleep(3000);
	MultipleTabPage.enterTextPlantoSuceed_2("BBBBB");
	Thread.sleep(3000);
	
	MultipleTabPage.openUnLearningTab();
	Thread.sleep(3000);
	String actual_2=MultipleTabPage.getUnLearningtext().toString();
	
	Assert.assertEquals(actual_2, actual_2, "Sucess");
	test.log(Status.PASS, "User is able to verify the text");
	test.pass("Verified");
	Thread.sleep(3000);
	
	MultipleTabPage.enterTextUnLearning_1("AAAAA");
	Thread.sleep(3000);
	MultipleTabPage.enterTextUnLearning_2("BBBBB");
	Thread.sleep(3000);
	
	MultipleTabPage.openWaystoUnLearningTab();
	Thread.sleep(3000);
	String actual_3=MultipleTabPage.getUnLearningtext().toString();
	
	Assert.assertEquals(actual_3, actual_3, "Sucess");
	test.log(Status.PASS, "User is able to verify the text");
	test.pass("Verified");
	Thread.sleep(3000);
	
	MultipleTabPage.enterTextWaysToUnlearn_1("AAAAA");
	Thread.sleep(3000);
	MultipleTabPage.enterTextWaysToUnlearn_2("BBBBB");
	Thread.sleep(3000);	
	
	}

}
