package com.methods;

import com.Weblocators.CollapsibleContentPageLocators;

public class CollapsibleContentPage extends CollapsibleContentPageLocators{
	
	public static void openCollapsibleContent()
	{
		collapsibleContent().click();
	}
	
	public static void openTextContent(String text)
	{
		ontext(text).click();
	}
	
	public static void openMultipleCollapse()
	{
		multipleCollapse().click();
	}
	
	public static String getCollapseText(String text)
	{
		return collapseOne(text).getText();
	}
	

}
