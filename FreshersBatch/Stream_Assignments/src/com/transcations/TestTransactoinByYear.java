package com.transcations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.trades.Trader;
public class TestTransactoinByYear {

	public static void main(String[] args) {
		
		List<Transaction> list3 = new ArrayList<>();
		list3.add(new Transaction(new Trader("Sai","Hyderabad"),2011,1000));
		list3.add(new Transaction(new Trader("Krishna","Delhi"),2019,2000));
		list3.add(new Transaction(new Trader("SaiKrishna","Hyderabad"),2011,3000));
		list3.add(new Transaction(new Trader("Chinna","Delhi"),2018,4000));

		System.out.println("Transactions in Year 2011 : ");
		System.out.println("----------------------------");
		List<Trader> l3 =list3.stream().filter(s->s.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getTrader).collect(Collectors.toList());
		l3.forEach(System.out::println);

	}

}
