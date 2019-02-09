package com.phn;

import java.util.ArrayList;
import java.util.Scanner;

public class Friend {	
	/*
	
public String fname;
public Friend(String fname) {
		super();
		this.fname = fname;
	}
	
	 public void search() {
	 	if(fname.equals("sai")) {
	 		
	 		System.out.println("Name : Sai \nMobile NO. : 9652241014 , 9949018150 \n");
	 	}
		else if(fname.equals("krishna")){
			
			 System.out.println("Name : Krishna \nMobile NO. : 9182517235 , 9177903740 \n");
		}
		else {
			System.out.println("Name not found \n");
		}
}*/
	int n;
	 ArrayList<String> a = new ArrayList<>();
	 ArrayList<String> al = new ArrayList<>();
	 ArrayList<String> al2 = new ArrayList<>();	
	
	void addContactName() {
		Scanner kb=new Scanner(System.in);
		System.out.println("How many freinds do u want to add");
		n=kb.nextInt();
		System.out.println("Add contacts");
		for(int k=0;k<n;k++) {
		 a.add(k,kb.next());
		}
	}
	void addContactNumber() {
		Scanner kb=new Scanner(System.in);
		for(int k=0;k<n;k++) {
		System.out.println("add contact 1 of "+a.get(k));
		 al.add(k,kb.next());
		System.out.println("add contact 2 of "+a.get(k));
		 al2.add(k,kb.next());
		}
	}
	public void search(String name) {	
		 int i = a.indexOf(name);
		 if(i<0) {
			 System.out.println("not found name");
		 }
		 else {
			 System.out.println(al.get(i)+" , "+al2.get(i));
		 }
	}
   
}
