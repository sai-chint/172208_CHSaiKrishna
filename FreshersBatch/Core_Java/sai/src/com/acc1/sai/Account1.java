package com.acc1.sai;

import com.sai.Account;

public class Account1 {
public static void main(String[] args) {
	Account s1 = new Account();
	s1.setId("918");
	s1.setName("saikrishna");
	s1.setBalance(17043);
	s1.debit(180);
	
System.out.println("Balance "+s1.getBalance());
	s1.credit(1000);
System.out.println("balance ==="+s1.getBalance());
	s1.Transfer(1234,17000);
	System.out.println(s1.toString());
System.out.println("balance ==="+s1.getBalance());
System.out.println("Name "+s1.getName());
System.out.println("Id "+s1.getId());	
System.out.println("balance ==="+s1.getBalance());

}
}
