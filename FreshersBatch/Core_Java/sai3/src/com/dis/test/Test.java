package com.dis.test;

import java.util.Date;
import java.util.Scanner;

import com.dis.Customer;
import com.dis.Visit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter Name  ");
		String name=kb.next();
		System.out.println("enter member ");
		boolean member=kb.nextBoolean();
		System.out.println("enter membertype ");
		String membertype=kb.next();
		System.out.println("Enter service expenses  ");
		double se=kb.nextDouble();
		System.out.println("Enter product expenses  ");
		double pe=kb.nextDouble();
		Customer c= new Customer(name,member,membertype);
		Visit v= new Visit (c,new Date());
		v.setProductExpense(pe);
		v.setServiceExpense(se);
		System.out.println("Total Expense by "+v.getCustomerName() + " = " + v.getTotalExpense());
		System.out.println(c.toString());
		System.out.println(v.toString());
	}

}
