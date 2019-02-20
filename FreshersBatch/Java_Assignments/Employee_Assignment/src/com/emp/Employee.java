package com.emp;

public class Employee {
	String name;
	int id;
	double salary;
 
 	public Employee(String name, int id, double salary) {
	super();
		this.name = name;
		this.id = id;
		this.salary = salary;
}

 	public Employee() {
		
	}
 	public Employee(String name)
 	{
 		this.name=name;
 	}

	public String getName() {
 		return name;
}

 	public String setName(String name) {
		this.name = name;
		return name;
	}



	public int getId() {
 		return id;
}
	public void setId(int id) {
		this.id = id;
	}

 	public double getSalary() {
 		return salary;
}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
 	public void details() {
 	System.out.println("Employee Name : " +this.name);
    System.out.println("Employee ID : "+ this.id);
    System.out.println("Employee Salary : " + this.salary);
 	}
@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}
 
 
}
