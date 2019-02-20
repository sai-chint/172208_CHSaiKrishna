package com.trades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTraderFromParticularCity {

	public static void main(String[] args) {
		
		List<Trader> list2=new ArrayList<>();
		list2.add(new Trader("Sai", "Hyderabad"));
		list2.add(new Trader("Krishna","Indore"));
		list2.add(new Trader("SaiKrishna", "Hyderabad"));
		list2.add(new Trader("Chinna", "Pune"));
		
		System.out.println("Traders From Pune : ");
		System.out.println("-------------------------");
		List<Trader> n2=list2.stream().filter(s->s.getCity()=="Pune").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		n2.forEach(System.out::println);		

	}

}
