package com.methods;

import com.Weblocators.MultipleTabPageLocators;

public class MultipleTabPage extends MultipleTabPageLocators{
	
	//MultipleTabPage multipletabpage;
	
	public static void openMoreOption()
	{
		more().click();
		//return multipletabpage;
	}
	
	public static void openMultipleTab()
	{
		multipleTab().click();
		//return multipletabpage;
	}
	
	public static String getPlantosuceedtext()
	{
	  return plantosuceedtext().getText();
		//return multipletabpage;
	}
	
	public static void openUnLearningTab()
	{
		unLearning().click();
		//return multipletabpage;
	}
	
	public static void openWaystoUnLearningTab()
	{
		waystoUnLearning().click();
		//return multipletabpage;
	}
	
	public static String getUnLearningtext()
	{
	  return plantosuceedtext().getText();
	}
	
	public static String getWaystoUnLearningtext()
	{
	  return	plantosuceedtext().getText();
	}
	
	public static void enterTextPlantoSuceed_1(String text)
	{
		planToSuceedTextbox_1().click();
		planToSuceedTextbox_1().sendKeys(text);
	}
	
	public static void enterTextPlantoSuceed_2(String text)
	{
		planToSuceedTextbox_2().click();
		planToSuceedTextbox_2().sendKeys(text);
	}

	public static void enterTextUnLearning_1(String text)
	{
		unLearningtextbox_1().click();
		unLearningtextbox_1().sendKeys(text);
	}
	
	public static void enterTextUnLearning_2(String text)
	{
		unLearningtextbox_2().click();
		unLearningtextbox_2().sendKeys(text);
	}
	
	public static void enterTextWaysToUnlearn_1(String text)
	{
		waysToUnlearningTextBox_1().click();
		waysToUnlearningTextBox_1().sendKeys(text);
	}
	
	public static void enterTextWaysToUnlearn_2(String text)
	{
		waysToUnlearningTextBox_2().click();
		waysToUnlearningTextBox_2().sendKeys(text);
	}
	
}
