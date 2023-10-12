package in.co.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCrud {
    public static void main(String[] args) throws Exception {
		
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
	
    	Statement stmt= conn.createStatement();
    	
    	int i = stmt.executeUpdate("insert into emp values(10,'Naman',1500)");
    	  
    	i = stmt.executeUpdate("insert into emp values(9,'Narakasur',5500)");
    	
    	System.out.println("Data insert="+ i);
    
    }
}
