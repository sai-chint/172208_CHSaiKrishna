package com.account;

import java.util.ArrayList;
import java.util.Scanner;

import com.admin.Admin;

public class Account {

	String Name;
	String Address;
	String MobileNo;
	String Email;
	String AccType;
	double OpeningBalance;
	Long GenerateAccNo;
	boolean Req=false;
	public Account(String name, String address, String mobileNo, String email, String accType, double openingBalance,
			Long generateNo, boolean req) {
		super();
		Name = name;
		Address = address;
		MobileNo = mobileNo;
		Email = email;
		AccType = accType;
		OpeningBalance = openingBalance;
		GenerateAccNo = generateNo;
		Req = req;
	}
	public Account() {
	
	}
	
	ArrayList<String> al = new ArrayList<>();
	
	public void Acc() {
		char n='\0';
		System.out.println("case 1 : To specify the fields ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("case 2 : To check your details as you specified in case 1 : ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("case 3 : Enter if do you to create a new account after specifying the fields in case 1 as true/false :");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("case 4 : Exit :\n------------------------------------------------------------------------------\n");		
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.println("\n*****************************************************");
			System.out.println("Enter your choice :\n-----------------------------------------------------------");
			n=kb.next().charAt(0);
			switch(n) {
	case '1' :
		System.out.println("\nEnter the fields specified :");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Name : ");
		Name=kb.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Address :");
		Address=kb.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Mobile NO. :");
		MobileNo=kb.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Email :");
		Email=kb.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enetr Account Type :");
		AccType=kb.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Opening Balance :");
		OpeningBalance=kb.nextDouble();
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter Generate Account No. :");
		GenerateAccNo=kb.nextLong();
		System.out.println("-------------------------------------------------------");
		break;
	case '2':
		System.out.println("\nName = " + Name + "\nAddress = " + Address + "\nMobileNo = " + MobileNo + "\nEmail = " + Email + "\nAccType = " + AccType + "\nOpeningBalance = " + OpeningBalance + "\nGenerateNo = " + GenerateAccNo);
		break;
	case '3' :
		Scanner s= new Scanner(System.in);
		if(s.nextBoolean()==true) {
			Admin Ad = new Admin();
			Ad.details();
		}
		else {
			System.out.println("Account not created.");
		}
		break;
	case '4':
		System.out.println("Succesfully exited.");
		break;
	default:
		System.out.println("Invalid choice. ");
		break;
	    }
	}while(n!='4');
		System.out.println("Thank you for using our services.");
}

}
