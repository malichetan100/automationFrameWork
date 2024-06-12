package com.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Weblocators.CreatePage_Weblocators;

public class CreatePage extends CreatePage_Weblocators{
	
	static CreatePage createPage;
	public static CreatePage registerAStudent(String fstname,String lstname,
			String emailid,String mobile,String gender) 
	{
		firstname().sendKeys(fstname);
		lastname().sendKeys(lstname);	
		emailId().sendKeys(emailid);
		mobileNumber().sendKeys(mobile);
		selectMaleOrFemale(gender);
		return createPage;
	}
	
	public static void openSave()
	{
		save().click();
	}
	
	public static void openCancel()
	{
		cancel().click();
	}

	public static boolean isSearchGridDisplyaed()
	{
		return (serachEmployee().isDisplayed() && serachEmployee().isEnabled() && searchEmployeeText().isDisplayed()
				&& name().isDisplayed() && clear().isDisplayed() && mobileNo().isDisplayed()) ;
	}
	
	public static void checkSkills(int skill)
	{
		skills(skill).click();
	}
	
	public static void selectCountry(String c_name)
	{
		Select sc=new Select(country());
		sc.selectByVisibleText(c_name);	
	}
	
	public static void selectCity(String city_name)
	{
		Select city=new Select(city());
		city.selectByVisibleText(city_name);	
	}
	
	public static void selectOtherCitycheckbox()
	{
			
	}
	
	public static boolean isOtherCitySeleted()
	{
		return otherCity().isSelected();
	}
	
	
	public static void enterOtherCityText(String city)
	{
		if(isOtherCitySeleted()== false)
		{
			otherCity().click();
			enterOthercity().sendKeys(city);	
		}
		
	}
}
