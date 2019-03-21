package com.Bank;

public class SavingAccount implements Comparable<SavingAccount>{
	
	int acc_ID;
	String accountHolderName;
	boolean isSalaryAccount;
	double acc_balance;
	
	public SavingAccount(int acc_ID, String accountHolderName, boolean isSalaryAccount,double acc_balance) {
		super();
		 
		this.acc_ID = acc_ID; 
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
		this.acc_balance = acc_balance; 
	}
	
	public SavingAccount() {
		
	}

	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	public void withdraw(double amount) {
		if(acc_balance>=amount) {
			this.acc_balance = this.acc_balance-amount;
			System.out.println("Your Amount has been Withdrawn Successfully.");
			
		}
	} 
	public void deposit(double amount) {
		this.acc_balance = acc_balance+amount;
		System.out.println("Your Amount has been Deposited into your Account Successfully.");
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_ID=" + acc_ID + ", accountHolderName=" + accountHolderName + ", isSalaryAccount="
				+ isSalaryAccount + ", acc_balance=" + acc_balance + "]";
	}

	@Override
	public int compareTo(SavingAccount acc ) {
		return acc_ID-acc.getAcc_ID();
	}
	
	
}
