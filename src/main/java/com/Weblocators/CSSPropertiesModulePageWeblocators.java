package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class CSSPropertiesModulePageWeblocators extends BaseTest{

	public static WebElement cssProperties()
	{
		return wd.findElement(By.linkText("CSS Properties"));
	}
	
	public static WebElement cssPropertiestabs(String text)
	{
		return wd.findElement(By.linkText(text));
	}
	
	public static WebElement linkoption(int num)
	{
		return wd.findElement(By.xpath("//div[@id='tab_1']//div//a["+num+"]"));
	}
	
	public static WebElement labeloption(String text)
	{
		return wd.findElement(By.xpath("//span[text()='"+text+"']"));
	}
	
	public static WebElement buttonoption(String text)
	{
		return wd.findElement(By.xpath("//button[text()='"+text+"']"));
	}
	
	public static WebElement alertoption(int num)
	{
		return wd.findElement(By.xpath("//div[@id='tab_4']//div["+num+"]"));
	}
	
	public static WebElement progressBaroption(int num)
	{
		return wd.findElement(By.xpath("//div[@id='tab_5']//div["+num+"]"));
	}
	
}
