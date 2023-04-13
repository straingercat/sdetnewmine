package practice;

import org.testng.annotations.Test;

import com.crm.autudesk.GenericUtility.ExcelFileUtility;

public class SampleTest {
@Test
public void Sample() throws Throwable {
	System.out.println("execute test");
	ExcelFileUtility elib=new ExcelFileUtility();
	String productname = elib.getExcelData("Sheet1", 1,4 );
	System.out.println(productname);

}
}
