package com.arrayEmp;

import java.util.Scanner;

import com.emp.Employee;

public class ArrayEmployee {

	// public void addNewEmployee() {

	// }

	Employee[] emp = new Employee[3];
	
	Scanner RD=new Scanner(System.in);
	public void addNewEmployee() 
	{
		for(int i=0;i<emp.length;i++)
		{
		System.out.println("enter employee name:");
		String s=RD.next();
		System.out.println("enter employee Id:");
		int id=RD.nextInt();
		System.out.println("enter employee salary:");
		double d=RD.nextDouble();
		Employee e=new Employee(s,id,d);
		emp[i]=e;
		}
	}
	public void Display() 
	{
		for(Employee e:emp)
		{
			System.out.println("name:"+e.getName()+"Id:"+e.getId()+"Salary:"+e.getSalary());
		}
		
	}
	public String Search() 
	{
		System.out.println("enter searching name:");
		String names=RD.next();
		for(Employee e:emp)
		{
			if(e.getName().equals(names)) 
			{
				return ("Name : "+e.getName()+"Id: "+e.getId()+"Salary: "+e.getSalary());
			}
				
		}		
	return ("no details");
	}
	

}
