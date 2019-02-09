package com.phn;

import java.util.Scanner;

public class FriendTest {

	public static void main(String[] args) {
			  

	
	/*	System.out.println("Enter the name which you want to search");
		Scanner kb=new Scanner(System.in);
		String fname = kb.next();
		Friend F=new Friend(fname);
		F.search();
	*/

			Friend F=new Friend();
			F.addContactName();
			F.addContactNumber();
			System.out.println("Enter the name which you want to search");
			Scanner kb=new Scanner(System.in);
			F.search(kb.next());
		
	}

}
