package com.orange.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Excel_fetch_data
{
   public static String get_data(String sheet, int row,int cell, String excelPath)
   {
	   FileInputStream fis;
	   Workbook book=null;
	   
	   try
	   {
		fis=new FileInputStream(excelPath);
		book= WorkbookFactory.create(fis);
		   
	   }
	   catch (Exception e) 
	   {
		   e.printStackTrace();
	   }
	   
	   Sheet she = book.getSheet(sheet);
	   Row ro = she.getRow(row);
	   Cell cel = ro.getCell(cell);
	   String value = cel.toString();
	   return value;
	   
   }
}
