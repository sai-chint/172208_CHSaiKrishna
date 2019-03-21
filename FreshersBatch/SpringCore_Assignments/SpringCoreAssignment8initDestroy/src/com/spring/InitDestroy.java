package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroy implements InitializingBean, DisposableBean  {

	public String name;
	public String age;
	
	public InitDestroy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InitDestroy(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void show() {
		
		System.out.println("Your name is : "+name+" & your age is : "+age);
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialing Beans init : ");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean has been Destroyed.");
		
	}
	
	public void myinit() {
		
		System.out.println("My Bean is initialized :");
		
	}
	
	public void clean() {
		
		System.out.println("My Bean has been destroyed .");
		
	}
	
}
