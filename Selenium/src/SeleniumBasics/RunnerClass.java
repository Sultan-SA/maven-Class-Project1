package SeleniumBasics;

import java.sql.SQLException;

public class RunnerClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//call setup method to create connection between selenium and databse
		DBUtilities.SetupConnection();
		DBUtilities.runQuery();
		DBUtilities.closeConnection();
		
		
		
		
		
		
	}

}
