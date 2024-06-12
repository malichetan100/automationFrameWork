package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class MultipleTabPageLocators extends BaseTest{

	protected static WebElement more()
	{
		return wd.findElement(By.linkText("More"));
	}
	
	protected static WebElement multipleTab()
	{
		return wd.findElement(By.linkText("Multiple Tabs"));
	}

	protected static WebElement plantosuceedtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_1']"));
	}
	
	protected static WebElement unLearning()
	{
		return wd.findElement(By.linkText("UnLearning"));
	}
	
	protected static WebElement waystoUnLearning()
	{
		return wd.findElement(By.linkText("Ways of Unlearning"));
	}
	
	protected static WebElement unLearningtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_2']"));
	}
	
	protected static WebElement waystoUnLearningtext()
	{
		return wd.findElement(By.xpath("//div[@id='tab_3']"));
	}
	
	protected static WebElement planToSuceedTextbox_1()
	{
		return wd.findElement(By.xpath("//input[@id='textbox1']"));
	}
	protected static WebElement planToSuceedTextbox_2()
	{
		return wd.findElement(By.xpath("//input[@id='textbox2']"));
	}
	
	protected static WebElement unLearningtextbox_1()
	{
		return wd.findElement(By.xpath("//input[@id='textbox3']"));
	}
	
	protected static WebElement unLearningtextbox_2()
	{
		return wd.findElement(By.xpath("//input[@id='textbox4']"));
	}
	
	protected static WebElement waysToUnlearningTextBox_1()
	{
		return wd.findElement(By.xpath("//input[@id='textbox5']"));
	}
	
	protected static WebElement waysToUnlearningTextBox_2()
	{
		return wd.findElement(By.xpath("//input[@id='textbox6']"));
	}
	
	
	
} 
	
	
