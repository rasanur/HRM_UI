package com.Frameworkutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{;
	public static String input;
    public static String getcelldata(String sheetname, int rownum, int cellnum) throws IOException
    {        	String Testdatapath="E:\\Selenium_01\\TestData\\Userinput.xlsx";

    	try {

			File f=new File(Testdatapath);
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook xsw=new XSSFWorkbook(fis);
			XSSFSheet xss=xsw.getSheet(sheetname);
			 input=xss.getRow(rownum).getCell(cellnum).getStringCellValue().toString();
			System.out.println(" Cell data:"+input);
			System.out.println("input from excel:" +input);
			
		} 
    	catch (Exception e) 
    	{
			System.out.println("Excel file not found:"+e.getMessage());
		}
return input;	

    }
}
