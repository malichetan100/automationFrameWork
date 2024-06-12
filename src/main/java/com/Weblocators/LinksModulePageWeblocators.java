package com.Weblocators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class LinksModulePageWeblocators extends BaseTest{
	
	protected static WebElement links()
	{
		return wd.findElement(By.linkText("Links"));
	}
	
	protected static WebElement linksTab(String text)
	{
		return wd.findElement(By.linkText(text));
	}
	
	protected static WebElement multiple_links(String text)
	{
		return wd.findElement(By.linkText(text));
	}
	
	protected static ArrayList<String> windows()
	{
	ArrayList<String> options=new ArrayList<String>(wd.getWindowHandles());
	return options;
	}
	
}


