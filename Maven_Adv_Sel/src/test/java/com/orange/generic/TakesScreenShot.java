package com.orange.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot 
{
   public static String getPhoto(WebDriver driver, String file_path) throws IOException
   {   
	   String path=file_path;
	   TakesScreenshot tss=(TakesScreenshot)driver;
	   File src = tss.getScreenshotAs(OutputType.FILE);
	   File trg = new File(path);
	   FileHandler.copy(src, trg);
	   return "."+path;
	   
   }
}
