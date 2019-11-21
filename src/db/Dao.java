package db;

import java.sql.*;
import java.util.*;


public class Dao {
	private String dbUrl = "jdbc:mysql://localhost:3306/";
	private String dbName = "rvh";
	private String user = "guest";
	private String pass = "Guest2019";
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}	
	}
	
	public Dao(String dbUrl, String dbName, String user, String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			this.dbUrl = dbUrl;
			this.dbName = dbName;
			this.user = user;
			this.pass = pass;
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}		
	}
	
	/**
	 * uses getConnection() method to connect to the database and returns the Connection object
	 * 
	 * @return connection the connection
	 * @throws SQLException
	 */
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbUrl + dbName, user, pass);
	}
	
	public String getPatientName(int pid) throws SQLException {
		
		Connection dbConn = getConnection();
		Statement stmt = dbConn.createStatement();
		ResultSet records = stmt.executeQuery("SELECT name FROM patients WHERE pid = "+pid);
		records.first();		
		String result=records.getString("name");
		dbConn.close();
		return result;
		
	}
	
	public String getPatientCareCentre(int pid) throws SQLException {
		
		Connection dbConn = getConnection();
		Statement stmt = dbConn.createStatement();
		ResultSet records = stmt.executeQuery(
				"SELECT C.name as name FROM patients AS P,care_centres AS C WHERE P.care_centre_id=C.cid AND pid = "+pid);
		records.first();		
		String result=records.getString("name");
		dbConn.close();
		return result;	
	}
	
	public String getPatientNurse(int pid) throws SQLException {
		
		Connection dbConn = getConnection();
		Statement stmt = dbConn.createStatement();
		ResultSet records = stmt.executeQuery(
				"SELECT N.name as name FROM patients AS P,care_centres AS C, nurses AS N"
				+ " WHERE P.care_centre_id=C.cid AND C.nurse_charge_id=N.nid AND pid = "+pid);
		records.first();		
		String result=records.getString("name");
		dbConn.close();
		return result;	
	}
	
	public ArrayList<String[]> getPatientTreatments(int pid) throws SQLException {
		
		ArrayList<String[]> treatments = new ArrayList<String[]>();	
		Connection dbConn = getConnection();
		Statement stmt = dbConn.createStatement();
		ResultSet records = stmt.executeQuery("SELECT * FROM treatments WHERE patient_id = "+pid);
		while(records.next()) {
			String[] treatment=new String[] {records.getString("tid"),records.getString("treatment_name"),records.getString("physician_id"),records.getString("date")};
			treatments.add(treatment);			
		}		
		dbConn.close();
		return treatments;	
	}

}
