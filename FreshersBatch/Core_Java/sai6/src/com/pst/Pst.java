package com.pst;

import java.util.Scanner;

import com.person.Person;
import com.student.Student;
import com.teacher.Teacher;

public class Pst {

	public static void main(String[] args) {
		
		Teacher T=new Teacher("Sai","7-145");	
		Student S=new Student("Krishna","7-12", 4);
		Person P=new Person("Chinna","Hyd");
		System.out.println("Person Details");
		System.out.println("Name : "+P.getName());
		System.out.println("Address : "+P.getAddress());
		System.out.println(P.toString());
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Teacher Course");
		String course=kb.next();
		System.out.println(T.addcourse(course));
		System.out.println("\n");
		System.out.println("Enter A course to remove");
		String course1=kb.next();
		System.out.println(T.toString());
		System.out.println(T.removecourse(course1));
		S.addCourseGrade();
		S.printGrade();
		S.avgGrade();
	}

}
