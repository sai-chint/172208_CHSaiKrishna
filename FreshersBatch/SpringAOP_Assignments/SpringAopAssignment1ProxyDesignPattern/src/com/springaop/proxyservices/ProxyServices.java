package com.springaop.proxyservices;

import com.springaopproxy.models.Circle;
import com.springaopproxy.models.Triangle;

import cpm.springaop.ProxyDesignPattern;

public class ProxyServices {

public Object getBean(String beanType) {
		
		if(beanType.equals("proxy")) return new ProxyDesignPattern();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triangle")) return new Triangle();		
		return null;
	}

	
}
