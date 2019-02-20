package com.lambda;

public class MyLambdaArthimatic {

	public static void main(String[] args) {
		MyInterfaceArthimatic s = (m,n) -> 
		{
			System.out.println(m+n);
			System.out.println(m-n);
			System.out.println(m*n);
			System.out.println(m/n);
		};
		s.arthimatic(10, 5);
	}
}
