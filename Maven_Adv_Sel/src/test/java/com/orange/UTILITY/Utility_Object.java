package com.orange.UTILITY;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Object 
{
  public static Select select_object(WebElement element)
  {
	Select sel = new Select(element);
	return sel;
  }
  
  public static Actions Actions_object(WebDriver driver)
  {
	  Actions act =new Actions(driver);
	  return act;
  }
  
  public static JavascriptExecutor javascript(WebDriver driver)
  {
	  JavascriptExecutor jss=(JavascriptExecutor)driver;
	  return jss;
  }
}

  
  

