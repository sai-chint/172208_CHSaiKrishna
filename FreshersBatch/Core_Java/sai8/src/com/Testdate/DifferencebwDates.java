package com.Testdate;

import java.util.Scanner;

import com.date.Date;

public class DifferencebwDates {
	public static void main(String[] args) {
		System.out.println("Enter your 1st date as DD/MM/YYYY : ");
		Scanner kb = new Scanner(System.in);
		int DD1 = kb.nextInt();
		int MM1 = kb.nextInt();
		int YYYY1 = kb.nextInt();
		Date d = new Date(YYYY1,null);
		d.year();
		System.out.println("Enter your 2nd date as DD/MM/YYYY : ");
		int DD2 = kb.nextInt();
		int MM2 = kb.nextInt();
		int YYYY2 = kb.nextInt();
		Date d1 = new Date(null,YYYY2);
		d1.year();
	}
}
