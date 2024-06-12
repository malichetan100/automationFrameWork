package com.methods;

import java.util.Set;

import org.openqa.selenium.Alert;

import com.Weblocators.PopUpModulePageWeblocators;

public class PopUpModulePage extends PopUpModulePageWeblocators{
	
	static Alert alt=wd.switchTo().alert();
	static String parenHandle=wd.getWindowHandle();
	
	public static void openPopUps()
	{
		popup().click();
	}
	
	public static void openAlertBoxAccept()
	{
		alerBox().click();
		alt.accept();
	}
	
	public static void openConfirmBoxAccept()
	{
		confirmBox().click();
		alt.accept();
	}
	
	public static void openConfirmBoxCancel()
	{
		confirmBox().click();
		alt.dismiss();
	}
	
	public static void openPromptBox(String text)
	{
		promptBox().click();
		alt.sendKeys(text);
	}

	public static void handleWindow(String text) 
	{
		childwindow().click();
		Set<String> childHandles=wd.getWindowHandles();
		
		for (String childHandle : childHandles) 
		{
			System.out.println("The String value of child window is : "+childHandle);
			if(!childHandle.equals(parenHandle))
			{
				wd.switchTo().window(childHandle);
				
				wd.manage().window().maximize();
				
				child_Window_SearchText().sendKeys(text);
				
				child_Window_SearchText_1().click();
				
				child_Window_SearchText_2().click();
				
				wd.close();
			}
		}		
		wd.switchTo().window(parenHandle);
	}
	
	public static void handleDupliacteTab() 
	{
		duplicateTab().click();
		
		Set<String> tabs=wd.getWindowHandles();
		for (String childtab : tabs) {
			if(!childtab.equals(parenHandle))
			{
				wd.switchTo().window(childtab);
				
				duplicateTab_alertBox().click();
				alt.accept();
				
				wd.close();
			}
			
		}
		wd.switchTo().window(parenHandle);
	}	
}
	

