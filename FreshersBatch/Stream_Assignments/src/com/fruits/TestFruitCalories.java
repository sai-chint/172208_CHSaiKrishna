package com.fruits;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestFruitCalories {

	public static void main(String[] args) {
			List<Fruits> list = new ArrayList<>();
			list.add(new Fruits("Apple",170,100,"Red"));
			list.add(new Fruits("Banana",130,40,"Yellow"));
			list.add(new Fruits("Mango",70,40,"Yellow"));
			list.add(new Fruits("Grapes",80,50,"Green/Black"));
			list.add(new Fruits("WaterMelon",140,50,"Red"));
			
			List<String> l=list.stream().sorted(Comparator.comparing(Fruits::getCalories).reversed())
					.filter(s->s.getCalories()<100).map(Fruits::getName).collect(Collectors.toList());
			l.forEach(System.out::println);	
		
	}

}
