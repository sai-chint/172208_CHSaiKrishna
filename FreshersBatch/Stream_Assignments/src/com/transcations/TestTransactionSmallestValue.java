package com.transcations;

import java.util.ArrayList;
import java.util.List;


import com.trades.Trader;
public class TestTransactionSmallestValue {

	public static void main(String[] args) {
		
		List<Transaction> list2 = new ArrayList<>();
		list2.add(new Transaction(new Trader("Sai","Hyderabad"),2011,1000));
		list2.add(new Transaction(new Trader("Krishna","Delhi"),2019,2000));
		list2.add(new Transaction(new Trader("SaiKrishna","Hyderabad"),2011,3000));
		list2.add(new Transaction(new Trader("Chinna","Delhi"),2018,4000));
		
		System.out.println("Smallest Value : ");
		System.out.println("-----------------------");
		Transaction min = list2.stream().min((s1,s2)->Integer.compare(s1.getValue(), s2.getValue())).get();
		System.out.println(min.getValue());
		
	}

}
