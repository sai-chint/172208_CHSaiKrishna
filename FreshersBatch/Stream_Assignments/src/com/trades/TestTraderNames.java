package com.trades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTraderNames {

	public static void main(String[] args) {
		
		List<Trader> list3=new ArrayList<>();
		list3.add(new Trader("Sai", "Hyderabad"));
		list3.add(new Trader("Krishna","Indore"));
		list3.add(new Trader("SaiKrishna", "Hyderabad"));
		list3.add(new Trader("Chinna", "Pune"));
	
		System.out.println("Traders Name : ");
		System.out.println("-------------------------");
		List<Trader> n3=list3.stream().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		String sai=n3.stream().map(Trader::getName).collect(Collectors.joining("\n"));
		System.out.println(sai);	
	
	}

}
