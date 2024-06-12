package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class MenuModuleLocators extends BaseTest{
	
	protected static WebElement more()
	{
		return wd.findElement(By.linkText("More"));
	}
	
	protected static WebElement menu()
	{
		return wd.findElement(By.linkText("Menu"));
	}
	
	protected static WebElement menuOption(String skill)
	{
		return wd.findElement(By.linkText(skill));
	}
	
	protected static WebElement selectedSkillText()
	{
		return wd.findElement(By.xpath("//span[@id='label']"));
	}
	
	protected static WebElement subMenus()
	{
		return wd.findElement(By.linkText("Sub Menus"));
	}

}
