package com.boardmake.testmvc.database;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	
	public class DBConnection {
		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			Connection conn =null;
			
			String url = "jdbc:mysql://localhost:3306/evening";
			String id = "root";
			String pw = "9616";
			
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			
			return conn;
		}
	}
	

