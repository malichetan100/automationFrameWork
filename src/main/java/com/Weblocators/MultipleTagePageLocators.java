package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class MultipleTagePageLocators extends BaseTest{

	protected WebElement more()
	{
		return wd.findElement(By.linkText("More"));
	}
	
	protected WebElement multipleTab()
	{
		return wd.findElement(By.linkText("Multiple Tabs"));
	}

	protected WebElement plantosuceedtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_1']"));
	}
	
	protected WebElement unLearning()
	{
		return wd.findElement(By.linkText("UnLearning"));
	}
	
	protected WebElement waystoUnLearning()
	{
		return wd.findElement(By.linkText("Ways of Unlearning"));
	}
	
	protected WebElement unLearningtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_2']"));
	}
	
	protected WebElement waystoUnLearningtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_3']"));
	}
} 
	
	
