package com.stu;

public class Student {
	
	String name;
	 String address;
	 int numCourses=0;
	 String[] courses = {"HTML","CSS","BOOTSTRAP"};
	 int[] grades= {918,1819,916};
	 
	 public Student() {
		 
	 }
	 
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getAddress() {
	  return address;
	 }
	 public void setAddress(String address) {
	  this.address = address;
	 }
	 public int getNumCourses() {
	  return numCourses;
	 }
	 public void setNumCourses(int numCourses) {
	  this.numCourses = numCourses;
	 }
	 public String[] getCourses() {
	  return courses;
	 }
	 public void setCourses(String[] courses) {
	  this.courses = courses;
	 }
	 public int[] getGrades() {
	  return grades;
	 }
	 public void setGrades(int[] grades) {
	  this.grades = grades;
	 }
	 public Student(String name, String address)
	 {
	  this.name=name;
	  this.address=address;
	 }
	 
	 public String toString()
	 {
	  return name +" "+ address;
	  
	 }
	 public void addCourseGrade()
	 {
	  for(int i=0; i<courses.length;i++)
	  {
	   System.out.println("course : " + courses[i] + ", grade : "+ grades[i]);
	  }
	 }
	 public void printGrades()
	 { 
	  this.grades=grades;
	  this.courses=courses;
	  for(int i=0;i<grades.length;i++)
	   System.out.println("name : " +name + " course : " + courses[i] +", grade : " + grades[i]);
	 }
	 public void getAverageGrade()
	 {
	  int avg=0;
	 for(int i=0;i<grades.length;i++)
	 {
	  avg=avg+grades[i];
	  
	 }
	 System.out.println("Average : " +avg/3);
	 }
}