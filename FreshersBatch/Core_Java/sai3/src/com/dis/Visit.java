package com.dis;

import java.util.Date;

public class Visit {

private static Customer Name;	
private Date date; 
private static double serviceExpense;
private static double productExpense;

public Visit(Customer Name,Date date) {
	this.Name = Name;
	this.date = date;
}

public String getCustomerName() {
	return Name.getName();
}
	
public double getServiceExpense() {
	return serviceExpense;
}
public void setServiceExpense(double serviceExpense) {
	this.serviceExpense = this.serviceExpense + serviceExpense;
}
public double getProductExpense() {
	return productExpense;
}
public void setProductExpense(double productExpense) {
	this.productExpense = this.productExpense + productExpense;
}

public static double getTotalExpense() {
	if(Name.isMember()==true) {
	return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(Name.getMemberType()))) +
			   (productExpense - (productExpense * DiscountRate.getProductDiscountRate(Name.getMemberType())));
	}
	else return serviceExpense + productExpense;
	}
@Override
public String toString() {
	return "Visit [" + "Customer Name = "+ Name.getName()+ "\nCustomer Member = "+Name.isMember()+
			"\nCustomer MemberType = "+Name.getMemberType()+"\nDate = "+ date +
			"\nserviceExpense = "+serviceExpense +
			"\nproductExpense = "+productExpense +
			"]";
	
}

}
