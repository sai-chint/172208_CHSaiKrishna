package com.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAO {
	
	public void insert(double newBalance) throws SQLException {
		
		String query="insert into bank values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setDouble(1,newBalance);
		pStatement.executeUpdate();
	}

	public double getBalance() throws SQLException {
			
		String query="select balance from bank";
			BankAccount acc=null;
			double bal = 0;
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			ResultSet resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				acc=new BankAccount();
				bal=resultSet.getDouble("balance");
	}
		return bal;
	}
}
