package com.springaopproxy.test;

import com.springaop.proxyservices.ProxyServices;

import cpm.springaop.ProxyDesignPattern;

public class Test {

	public static void main(String[] args) {
		
		ProxyServices ps= new ProxyServices();
		ProxyDesignPattern pdp= (ProxyDesignPattern) ps.getBean("proxy");
		
		pdp.getCircle();
		pdp.getTriangle();
		
	}

}
