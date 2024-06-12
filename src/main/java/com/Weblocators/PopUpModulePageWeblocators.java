package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class PopUpModulePageWeblocators extends BaseTest{
	
	protected static WebElement popup()
	{
		return wd.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[8]/a/text()"));
		//return wd.findElement(By.partialLinkText("Pop"));
	}
	protected static WebElement alerBox()
	{
		return wd.findElement(By.id("alertBox"));
	}
	
	protected static WebElement confirmBox()
	{
		return wd.findElement(By.id("confirmBox"));
	}
	
	protected static WebElement promptBox()
	{
		return wd.findElement(By.id("promptBtn"));
	}
	
	protected static WebElement childwindow()
	{
		return wd.findElement(By.id("btn-one"));
	}
	
	protected static WebElement child_Window_SearchText()
	{
		return wd.findElement(By.id("APjFqb"));
	}
	
	protected static WebElement child_Window_SearchText_1()
	{
		return wd.findElement(By.xpath("(//img[@alt='Google'])"));
	}
	
	protected static WebElement child_Window_SearchText_2()
	{
		return wd.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	}
	
	protected static WebElement duplicateTab()
	{
		return wd.findElement(By.id("btn-five"));
	}
	
	protected static WebElement duplicateTab_alertBox()
	{
		return wd.findElement(By.id("alertBox"));
	}
	
}