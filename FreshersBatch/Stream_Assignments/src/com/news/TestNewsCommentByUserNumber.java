package com.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNewsCommentByUserNumber {

	public static void main(String[] args) {
		List<News> list3=new ArrayList<>();
		
		list3.add(new News(918,"ABC","New Budget " , "Prime Minister Narender Modi's Party BJP is going to give a clarity on budget."));
		list3.add(new News(1417,"ABC","Elections are in Progress " , "Notification will be releases in March."));
		list3.add(new News(1417,"DEF","budget is released " , "The budget is of 23LAKH CRORES."));
		list3.add(new News(100,"def","sports " , "27th Feb is 1st ODI of IND vs AUS."));
			
		Map<Object, Long> map2 = list3.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println(map2);
			
	}

}
