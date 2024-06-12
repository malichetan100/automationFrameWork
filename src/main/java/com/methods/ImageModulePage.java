package com.methods;

import com.Weblocators.ImageModulePageWeblocators;

public class ImageModulePage extends ImageModulePageWeblocators{
	
	public static void openImages()
	{
		images().click();
	}
	
	public static void uploadImage()
	{
		upload().sendKeys("C:\\Users\\HP\\Desktop\\JALA\\JALA_Selenium_Framework\\src\\main\\resources\\photo.png");
	}

	public static void enterFilename(String text)
	{
		filename().clear();
		filename().sendKeys(text);
	}
	
	public static void openUploadBtn()
	{
		uploadBtn().click();
	}
	
	public static boolean isImageUploadSucessmsgDisplayed()
	{
		return imageUploadSucess_1().isDisplayed() && imageUploadSucess_2().isDisplayed();
	}
	
	public static void openDeleteImage()
	{
		deleteImage().click();
	}
	
	public static boolean isImageDeleted()
	{
		return imageUploadSucess_1().isDisplayed();
	}
	
	public static void openCloaseMessage()
	{
		closeMessege().click();
	}
	
}
