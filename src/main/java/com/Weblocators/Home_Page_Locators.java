package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class Home_Page_Locators extends BaseTest {
	
	protected static WebElement homeButton()
	{
		return wd.findElement(By.linkText("Home"));
	}

	protected static WebElement employeeDropdown()
	{
		return wd.findElement(By.className("treeview"));
	}
	
	protected static WebElement createOption()
	{
		return wd.findElement(By.linkText("Create"));
	}
	
	protected static WebElement searchOption()
	{
		return wd.findElement(By.linkText("Search"));
	}
	
	
}
