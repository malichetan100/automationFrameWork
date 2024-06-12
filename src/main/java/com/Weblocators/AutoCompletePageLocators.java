package com.Weblocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class AutoCompletePageLocators extends BaseTest{
	
	protected static WebElement autocomplte()
	{
		return wd.findElement(By.linkText("Autocomplete"));
	}
	
	protected static WebElement singleValue()
	{
		return wd.findElement(By.xpath("//input[@id='txtSingleAutoComplete']"));
	}
	
	protected static List<WebElement> selectSingleValue()
	{
	 List<WebElement> options=wd.findElements(By.xpath("//ul[@id='ui-id-1']//li[@class='ui-menu-item']"));
	 return options;
	}
	
	protected static WebElement multipleValuesoption()
	{
		return wd.findElement(By.linkText("Multiple Values"));
	}
	
	protected static WebElement multipleValues()
	{
		return wd.findElement(By.xpath("//input[@id='txtMultipleAutoComplete']"));
	}
	
	protected static List<WebElement> selectMultipleValues()
	{
	 List<WebElement> options=wd.findElements(By.xpath("//ul[@id='ui-id-2']//li[@class='ui-menu-item']"));
	 return options;
	}
	
	
	
}
