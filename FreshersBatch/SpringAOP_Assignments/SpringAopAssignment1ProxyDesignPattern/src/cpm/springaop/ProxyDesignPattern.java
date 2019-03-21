package cpm.springaop;

import com.springaopproxy.models.Circle;
import com.springaopproxy.models.Triangle;

public class ProxyDesignPattern {
	
	private Circle circle;
	private Triangle triangle;

	public ProxyDesignPattern() {
		super();
		
	}

	public ProxyDesignPattern(Circle circle, Triangle triangle) {
		super();
		this.circle = circle;
		this.triangle = triangle;
	}

	public Circle getCircle() {
		
		System.out.println("getCircle method is called");
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
		System.out.println(circle.getName());
	}
	
	public Triangle getTriangle() {
		System.out.println("getTriangle method is called");
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
