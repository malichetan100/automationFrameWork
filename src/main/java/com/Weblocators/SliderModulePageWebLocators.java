package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class SliderModulePageWebLocators extends BaseTest{
	
	protected static WebElement slider()
	{
		return wd.findElement(By.linkText("Slider"));
	}
	
	protected static WebElement sliderPoint()
	{
		return wd.findElement(By.xpath("//div[@role='slider']"));
	}

}
