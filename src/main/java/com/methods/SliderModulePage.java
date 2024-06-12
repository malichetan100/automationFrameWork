package com.methods;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.Weblocators.SliderModulePageWebLocators;

public class SliderModulePage extends SliderModulePageWebLocators{
	
	public static void openSlider()
	{
		slider().click();
	}
	
	public static void openMoveSlider()
	{
		Actions act= new Actions(wd);
		Action action = (Action) act.dragAndDropBy(sliderPoint(), 90, 0).build();
		action.perform();
		act.clickAndHold(sliderPoint()).moveByOffset(90, 0).build().perform();
	}
	

}
