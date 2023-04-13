package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReaddatafromExceldata {

	public static void main(String[] args) throws Throwable {
		
			FileInputStream fis = new FileInputStream("C:\\Users\\punith raj.c\\Desktop\\testDa.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("punith");
			
			Row row = sheet.getRow(1);
			 Cell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}
	
	}


