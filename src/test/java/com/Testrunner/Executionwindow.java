package com.Testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Frameworkutility.Baseclass;
import com.Frameworkutility.Extentsreportcls;
import com.TestCase.Testcases;

public class Executionwindow extends Baseclass
{
	public static Testcases tc=PageFactory.initElements(driver,Testcases.class);
	public static Extentsreportcls etrc= new Extentsreportcls();

	/*
	 * Author:Rashmi
     * Method:This creation is for Test execution.
	 * Date:31/12/2019
	 */
	
		@Test(priority=0)
		public static void testrun()
		{
			try
			{
				etrc.loger=etrc.er.createTest("Browser launching");
				getbrowser("Chrome");
				etrc.loger.pass("Browser launched successfully with URL");
				System.out.println("Chrome Browser launched successfully with url");
			}
			catch(Exception e)
			{
				etrc.loger.fail("Browser not launched");
				System.out.println("Browser not launched" +e.getMessage());
			}
		}
	    @Test(priority=1)
		public static void login()
		{
	    	
			try
			{
				tc.hrmlogin();
				System.out.println("User successfully login");
			}
			catch(Exception e)
			{
				System.out.println("User unable to login :" +e.getMessage());
			}
		}
	    @Test(priority=2)
		
		public static void employeedetailsupdate()
		{
			try {
				tc.updatingofemployeedetails();
				System.out.println("User able to update");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("User unable to upadte :" +e.getMessage());

			}
		
		}
	    @Test
	    public static void partners()
	    {
	    	try {
	    	tc.becomepartners();
	    	System.out.println("User able to upadte details to become partners");
	    
	    }
	    	catch(Exception e)
	    	{
		    	System.out.println("User unable to upadte details to become partners:" +e.getMessage());

	    	}
	    }
	}

