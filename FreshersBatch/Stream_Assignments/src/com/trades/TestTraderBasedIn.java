package com.trades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestTraderBasedIn {

	public static void main(String[] args) {
		
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("Sai", "Hyderabad"));
		list.add(new Trader("Krishna","Indore"));
		list.add(new Trader("SaiKrishna", "Hyderabad"));
		list.add(new Trader("Chinna", "Pune"));
				
		System.out.println("Traders based in Indore are : ");
		System.out.println("---------------------------------");
		List<String> n=list.stream().filter(s->s.getCity()=="Indore").map(Trader::getName).collect(Collectors.toList());
		n.forEach(System.out::println);
				
	}

}
