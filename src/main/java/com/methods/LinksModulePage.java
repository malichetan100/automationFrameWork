package com.methods;

import com.Weblocators.LinksModulePageWeblocators;

public class LinksModulePage extends LinksModulePageWeblocators{
	
	public static void openLinks()
	{ 
		links().click();
	}
	
	public static void openLinksTab(String text)
	{
		linksTab(text).click();
	}
	
	public static void OpenMultiple_links(String text)
	{
		multiple_links(text).click();
	}
	
	public static void windowSwitch(int num)
	{
		wd.switchTo().window(windows().get(num));
	}

}



