package com.Frameworkutility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Baseclass
{
public static String getscreenshot()
{
	String Scrfolderpath="E:\\Selenium_01\\Screenshots\\HRM_"+getsystemdate()+".png";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File(Scrfolderpath));
		System.out.println("Sceenshot taken successfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Screenshot not taken:" +e.getMessage());
	}
	return Scrfolderpath;
}
public static String getsystemdate()
{
	Date dt=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("MM-yyy-dd_HH-mm-ss");
	String currentdate=sdf.format(dt);
	System.out.println("currentdate:" +currentdate);
	return currentdate;
	
}
}
