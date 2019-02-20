package com.trades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestTraderUniqueCities {

	public static void main(String[] args) {
		
		List<Trader> list1=new ArrayList<>();
		list1.add(new Trader("Sai", "Hyderabad"));
		list1.add(new Trader("Krishna","Indore"));
		list1.add(new Trader("SaiKrishna", "Hyderabad"));
		list1.add(new Trader("Chinna", "Pune"));	
		
		System.out.println("Unique Cities are : ");
		System.out.println("-------------------------");
		List<String> n1=list1.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
		n1.forEach(System.out::println);
				
	}

}
