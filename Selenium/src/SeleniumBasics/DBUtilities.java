package SeleniumBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	// creating private string object of connection class 
	// it is used to create a connection with database
	
	private static Connection conn;
	
	
	
	private static Statement stmt;
	// creating private static obj of ResultSet class
		//it is used to create a result set to store query result
	
	private static ResultSet resultSet;
	
	private static String dbURL="jdbc:postgresql://localhost:5432/dvdrental";
	
	//database user name
	private static String dbUserName="postgres";
	
	//database user password
	
	private static String dbPassword="root";
	
	
	private static String dbQuery="select * from public.actor ORDER BY first_name";
	
	
	// this method connect selenium to databse 
	public static void SetupConnection() throws SQLException {
		try {
		conn =DriverManager.getConnection(dbURL,dbUserName, dbPassword);
	} catch (SQLException e) {
		
		
	}
		
	}
		
		// this method will execute the query from database
		public static void runQuery() {
			try {
			stmt=conn.createStatement(); 
			resultSet=stmt.executeQuery(dbQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.printf("%-10s %-10s %-10s\n", "country", "country_id","last_update");
			
			
			try {
				while(resultSet.next()) {
					System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("first_name"),resultSet.getString("last_name"),resultSet.getString("last_update"));
				}
				
			}catch(SQLException e) {
			}
		}
		
		public static void closeConnection() {

			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
				
			}
		
		
	}
	
	
		}

