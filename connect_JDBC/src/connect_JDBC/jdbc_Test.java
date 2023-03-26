package connect_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Test {
	public static void main(String[] args) throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		//Database connections SQL........
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "Admin@2022";
	//=================================================================================
		// Failure to connect will throw an exception:
		//	--java.sql.SQLException: bad url or credentials
		//	--java.lang.ClassNotFoundException:JDBC driver not in classpath
		try {
			
			//1. Get a connection to database
			myConn=DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("Database connection successful!\n");
			//Code snippet for connecting to MySQL
			
	//==================================================================================
			//2.Create a statement
			myStmt = myConn.createStatement();
			// The Statement object is based on connection
			//	-- It will be used later to execute the SQl
			
	//===================================================================================
			//3.Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			//Pass in your SQL Query
			
	//===================================================================================
			//4.Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
			//Result set is initially placed before first row
			//Method:ResultSet.next()
			//	--moves forward one row
			//	--returns true if there are more rows to process
			
	//===================================================================================
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
