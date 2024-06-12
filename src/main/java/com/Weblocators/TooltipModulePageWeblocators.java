package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class TooltipModulePageWeblocators extends BaseTest{
	
	protected static WebElement tooltip()
	{
		return wd.findElement(By.linkText("Tooltips"));
	}
	
	protected static WebElement tooltipbtn()
	{
		return wd.findElement(By.xpath("//button[@id='btnTooltip']"));
	}
	
	protected static WebElement tooltipText()
	{
		return wd.findElement(By.xpath("//div[@class='tooltip fade bottom in']"));
	}

}