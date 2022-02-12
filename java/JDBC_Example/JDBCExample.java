package mypack;

//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/";

	//  Database credentials
	static final String USER = "daonm";
	static final String PASS = "12345";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			//STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();

			String sql = "CREATE DATABASE DBSTUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		}catch(ClassNotFoundException se){
			//Handle errors for JDBC
			System.out.println("Lỗi driver!!!");
		}catch(SQLException se){
			//Handle errors for JDBC
			System.out.println("Lỗi Không mở kết nối!!!");
		}catch(Exception e){
			//Handle errors for Class.forName
			System.out.println("Lỗi không hiểu nổi!!!");
		}
		System.out.println("Goodbye!");
	}//end main
}//end JDBCExample