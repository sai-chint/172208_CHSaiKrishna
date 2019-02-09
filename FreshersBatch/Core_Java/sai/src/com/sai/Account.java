package com.sai;

public class Account {
	private String Id;
	private String Name;
	private int Balance=0;
public	Account() {
	
}
	
public Account(String Id,String Name) {
	Id = this.Id;
	Name = this.Name;
}
	
public Account(String Id,String Name,int Balance) {
	Id = this.Id;
	Name = this.Name;
	Balance = this.Balance;
}

public String getId() {
	return Id;
}

public void setId(String id) {
	this.Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	this.Name = name;
}

public int getBalance() {
	return Balance;
}

public void setBalance(int balance) {
	this.Balance = balance;
}

public int credit(int amount) {
	System.out.println("add amount to balance");
	Balance = Balance + amount;
	return Balance;
}
	public int debit(int amount) {
		if(amount<=Balance) {
			System.out.println("substract amount \n");
		Balance = Balance - amount;
		}
		else {
			System.out.println("exceeded amount \n");
		}
		return Balance;
	}
	public int Transfer(int another ,int amount) {
		if(amount<=Balance) {
			System.out.println("transfer amount \n");
			Balance = Balance - amount;
		}
		else {
			System.out.println("exceeded amount \n");
		}
		return Balance;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", Balance=" + Balance + "]";
	}
	
}

