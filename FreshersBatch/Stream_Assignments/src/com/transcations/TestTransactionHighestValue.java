package com.transcations;

import java.util.ArrayList;
import java.util.List;

import com.trades.Trader;

public class TestTransactionHighestValue {

	public static void main(String[] args) {
		
		List<Transaction> list = new ArrayList<>();
		list.add(new Transaction(new Trader("Sai","Hyderabad"),2011,1000));
		list.add(new Transaction(new Trader("Krishna","Delhi"),2019,2000));
		list.add(new Transaction(new Trader("SaiKrishna","Hyderabad"),2011,3000));
		list.add(new Transaction(new Trader("Chinna","Delhi"),2018,4000));
		
		System.out.println("Highest Value : ");
		System.out.println("-----------------------");
		Transaction max = list.stream().max((s1,s2)->Integer.compare(s1.getValue(), s2.getValue())).get();
		System.out.println(max.getValue());

	}

}
