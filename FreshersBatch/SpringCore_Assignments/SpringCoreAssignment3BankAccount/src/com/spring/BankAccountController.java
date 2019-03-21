package com.spring;

import java.sql.SQLException;

public class BankAccountController {
	
	private BankAccountServiceImpl service;
	
	public double withdraw(long accountId, double balance) throws SQLException {
		
		return service.withdraw(accountId, balance);	
	
	}
	
	public double deposit(long accountId, double balance) throws SQLException {
		return service.deposit(accountId, balance);
		
	}
	
	public void setService(BankAccountServiceImpl service) {
		this.service = service;
	}
	
	public double getBalance(long accountId) {
		return service.getBalance(accountId);
		
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws SQLException {
		return service.fundTransfer(fromAccount, toAccount, amont);
		
	}
}
