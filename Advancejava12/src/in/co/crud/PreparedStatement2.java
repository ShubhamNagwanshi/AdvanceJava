package in.co.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement2 {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
	
	PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?)");

	ps.setInt(1, 5);
	ps.setString(2, "Neta");
	ps.setInt(3, 1250);
	
	int i = ps.executeUpdate();
	
	System.out.println("Data Inserted = "+ i);
}
}
