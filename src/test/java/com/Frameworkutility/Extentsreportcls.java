package com.Frameworkutility;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentsreportcls extends Screenshot
{

	public static ExtentTest loger;
	public static ExtentReports er;
	
	@BeforeSuite
	public static void reportcreation()
	{
		System.out.println("Report creation starts");
		ExtentHtmlReporter ehr=new ExtentHtmlReporter("E:\\Selenium_01\\Reports\\HRM_"+scr.getsystemdate()+".html");
		 er=new ExtentReports();
		er.attachReporter(ehr);
	}
	
	@AfterMethod
	public static void attachscrtoreport(ITestResult result) throws IOException
	{
		Reporter.log("Screenshot is going to capture");
		if(result.getStatus()==ITestResult.SUCCESS)
		{
		loger.pass("Success",MediaEntityBuilder.createScreenCaptureFromPath(scr.getscreenshot()).build());
		Reporter.log("All pass status screenshots are captured");
	}
	else if(result.getStatus()==ITestResult.FAILURE)
	{
	loger.fail("Fail",MediaEntityBuilder.createScreenCaptureFromPath(scr.getscreenshot()).build());
	Reporter.log("All failed status screenshots are captured");
	}
	else
	{
		System.out.println("Screenshots are not captured");
	}
		er.flush();
		Reporter.log("Html report is captured",true);
}
}
	


