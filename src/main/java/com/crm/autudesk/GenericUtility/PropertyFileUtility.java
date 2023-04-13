package com.crm.autudesk.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility {
/**
 * This class contains generic methods to read data from from property file
 * @author punith raj.c
 * @throws Throwable 
 * 
 */
	public String getPropertyFileData(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstants.PropertyFilePath);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}
}
