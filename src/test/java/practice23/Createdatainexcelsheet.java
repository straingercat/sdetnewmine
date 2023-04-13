package practice23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Createdatainexcelsheet {

	public static void main(String[] args) throws Throwable  {
		FileInputStream fis=new FileInputStream("C:\\Users\\punith raj.c\\Desktop\\newdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("Datasheet1");
		sh.createRow(0).createCell(0).setCellValue("data1");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\punith raj.c\\Desktop\\newdata.xlsx");
		book.write(fos);
		fos.flush();
		 
		

	}

}
