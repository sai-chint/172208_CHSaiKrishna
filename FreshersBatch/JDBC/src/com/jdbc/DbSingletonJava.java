package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class DbSingletonJava {
		
		private static final ConnectionFactory ONE= new ConnectionFactory();
	
	private static Connection conn;
	
	void DbSingleton()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ConnectionFactory getInstance()
	{
		return ONE;
	}
		public static Connection getConnection() {
		return conn;
	}
}

