package main;

import java.sql.SQLException;

import logik.SecurityImpl;

public class Main {

	public static void main(String[] args) throws SQLException {
		SecurityImpl si = new SecurityImpl();
		
		String userID = "Name";
		si.getAllFromPermissions(userID);
		
		


	}

}
