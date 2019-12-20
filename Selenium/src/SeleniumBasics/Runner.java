package SeleniumBasics;

import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//call setup method to create connection between selenium and databse
		CityTableDB.SetupConnection();
		CityTableDB.runQuery();
		CityTableDB.closeConnection();

	}

}
