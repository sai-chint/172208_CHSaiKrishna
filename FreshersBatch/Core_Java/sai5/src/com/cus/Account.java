package com.cus;

public class Account {
private int id;
private Customer customer;
private double bal=0.0;

public Account(int id, Customer customer, double bal) {
	super();
	this.id = id;
	this.customer = customer;
	this.bal = bal;
}
public Account(int id, Customer customer) {
	super();
	this.id = id;
	this.customer = customer;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public int getId() {
	return id;
}
public Customer getCustomer() {
	return customer;
}

@Override
public String toString() {
	return "Account [customer=" + customer + ", bal=" + bal + "]";
}

public void deposit(double amount) {
	bal=bal+amount;
}
public double withdraw(double amount) {
	if(amount<=bal) {
		System.out.println("substract amount \n");
	bal = bal - amount;
	}
	else {
		System.out.println("amount withdrawn \n");
	}
	return bal;
}
}
