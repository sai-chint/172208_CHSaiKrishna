package com.transcations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.trades.Trader;
public class TestTransactionPrintAll {

	public static void main(String[] args) {
		
		List<Transaction> list1 = new ArrayList<>();
		list1.add(new Transaction(new Trader("Sai","Hyderabad"),2011,1000));
		list1.add(new Transaction(new Trader("Krishna","Delhi"),2019,2000));
		list1.add(new Transaction(new Trader("SaiKrishna","Hyderabad"),2011,3000));
		list1.add(new Transaction(new Trader("Chinna","Delhi"),2018,4000));
		
		System.out.println("Transactions of All Trader in Delhi : ");
		System.out.println("--------------------------------------");
		List<Transaction> l=list1.stream().filter(s->s.getTrader().getCity()=="Delhi").collect(Collectors.toList());
		l.forEach(e->System.out.println("Transaction value is: "+e.getValue()+" done by "+e.getTrader().getName()));
		
	}

}
