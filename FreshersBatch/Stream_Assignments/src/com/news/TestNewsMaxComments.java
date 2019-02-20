package com.news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNewsMaxComments {

	public static void main(String[] args) {
	
		List<News> list=new ArrayList<>();
		
		list.add(new News(918,"ABC","New Budget " , "Prime Minister Narender Modi's Party BJP is going to give a clarity on budget."));
		list.add(new News(1417,"ABC","Elections are in Progress " , "Notification will be releases in March."));
		list.add(new News(1417,"DEF","budget is released " , "The budget is of 23LAKH CRORES."));
		list.add(new News(100,"def","sports " , "27th Feb is 1st ODI of IND vs AUS."));
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));

		long maxval=(Collections.max(map.values()));

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {

		if(entry.getValue()==maxval) {

				System.out.println(entry.getKey());

			}	
		
		}
	}

}
