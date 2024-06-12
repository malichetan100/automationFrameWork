package com.Weblocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.methods.BaseTest;

public class CreatePage_Weblocators extends BaseTest{
	
	protected static WebElement firstname()
	{
		return wd.findElement(By.id("FirstName"));
	}
	
	protected static WebElement lastname()
	{
		return wd.findElement(By.id("LastName"));
	}
	
	protected static WebElement emailId()
	{
		return wd.findElement(By.id("EmailId"));
	}
	
	protected static WebElement mobileNumber()
	{
		return wd.findElement(By.id("MobileNo"));
	}
	
	protected static WebElement selectMaleOrFemale(String gender)
	{
		return wd.findElement(By.xpath("//input[@value='"+gender+"']"));
	}
	
	protected static WebElement save()
	{
		return wd.findElement(By.xpath("//button[text()='Save']"));
	}
	
	protected static WebElement cancel()
	{
		return wd.findElement(By.xpath("//a[text()='Cancel']"));
	}
	
	protected static WebElement serachEmployee()
	{
		return wd.findElement(By.xpath("//button[text()='Search']"));
	}
	
	protected static WebElement searchEmployeeText()
	{
		return wd.findElement(By.xpath("//h3[text()='Search Employee']"));
	}
	
	protected static WebElement name()
	{
		return wd.findElement(By.xpath("//input[@id='Name']"));
	}
	
	protected static WebElement clear()
	{
		return wd.findElement(By.xpath("//button[text()='Clear']"));
	}
	
	protected static WebElement mobileNo()
	{
		return wd.findElement(By.xpath("//input[@id='MobileNo']"));
	}
	
	protected static WebElement skills(int skill)
	{
		return wd.findElement(By.xpath("//input[@id='chkSkill_"+skill+"']"));
	}
	
	protected static WebElement country()
	{
		return wd.findElement(By.xpath("//select[@id='CountryId']"));
	}
	
	protected static WebElement city()
	{
		return wd.findElement(By.xpath("//select[@id='CityId']"));
	}
	
	protected static WebElement otherCity()
	{
		return wd.findElement(By.xpath("//label[@class='container1']"));
	}
	
	protected static WebElement enterOthercity()
	{
		return wd.findElement(By.xpath("//input[@id='OtherCity']"));
	}
	
	
	
}
