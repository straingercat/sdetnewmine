package nterview_indicube;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\punith raj.c\\Desktop\\testDa.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("punith");
		sh.createRow(0).createCell(0).setCellValue("Datawall");
		
		FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\punith raj.c\\\\Desktop\\\\testDa.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("pass");
		
		
		
	}

}
