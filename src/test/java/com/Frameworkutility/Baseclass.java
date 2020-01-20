package com.Frameworkutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass 
{
	public static WebDriver driver;
	
  /*
   * Author:Rashmi
   * Method:This is for browser access and using we using this we will be launching application
   * Date:31/12/2019
   */
	
	public static void getbrowser(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_01\\Browserdrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.testingmasters.com/hrm/");
		driver.manage().window().maximize();
	}
		else if(Browser.equals("Ie"))
			{
			System.setProperty("webdriver.firefox.driver","E:\\Selenium\\IEDriverServer_x64_3.150.1.exe");
			 driver=new InternetExplorerDriver();
			driver.get("https://testingmasters.com/");	
			}
	}
}
