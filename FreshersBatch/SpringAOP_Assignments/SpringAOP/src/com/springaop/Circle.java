package com.springaop;

public class Circle {
	
	private String name;

	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("*****");
		return name;
	}
	
}
