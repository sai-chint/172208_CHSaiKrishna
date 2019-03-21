package com.spring;

import java.sql.SQLException;

public interface BankAccountService {

	public double withdraw(long accountId, double balance) throws SQLException;
	public double deposit(long accountId, double balance) throws SQLException;
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws SQLException;
	
}
