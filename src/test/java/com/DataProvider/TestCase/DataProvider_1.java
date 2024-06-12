package com.DataProvider.TestCase;
import org.testng.annotations.DataProvider;

public class DataProvider_1 {
	
	@DataProvider(name="testData")
	
	public Object[][] tdata()
	{
		return new Object[][]
		{
			{"trag@jalaacademy.com","jobprogram"},
			{"training@jalaacademy.com","jobp"},
			{"ining@jalaacademy.com","jobprogram"},
			{"training@jalaacademy.com","jobprogram"}
			
		}; 
}
}