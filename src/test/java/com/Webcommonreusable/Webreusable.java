package com.Webcommonreusable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Frameworkutility.Baseclass;

public class Webreusable extends Baseclass
{
 public  void selectoptions(WebElement element, String visibletext)
 {
	 Select sel=new Select(element);
	 sel.selectByVisibleText(visibletext);
 }
 
 public  void jsclickelement(WebElement element)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();",element);
	 
	 
 }
 public void myinfoclick(WebElement element)
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(element).click();
	 
 }
}
