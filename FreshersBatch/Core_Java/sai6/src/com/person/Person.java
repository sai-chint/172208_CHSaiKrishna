package com.person;

public class Person {

	
	protected String Name;
	protected String Address;
	
	public Person(String Name, String address) 
	{
		//super();
		this.Name = Name;
		this.Address = address;
	}

	
	public String getName()
	{
		return Name;
	}
	public void setName()
	{
		this.Name=Name;
	}
	public String getAddress() 
	{
		return Address;
	}
	public void setAddress()
	{
		this.Address=Address;
	} 
	public String toString()
	{
		return  "NAME : " + Name + " " + " Address : " + Address ;
	}
}
