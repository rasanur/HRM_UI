package com.TestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Frameworkutility.Baseclass;
import com.Frameworkutility.ReadData;
import com.Frameworkutility.Screenshot;
import com.Webcommonreusable.Webreusable;

public class Testcases extends Baseclass
{

	public static Webreusable wr=new Webreusable();
	public static Screenshot scr=new Screenshot();
	public static ReadData rd=new ReadData();		
	
	//login page object
	@FindBy(xpath="//a[@class='current']")public static WebElement Partners;
	@FindBy(xpath="//a[contains(@class,'btn-orange btn-orange-thick qs-btn')]")public static WebElement BecomePartner;
	@FindBy(xpath="//input[@id=\"txtUsername\"]")public static WebElement username;
	@FindBy(id="txtPassword")public static WebElement password;
	@FindBy(id="btnLogin")public static WebElement loginbutton;
	
	
	//----------------------------------------------------------------------------
	//Apply leave object
	
	@FindBy(id="menu_pim_viewMyDetails")public static WebElement MyInfotab;
	@FindBy(id="btnSave")public static WebElement Editbutton;
	@FindBy(id="personal_txtEmpFirstName")public static WebElement name;
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")public static WebElement middlename;
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")public static WebElement lastname;
	@FindBy(xpath="//input[@id='personal_txtOtherID']")public static WebElement otherId;
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']")public static WebElement licenseexpirydate;
	@FindBy(xpath="//input[@id='personal_optGender_2']")public static WebElement gender;
	@FindBy(xpath="//select[@id='personal_cmbMarital']")public static WebElement maritalstatus;
	@FindBy(xpath="//select[@id='personal_cmbNation']")public static WebElement country;
	@FindBy(xpath="//input[@value=\"Save\"]")public static WebElement svaebutton;
   
	//-------------------------------------------------------------------
	  /*
	   * Author:Rashmi
	   * Method:This is hrm login page.
	   * Date:02/01/2020
	   */
	
	//----------------------------------------------------
           
	//login page logic
	
	public void hrmlogin() throws IOException
	{
		String Username=rd.getcelldata("LoginTestData", 1, 1);
		String Password=rd.getcelldata("LoginTestData", 1, 2);
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginbutton.click();
		scr.getscreenshot();
	}
	
	public void updatingofemployeedetails()
	{
		MyInfotab.click();
		Editbutton.click();
		name.clear();
		name.sendKeys("Testingmasters");
		middlename.clear();
		middlename.sendKeys("s");
		lastname.clear();
		lastname.sendKeys("masters");
		otherId.clear();
		otherId.sendKeys("12345");
		gender.click();
//		maritalstatus.clear();
//		Select exd=new Select(licenseexpirydate);
//		exd.selectByValue("21");
//		exd.selectByValue("May");
//		exd.selectByValue("2020");
//		Select os=new Select(maritalstatus);
//		os.selectByVisibleText("Single");
//		country.clear();
//		wr.selectoptions(country, "German");
//		svaebutton.click();
//		scr.getscreenshot();
	
	}
	


	public void becomepartners() 
	{
		
		driver.get("https://www.orangehrm.com/partners/");	
		driver.manage().window().maximize();
		driver.close();
	}
	
}
