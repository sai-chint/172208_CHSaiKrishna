package com.TestSavingAccount;

import com.Bank.SavingAccount;
import com.BankAcc.BankAccountList;

public class TestSavingAccount {

	public static void main(String[] args) {
		BankAccountList ba = new BankAccountList();
		ba.addNewSavingAccount(new SavingAccount(918,"Sai",true,1417918));
		ba.addNewSavingAccount(new SavingAccount(1714,"Krishna",true,1714918));
		ba.addNewSavingAccount(new SavingAccount(1417,"Chinna",true,140918));
		
		for(SavingAccount ts:ba.getSavingAccount())	{
			System.out.println( ts); 
		}
		
		SavingAccount sai = new SavingAccount();
		sai.withdraw(1000.00);
		System.out.println("Balance : " +sai.getAcc_balance());
		sai.deposit(5000.00);
		System.out.println("Balance : " +sai.getAcc_balance());
		
	}

}
