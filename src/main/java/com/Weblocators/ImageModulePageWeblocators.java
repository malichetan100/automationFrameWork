package com.Weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.methods.BaseTest;

public class ImageModulePageWeblocators extends BaseTest{

	protected static WebElement images()
	{
		return wd.findElement(By.linkText("Images"));
	}
	
	protected static WebElement upload()
	{
		return wd.findElement(By.xpath("//input[@id='file']"));
	}
	
	protected static WebElement filename()
	{
		return wd.findElement(By.xpath("//input[@id='fileName']"));
	}
	
	protected static WebElement uploadBtn()
	{
		return wd.findElement(By.xpath("//button[@class='btn btn-success']"));
	}
	
	protected static WebElement imageUploadSucess_1()
	{
		return wd.findElement(By.xpath("//div[@class='toast toast-success']"));
	}
	
	protected static WebElement imageUploadSucess_2()
	{
		return wd.findElement(By.xpath("//div[@class='box box-success']"));
	}
	
	protected static WebElement deleteImage()
	{
		return wd.findElement(By.xpath("//div[@class='box box-success']//child::div[1]//i"));
	}
	
	protected static WebElement closeMessege()
	{
		return wd.findElement(By.xpath("//button[@class='toast-close-button']"));
	}
}
//div[@class='toast toast-success']