package com.student;

import com.person.Person;

public class Student extends Person {

	int sum=0;
	int count=0;
	int numcourses;
	String Courses[]= {"CSE","IT","EEE","MIN","ECE"};
	int Grades[]= {70,60,70,50,60};

	public Student(String Name,String Address,int noofcourses)
{
	super(Name,Address);
	this.numcourses=numcourses;
}
	public void addCourseGrade()
{
	 System.out.println("Courses : ");
	 for(int i=0;i<Courses.length;i++)
	 {
		 System.out.println(Courses[i]);
	 }
	 
}
public void printGrade()
{
	  	 System.out.println("Grades : ");
	 for(int i=0;i<Grades.length;i++)
	 {
		 sum=sum+Grades[i];
		 count++;
		System.out.println(Grades[i]);
	 }
}
public double avgGrade()
{
	 
	 double avg=sum/count;
	 System.out.println("Average grade : "+avg);
	return avg;
}
public String toString()
{
	return "NAME : "+ Name + " Address : " + Address ;
}
}
