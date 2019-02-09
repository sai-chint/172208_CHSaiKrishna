package com.cus;

public class TestCustomer {
public static void main(String[] args) {
	Customer c = new Customer(918, "sai",'M' ,10);
	Account a = new Account(918,c);
	a.deposit(5000);
	System.out.println("balance is = " +a.getBal());
	a.withdraw(2000);
	System.out.println("balance is = " +a.getBal());
	System.out.println(a.toString());
}
}
