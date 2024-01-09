package com.orange.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Excel_enterDataIntoExcelSheet 
{
 public static void enterDataIntoExcel(String excelPath,String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis=new FileInputStream(excelPath);
	 Workbook book=WorkbookFactory.create(fis);
	 Sheet sh = book.createSheet(sheet);
	 Row ro = sh.createRow(row);
	 Cell cel = ro.createCell(cell);
	 cel.setCellValue(value);
	 FileOutputStream fout=new FileOutputStream(excelPath);
	 book.write(fout);
 }
}
