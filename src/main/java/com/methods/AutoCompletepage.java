package com.methods;

import org.openqa.selenium.WebElement;

import com.Weblocators.AutoCompletePageLocators;

public class AutoCompletepage extends AutoCompletePageLocators{

	public static void openAutoCompleteOption()
	{
		autocomplte().click();
	}
	
	public static void enterSinglevalue(String text)
	{
		singleValue().click();
		singleValue().sendKeys(text);
		//selectSingleValue(num).click();
		
		for (WebElement b : selectSingleValue()) {
			
			String element_Text=b.getText();
			System.out.println("The Elment text is : "+element_Text);
			
			if(element_Text.equalsIgnoreCase(text))
			{
				b.click();
			}
		
	}
	}	
	
	public static void openMultipleValues()
	{
		multipleValuesoption().click();
	}
	
	public static void enterMultiplevalue(String text)
	{
		multipleValues().click();
		multipleValues().sendKeys(text);
		//selectSingleValue(num).click();
		
		for (WebElement b : selectMultipleValues()) {
			
			String element_Text=b.getText();
			System.out.println("The Elment text is : "+element_Text);
			
			if(element_Text.equalsIgnoreCase(text))
			{
				b.click();
			}
		
	}
	}
	
	

}




