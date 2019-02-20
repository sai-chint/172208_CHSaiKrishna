package com.news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNewsUserMaxComments {

	public static void main(String[] args) {
		
		List<News> list2=new ArrayList<>();
		
		list2.add(new News(918,"ABC","New Budget " , "Prime Minister Narender Modi's Party BJP is going to give a clarity on budget."));
		list2.add(new News(1417,"ABC","Elections are in Progress " , "Notification will be releases in March."));
		list2.add(new News(1417,"DEF","budget is released " , "The budget is of 23LAKH CRORES."));
		list2.add(new News(100,"def","sports " , "27th Feb is 1st ODI of IND vs AUS."));
		
		Map<Object, Long> map1 = list2.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		long maxval1=(Collections.max(map1.values()));
		for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
		{

			if(entry1.getValue()==maxval1) 
			{

			System.out.println(entry1.getKey());
			
			}	
			
	}
		
	}
}
