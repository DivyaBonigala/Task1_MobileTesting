package com.mobiletesting.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrowser
{
	protected WebDriver driver;

	@BeforeClass
	public void firefox_setup() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        driver = new FirefoxDriver(options);
        
        
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

