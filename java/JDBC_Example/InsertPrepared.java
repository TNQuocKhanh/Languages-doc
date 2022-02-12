package mypack;

import java.sql.*;  

public class InsertPrepared {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/sonoo";
	//  Database credentials
	static final String USER = "daonm";
	static final String PASS = "12345";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			//STEP 4: Execute a query
			stmt=conn.prepareStatement(
					"insert into emp (name,age) values (?,?)");  
			stmt.setString(1,"nam");
			stmt.setInt(2,27);  

			int i=stmt.executeUpdate();  

			System.out.println(i+" records inserted");  
 

		}catch(ClassNotFoundException e){ 
			System.out.println(e);
		}  catch(Exception e){ 
			System.out.println(e);
		}  
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}  
}

