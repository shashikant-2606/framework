package com.new_maven_project.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_provider
{
	XSSFWorkbook wb;
	public excel_provider() throws IOException
	{
	File excel=new File("./testdata/loginingo.xlsx");
	FileInputStream fi=new FileInputStream(excel);
	wb=new XSSFWorkbook(fi);
	}
	
	public String getStringData(String sheetname,int row,int col)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}
	public double getNumericData(String sheetname,int row,int col)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

}
	
