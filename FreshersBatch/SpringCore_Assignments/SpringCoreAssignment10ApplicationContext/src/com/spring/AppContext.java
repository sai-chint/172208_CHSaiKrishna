package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContext implements ApplicationContextAware, BeanNameAware {

	public String name;
	public String age;
	public ApplicationContext context = null;
	
	public AppContext() {
		super();
		
	}
	
	public AppContext(String name, String age) {
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
	
		System.out.println("Your name is : "+name+" and your age is : "+age);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanname) {
		
		System.out.println("Bean Name is : "+beanname);
		
	}


	
}
