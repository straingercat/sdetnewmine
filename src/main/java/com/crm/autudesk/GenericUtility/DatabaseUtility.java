package com.crm.autudesk.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;


import com.mysql.cj.jdbc.Driver;

/**
 * This class contains methods to read data from Database
 * @author punith raj.c
 *
 */

public class DatabaseUtility 
{
	Connection con=null;
	Driver driverRef;
	
	/**
	 * Establish connection with Mysql Dtabase
	 * @throws Throwable 
	 * 
	 */
	
	public void connectionToDB() throws Throwable
	{
		DriverManager.registerDriver(driverRef);
		DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
	}
	/**
	 * Closes connection with the Database
	 * @throws Throwable 
	 * 
	 */
	public void closeDB() throws Throwable
	{
		con.close();
		
		
	}
	

}
