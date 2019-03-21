package com.spring;

public class Address {
	
	public String street;
	public String city;
	public String state;
	public String zip;
	public String country;
	
	public Address() {
		super();
	}

	public Address(String street, String city, String state, String zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void Addressdetails() {
		
		System.out.println("Street  - "+street);
		System.out.println("City    - "+city);
		System.out.println("State   - "+state);
		System.out.println("Zip     - "+zip);
		System.out.println("Country - "+country);
			
	}
	
}
