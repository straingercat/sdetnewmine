package com.crm.practice;

import com.crm.autudesk.GenericUtility.ExcelFileUtility;
import com.crm.autudesk.GenericUtility.JSONFileUtility;

public class DemoFileReader {

	public static void main(String[] args) throws Throwable {
		/*JSONFileUtility jsonLib = new JSONFileUtility();
		String val = jsonLib.readDataFromJson("username");
 System.out.println(val);*/
 
 ExcelFileUtility elib=new ExcelFileUtility();
 String contactname = elib.getExcelData("Sheet1", 1, 1);
 String OrgName = elib.getExcelData("Sheet1", 1, 3);
 System.out.println(contactname+"\t"+OrgName);
	
	}

}
