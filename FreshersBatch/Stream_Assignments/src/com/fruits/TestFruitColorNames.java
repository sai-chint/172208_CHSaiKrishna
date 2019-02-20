package com.fruits;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestFruitColorNames {

	public static void main(String[] args) {
		List<Fruits> list1 = new ArrayList<>();
		list1.add(new Fruits("Apple",170,100,"Red"));
		list1.add(new Fruits("Banana",130,40,"Yellow"));
		list1.add(new Fruits("Mango",70,40,"Yellow"));
		list1.add(new Fruits("Grapes",80,50,"Green/Black"));
		list1.add(new Fruits("WaterMelon",130,50,"Red"));
		
		List<Fruits> l1 = list1.stream().sorted(Comparator.comparing(Fruits::getColor)).collect(Collectors.toList());
		l1.forEach(a->System.out.println("Fruit : "+a.getName()+"--->Color : "+a.getColor()));
		
	}

}
