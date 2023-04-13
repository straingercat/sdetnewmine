package com.crm.autudesk.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains generic methods to read and write data from excel sheet
 * @author punith raj.c
 *
 */


public class ExcelFileUtility {
/**
 * This method will read data from excel sheet wrt to row number and cell number
 * @throws Throwable 
 */
	public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = format.formatCellValue(cell);
		//workbook.close();
		return value;
	}
}

	/*
	 * This method read and return the data 
	 */
	//public Object[][] getExcelData(String SheetName) throws Throwable
	//{
		
		
		//FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		
		//Workbook workbook = WorkbookFactory.create(fis);
		//Sheet sheet=workbook.getSheet(SheetName);
		//int lastRow=sheet.getLastRowNum();
		//int lastCell=sheet.getRow(0).getLastCellNum();
		
		//Object[][] data=new Object[lastRow][lastCell];
		//for(int i=0;i<lastRow;i++)
		//{
		//	for(int j=0;j<lastCell;j++)
		//	{
				//data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
				
		//	}
		//}
		//return data;
		

