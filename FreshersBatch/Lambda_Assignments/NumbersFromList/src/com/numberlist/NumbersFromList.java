package com.numberlist;

import java.util.ArrayList;
import java.util.List;

public class NumbersFromList {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		Runnable r = () -> { array.stream().forEach(System.out::println); 
		};
		new Thread(r).run();
	}

}
