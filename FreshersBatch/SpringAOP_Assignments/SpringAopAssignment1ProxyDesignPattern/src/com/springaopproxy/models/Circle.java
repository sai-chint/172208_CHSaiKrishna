package com.springaopproxy.models;

public class Circle {

	private String name;
	
	public Circle() {
		super();
		
	}

	public Circle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		System.out.println("Hello! Proxy Design Pattern."+name);
		return name;
	}
}
