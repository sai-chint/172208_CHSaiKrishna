package com.news;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestNewsBudgetComment {

	public static void main(String[] args) {
		List<News> list1=new ArrayList<>();
		
		list1.add(new News(918,"ABC","New Budget " , "Prime Minister Narender Modi's Party BJP is going to give a clarity on budget."));
		list1.add(new News(1417,"ABC","Elections are in Progress " , "Notification will be releases in March."));
		list1.add(new News(1417,"DEF","budget is released " , "The budget is of 23LAKH CRORES."));
		list1.add(new News(100,"def","sports " , "27th Feb is 1st ODI of IND vs AUS."));
		
		List<News> list2=list1.stream().filter(s->s.getCommentByUser().contains("budget")).collect(Collectors.toList());
		long l=list2.stream().count();
		System.out.println("Budget : "+l);
		System.out.println("********************************************");
		
	}

}
