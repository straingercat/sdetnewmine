package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MYSQL_DB {

	public static void main(String[] args) throws Throwable {
		
		
		
		//step1:register/load the my sql database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		
		
		//step2:get connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "root");
		
		
		//step3:create sql statement
	    Statement stat = con.createStatement();
	     String query = "select*from students_info";
	     
	     
	     //step4:execute statement/query
	    ResultSet result = stat.executeQuery(query);
	    
		
	    
	    while(result.next()) {
	    	System.out.println(result.getInt(1)+"\t"+ result.getString(2)+"\t"+result.getString(3)+result.getString(4));
	    	
	    }
	    	
	    
	    //step 5:close the connection
	    con.close();
		
	}

}
