package com.ExcelTestcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.methods.BaseTest;
import com.methods.CreatePage;
import com.methods.HomePage;
import com.methods.LoginPage;

public class TestCase4001 extends BaseTest{
	public TestCase4001()
	{
		super();
	}
	
	@Test
	public void Read_Tesdata_From_Excel() throws Exception
	{
		ExtentTest test= extent.createTest("Read_Tesdata_From_Excel");
		test.log(Status.PASS, "Test Step 1: User Launched Website : "+wd.getCurrentUrl());
		//test.pass("Verified");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		Thread.sleep(5000);
		Assert.assertTrue(LoginPage.isSignInDisplayed(),"The SignIn Page is Displayed");
		Thread.sleep(2000);
		test.log(Status.PASS, "Test Step 2: The SignIn Page is Displayed");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass("Verified");
		System.out.println("The LoginPage is displayed");
		
		LoginPage.loginToApplication(prop.getProperty("username"),prop.getProperty("password"));
		//LoginPage.loginToApplication("training@jalaacademy.com", "jobprogram");
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		System.out.println("The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		
		test.log(Status.PASS, "Test Step 3: The User is sucessfully Logged In and title of the page is : "+wd.getTitle());
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		//test.pass("Verified");
	
		
		FileInputStream fp=new FileInputStream("C:\\Users\\HP\\Desktop\\JALA\\JALA_Selenium_Framework\\src\\test\\resources\\Jala Academy.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fp);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		int coloumnCount=sheet.getRow(1).getLastCellNum();
		
		System.out.println("The row count is : "+rowCount);
		System.out.println("The coloumn count is : "+coloumnCount);
		
		for(int i=1;i<=rowCount;i++)
		{
			HomePage.openEmployeeDropdown();
			Thread.sleep(2000);
			HomePage.openCreateOption();
			Thread.sleep(2000);
			
			XSSFRow cellData=sheet.getRow(i);
			
			String firstName=cellData.getCell(0).getStringCellValue().toString();
			String lastName=cellData.getCell(1).getStringCellValue().toString();
			String email=cellData.getCell(2).getStringCellValue().toString();
			//String mobileno=cellData.getCell(3).getStringCellValue();
			//String dob=cellData.getCell(4).getStringCellValue();
			String gender=cellData.getCell(4).getStringCellValue().toString();
			String country=cellData.getCell(5).getStringCellValue().toString();
			String city=cellData.getCell(6).getStringCellValue().toString();
			//String skill=cellData.getCell(8).getStringCellValue();
			
			CreatePage.registerAStudent(firstName, lastName, email,"7204330225",gender);
			Thread.sleep(3000);
			CreatePage.selectCountry(country);
			Thread.sleep(3000);
			CreatePage.selectCity(city);
			Thread.sleep(3000);
			
			CreatePage.openSave();
			
			Thread.sleep(7000);
			
			Assert.assertTrue(CreatePage.isSearchGridDisplyaed(), "The Record is successFully Added");
			test.log(Status.PASS, "Test Step 4 : The Record is successFully Added");
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
			//test.pass("Verified");
			System.out.println("The Record is successFully Added");
		}
		
	}

}
