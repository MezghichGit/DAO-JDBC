package main;
import java.sql.*;
public class Util {
	
	
	public static Connection conn = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;
	
	public static Statement open() throws SQLException
	{
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/isikabd2021", "root", "");
		stmt = conn.createStatement();
		return stmt;
		
	}
	
	
	public static void close() throws SQLException
	{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	}

}
