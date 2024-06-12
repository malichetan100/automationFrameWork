package com.methods;


import com.Weblocators.CSSPropertiesModulePageWeblocators;

public class CSSPropertiesModulePage extends CSSPropertiesModulePageWeblocators{
	
	public static void openCssProperties()
	{
		cssProperties().click();
	}
	
	public static void openCssPropertiesTab(String text)
	{
		cssPropertiestabs(text).click();
	}
	
	public static String getCSSValueOfLinks(int num)
	{
		return linkoption(num).getCssValue("background-color");
	}
	
	public static String getCSSValueOfLabels(String text)
	{
		return labeloption(text).getCssValue("background-color");
	}
	
	public static String getCSSValueOfButton(String text)
	{
		return buttonoption(text).getCssValue("background-color");
	}
	
	public static String getCSSValueOfAlert(int num)
	{
		return alertoption(num).getCssValue("background-color");
	}
	
	public static String getCSSValueOfProgressBar(int num)
	{
		return progressBaroption(num).getCssValue("background-color");
	}
}