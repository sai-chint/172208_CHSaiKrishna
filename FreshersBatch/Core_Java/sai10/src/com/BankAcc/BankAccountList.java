package com.BankAcc;

import java.util.TreeSet;

import com.Bank.SavingAccount;

public class BankAccountList { 
	
	TreeSet<SavingAccount> ts;

	public BankAccountList() {
		ts = new TreeSet<>(); 
	}
	public void addNewSavingAccount(SavingAccount sa) {
		ts.add(sa); 
	}
	public TreeSet<SavingAccount> getSavingAccount(){
		return ts;
		
	}
	
}
