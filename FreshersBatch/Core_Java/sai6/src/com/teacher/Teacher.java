package com.teacher;

import com.person.Person;

public class Teacher extends Person {

	private int numofcourses;
	private String Courses[]= {"C","C++","DBMS","DS"};
	
	public Teacher(String name,String Address)
	{
		super(name,Address);
	}
	public boolean addcourse(String course)
	{
		for(int i=0;i<Courses.length;i++)
		{
		   if(course.equals(Courses[i]))
		   {
			return false;
		   }
    	}
		return true;
	}
   public boolean removecourse(String course)
   {
	   for(int i=0;i<Courses.length;i++)
		{
		   if(course.equals(Courses[i]))
		   {
			return true;
		   }
         }
	   		System.out.println("Course not available");
	   	return false;
   }
   
   public String toString()
   {
	   return "NAME : "+ Name + " Address : " + Address ;
   }
}
