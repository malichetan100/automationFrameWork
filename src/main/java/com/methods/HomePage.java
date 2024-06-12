package com.methods;

import com.Weblocators.Home_Page_Locators;

public class HomePage extends Home_Page_Locators{
	
	static CreatePage createPage;
	HomePage	homePgae;
	
	public void openHome()
	{
		homeButton().click();
	}
	
	public static void openEmployeeDropdown()
	{
		employeeDropdown().click();
	}
	
	public static CreatePage openCreateOption()
	{
		createOption().click();
		return createPage;
	}
	
	public static void openSearchOption()
	{
		searchOption().click();
	}
	
	

}
