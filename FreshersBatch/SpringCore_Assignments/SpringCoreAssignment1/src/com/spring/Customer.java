package com.spring;
public class Customer {

	public String customerId;
	public String customerName;
	public long customerContact;
	public Address customerAddress;
	
	public Customer() {
		super();
	}

	public Customer(String customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	 
	public void Customerdetails() {
		
		System.out.println("Customer Id - "+customerId);
		System.out.println("Customer Name - "+customerName);
		System.out.println("Customer Contact - "+customerContact);
		System.out.println("Customer Address - "+getCustomerAddress().getStreet());
		System.out.println("Customer City - "+getCustomerAddress().getCity());
		System.out.println("Customer State - "+getCustomerAddress().getState());
		System.out.println("Customer Zip - "+getCustomerAddress().getZip());
		System.out.println("Customer Country - "+getCustomerAddress().getCountry());
		
	}
	
}
