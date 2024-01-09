package com.orange.UTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_Action 
{
  public static void mouseHover(WebDriver driver,WebElement target)
  {
	  Utility_Object.Actions_object(driver).moveToElement(target).perform();
  }
  
  public static void click_hold(WebDriver driver,WebElement element) 
  {
	 Utility_Object.Actions_object(driver).contextClick(element).perform();
  }
  
  public static void context_click(WebDriver driver, WebElement element) 
  {
	  Utility_Object.Actions_object(driver).contextClick(element).perform();
  }
  
  public static void double_click(WebDriver driver, WebElement element) 
  {
   	Utility_Object.Actions_object(driver).doubleClick().perform();
  }
  
  public static void drag_Drop(WebDriver driver, WebElement source, WebElement target)
  {
	  Utility_Object.Actions_object(driver).dragAndDrop(source, target).perform();
  }
  
  public static void moveByoffset(WebDriver driver, int a, int b)
  {
	  Utility_Object.Actions_object(driver).clickAndHold().perform();
  }
 }
