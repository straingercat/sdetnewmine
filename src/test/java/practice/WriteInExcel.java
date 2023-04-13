	package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\punith raj.c\\Desktop\\testDa.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("punith");
		sh.createRow(1).createCell(0).setCellValue("Datawall");
		
		FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\punith raj.c\\\\Desktop\\\\testDa.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("pass");
		
		
		
	}

}
