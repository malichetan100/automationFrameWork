package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class FrameModulePageWeblocators extends BaseTest{
	
	protected static WebElement iframe()
	{
		return wd.findElement(By.linkText("iFrames"));
	}

	protected static Object scrollby(int amt)
	{
		JavascriptExecutor js = (JavascriptExecutor) wd;
		return js.executeScript("window.scrollBy(0,"+amt+")");
	}
	
	protected static WebElement iframeHeadLine()
	{
		return wd.findElement(By.xpath("//center[@class='pt_100']//h1"));
	}
	
	protected static WebElement iframeContentText(int num)
	{
		return wd.findElement(By.xpath("(//p//b)["+num+"]"));
	}
	
	protected static WebElement profile()
	{
		return wd.findElement(By.xpath("(//div[@class='pull-left info'])[1]"));
	}
	
	protected static WebElement headerpart()
	{
		return wd.findElement(By.xpath("(//ol[@class='breadcrumb m-r-xs'])[1]"));
	}
	
	
}
