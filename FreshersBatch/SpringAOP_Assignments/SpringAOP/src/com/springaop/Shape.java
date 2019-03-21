package com.springaop;

public class Shape {

	private Circle circle;
	private Triangle triangle;
	
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Shape(Circle circle, Triangle triangle) {
		super();
		this.circle = circle;
		this.triangle = triangle;
	}



	public Circle getCircle() {
		
		System.out.println("****");
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Triangle getTriangle() {
		System.out.println("**&&&&&&&&&&&&&&**");

		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
