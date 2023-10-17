package in.co.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import in.co.user.JdbcDataSource;

public class TestProcedureIn {

	public static void main(String[] args)throws Exception {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays", "root", "root");
		
		CallableStatement callStmt = conn.prepareCall("{CALL empIN(?)}");
		 
		callStmt.setInt(1, 4);
		callStmt.execute();
		
		ResultSet rs = callStmt.getResultSet();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
	}
}
