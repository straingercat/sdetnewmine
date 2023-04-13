

package com.crm.autudesk.GenericUtility;


import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

/**
 * This class contains methods to read data from json file
 * @author punith raj.c
 *
 */
public class JSONFileUtility {
	/**
	 * This method read the data from json file
	 * @throws Throwable 
	 */
	public String readDataFromJson(String key) throws Throwable 
	{
		//read the data from json file
		
		FileReader file = new FileReader("./commonData.json");
		
		//convert json file into java object
		
		JSONParser jsonobj = new  JSONParser();
		Object javaobj = jsonobj.parse(file);
		
		
		//typecast javaobject to hashmap
		
		HashMap map=(HashMap)javaobj;
		
		String value = map.get(key).toString();
		
		
		//return the value
		return value;
	}

}
