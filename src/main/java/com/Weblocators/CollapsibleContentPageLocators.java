package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class CollapsibleContentPageLocators extends BaseTest{
	
	protected static WebElement collapsibleContent()
	{
		return wd.findElement(By.linkText("Collapsible Content"));
	}
	
	protected static WebElement ontext(String text)
	{
		return wd.findElement(By.linkText(text));
	}
	
	protected static WebElement multipleCollapse()
	{
		return wd.findElement(By.linkText("Multiple Collapse"));
	}

	protected static WebElement collapseOne(String text)
	{
		return wd.findElement(By.xpath("//div[@id='collapse"+text+"']"));
	}
		
}
