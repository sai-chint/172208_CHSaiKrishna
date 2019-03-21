package com.springmvc.flipkart.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;

@Controller
public class DBConnection {
	
	private static Connection con;
	
	public static Connection getConnection() {
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
	
		Statement st =con.createStatement();
		ResultSet rs= st.executeQuery("select * from flipkartProject");
		while(rs.next()) {
			System.out.println(rs);
		}
		
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();	
	}
	catch (SQLException e) {
		e.printStackTrace();	
	}
		return con;
	}
}	