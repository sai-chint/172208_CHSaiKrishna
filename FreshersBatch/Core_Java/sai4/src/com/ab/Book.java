package com.ab;

public class Book {
private String name;
private Author author;
private double price;
private int qty=0;

public Book() {
	
}

public Book(String name,Author author ,double price) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
}
public Book(String name,Author author ,double price, int qty) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
	this.qty = qty;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Book : [Name= " + name + ", " + author + ", price=" + price + ", qty=" + qty + "]\n";
}


}
