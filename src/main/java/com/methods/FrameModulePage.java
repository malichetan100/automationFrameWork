package com.methods;

import com.Weblocators.FrameModulePageWeblocators;

public class FrameModulePage extends FrameModulePageWeblocators{
	
	public static void openIFrame()
	{
		iframe().click();
	}

	public static void scrollByAmount(int amt)
	{
		scrollby(amt);
	}
	
	public static void switchToframe(String framename)
	{
		wd.switchTo().frame(framename);
	}
	
	public static String getIframeHeadLine()
	{
		return iframeHeadLine().getText();
	}
	
	public static String getIframeContentText(int num)
	{
		return iframeContentText(num).getText();
	}
	
	public static void switchToParent()
	{
		wd.switchTo().parentFrame();
	}
	
	public static boolean isFrameExited() 
	{
		return profile().isDisplayed() && headerpart().isDisplayed();
	}
	
}
