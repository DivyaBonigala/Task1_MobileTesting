package com.mobiletesting.scripts;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.mobiletesting.scripts.screenshotclass;

public class mobile_chrome extends chromebrowser{
	
	@Test
	public void website_open()
	{
		for(int i=1;i<=5;i++)
		{
			
		
		try
		{
				
				driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr["+i+"]/td[1]/a")));
		    
			element.click();
			System.out.println("url is navigated");

		    
		    Thread.sleep(3000);
		    System.out.println("adjusting the resolution for chrome");
		    driver.manage().window().setSize(new Dimension(360, 640));
		    System.out.println("Window size set to: " + driver.manage().window().getSize());
		    Thread.sleep(2000);
		    
		    String folder360 ="/Users/divyabonigala/eclipse-workspace/Task1_MobileTesting/Mobile_chrome_images/360X640";
		    File folder = new File(folder360);
		    if (!folder.exists()) {
		      	 Assert.fail("Folder path does not exist: " + folder360);
		      }

		    String ssfile = folder360 +"/screenshot_"+screenshotclass.dateutils.getDateTimeStamp()+ ".png";
		    screenshotclass.takescreenshot(driver, ssfile);
		    System.out.println("Screenshot taken and saved as: " + ssfile);
		    Thread.sleep(3000);
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		
		//screen resolution of 414X896
		
		for(int i=1;i<=5;i++)
		{
			
		
		try
		{
				
				driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr["+i+"]/td[1]/a")));
		    
			element.click();
			System.out.println("url is navigated");

		    
		    Thread.sleep(3000);
		    System.out.println("adjusting the resolution for chrome");
		    driver.manage().window().setSize(new Dimension(414,896));
		    System.out.println("Window size set to: " + driver.manage().window().getSize());
		    Thread.sleep(2000);
		    
		    String folder414="/Users/divyabonigala/eclipse-workspace/Task1_MobileTesting/Mobile_chrome_images/414X896";
		    File folder = new File(folder414);
		    if (!folder.exists()) {
		      	 Assert.fail("Folder path does not exist: " + folder414);
		      }

		    String ssfile = folder414 +"/screenshot_"+screenshotclass.dateutils.getDateTimeStamp()+ ".png";
		    screenshotclass.takescreenshot(driver, ssfile);
		    System.out.println("Screenshot taken and saved as: " + ssfile);
		    Thread.sleep(3000);
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		
		
		
		//screen resolution of 375X667
		
		for(int i=1;i<=5;i++)
		{
			
		
		try
		{
				
				driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr["+i+"]/td[1]/a")));
		    
			element.click();
			System.out.println("url is navigated");

		    
		    Thread.sleep(3000);
		    System.out.println("adjusting the resolution for chrome");
		    driver.manage().window().setSize(new Dimension(375,667));
		    System.out.println("Window size set to: " + driver.manage().window().getSize());
		    Thread.sleep(2000);
		    
		    String folder375 ="/Users/divyabonigala/eclipse-workspace/Task1_MobileTesting/Mobile_chrome_images/375X667";
		    File folder = new File(folder375);
		    if (!folder.exists()) {
		      	 Assert.fail("Folder path does not exist: " + folder375);
		      }

		    String ssfile = folder375 +"/screenshot_"+screenshotclass.dateutils.getDateTimeStamp()+ ".png";
		    screenshotclass.takescreenshot(driver, ssfile);
		    System.out.println("Screenshot taken and saved as: " + ssfile);
		    Thread.sleep(3000);
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		
		
		driver.quit();
		
	}

}
