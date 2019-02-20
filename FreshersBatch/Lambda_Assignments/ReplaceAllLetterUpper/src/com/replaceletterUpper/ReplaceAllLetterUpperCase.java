package com.replaceletterUpper;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllLetterUpperCase {
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("sai");
		array.add("krishna");
		array.add("saiKrishna");
		array.add("chinna");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
		
		array.replaceAll(sai -> sai.toUpperCase());
		array.forEach(System.out::println);
	}

}
