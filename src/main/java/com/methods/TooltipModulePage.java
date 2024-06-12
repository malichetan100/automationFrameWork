package com.methods;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.Weblocators.TooltipModulePageWeblocators;

public class TooltipModulePage extends TooltipModulePageWeblocators{
	
	static Actions act=new Actions(wd);
	
	public static void openToolTip()
	{
		tooltip().click();
	}
	
	public static void hoverOnToolTipBtn()
	{
		Action move_On_tooltips=act.moveToElement(tooltipbtn()).build();
		move_On_tooltips.perform();
	}

	public static String getTooltipText()
	{
		return tooltipText().getText();
	}
}






  