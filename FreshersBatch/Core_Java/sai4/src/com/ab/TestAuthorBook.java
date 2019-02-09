package com.ab;

public class TestAuthorBook {

	public static void main(String[] args) {
			Author a = new Author("sai","krishnasai178096@gmail.com",'M');
			//Book b= new Book();
			Book b1 = new Book("krishna",a,344.00);
			Book b2 = new Book("chinna",a,766.00,1);
			System.out.println(a.toString());
			System.out.println(b1.toString());
			System.out.println(b2.toString());
	}

}
