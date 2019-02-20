package com.fruits;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestFruitParticularColor {

	public static void main(String[] args) {
		
		List<Fruits> list2 = new ArrayList<>();
		list2.add(new Fruits("Apple",170,100,"Red"));
		list2.add(new Fruits("Banana",130,40,"Yellow"));
		list2.add(new Fruits("Mango",70,40,"Yellow"));
		list2.add(new Fruits("Grapes",80,50,"Green/Black"));
		list2.add(new Fruits("WaterMelon",130,50,"Red"));
		
		List<String> l2=list2.stream().sorted(Comparator.comparing(Fruits::getPrice)).filter(i->i.getColor()=="Red")
				.map(Fruits::getName).collect(Collectors.toList());
		l2.forEach(System.out::println);
	}

}
