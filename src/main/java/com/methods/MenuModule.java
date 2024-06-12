package com.methods;

import org.openqa.selenium.interactions.Actions;

import com.Weblocators.MenuModuleLocators;

public class MenuModule extends MenuModuleLocators{

	public static void openMoreOption()
	{
		more().click();
	}
	
	public static void openMenuOption()
	{
		menu().click();
	}
	
	public static void selectSkill(String skill)
	{
		menuOption(skill).click();
	}
	
	public static String getselectedSkillText()
	{
		return selectedSkillText().getText();
	}
	
	public static void openSubMenusOption()
	{
		subMenus().click();
	}
	
	public static void selectSubSkill(String skill1, String skill2)
	{
		Actions act=new Actions(wd);
		act.doubleClick();
		
	}
}
