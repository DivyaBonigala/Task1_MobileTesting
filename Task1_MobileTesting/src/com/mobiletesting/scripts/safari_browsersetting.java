package com.mobiletesting.scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class safari_browsersetting {
	protected WebDriver driver;

	@BeforeClass
	public void safari_setup() throws InterruptedException 
	{
		driver = new SafariDriver();

}
	
	@AfterClass
	public void empty()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
}
