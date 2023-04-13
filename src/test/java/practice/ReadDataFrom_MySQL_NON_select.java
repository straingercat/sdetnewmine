package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MySQL_NON_select {
	public static void main(String[] args) throws Throwable {
		
		
		
        //step1:register/load the mysql database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		
		
		//step2:get connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
		
		
		//step3:create sql statement
	    Statement stat = con.createStatement();
	     String query = "insert into students_info(regno, firstname, middlename, lastname) values('10','jam','gowda','hassan')";
	     
	     
	     //step4:execute statement/query
	     int result = stat.executeUpdate(query);
	     if(result==1) {
	    	 System.out.println("user is created");
	     }
	     else
	     {
	    	 System.out.println("user is not created");
	
	     
		
	    
	
	    	
	    
	    //step 5:close the connection
	    con.close();
		
	

}

	}

}
