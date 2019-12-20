package SeleniumBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityTableDB {
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet resultSet;
	
	
	private static String dbURL="jdbc:postgresql://localhost:5432/dvdrental";
	
	private static String dbUserName="postgres";
	
	
	private static String dbPassword="root";
	
	
	private static String dbQuery="select * from public.city ORDER BY city DESC";
	
	
	
	
	// this method connect selenium to databse 
		public static void SetupConnection() throws SQLException {
			try {
			conn =DriverManager.getConnection(dbURL,dbUserName, dbPassword);
		} catch (SQLException e) {
		}
		}
		
		// this method will execute the query from database
		public static void runQuery(String query) {
			try {
			stmt=conn.createStatement();
			resultSet=stmt.executeQuery(dbQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.printf("%-10s %-10s %-10s %-10s\n", "city_id", "city","country_id","last_update");
			
			
			try {
				while(resultSet.next()) {
					System.out.printf("%-10s %-10s %-10s %-10s\n", resultSet.getString("city_id"),resultSet.getString("city"),resultSet.getString("country_id"),resultSet.getString("last_update"));
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


