package com.dis;

public class Customer {
 private String Name;
 private String memberType;
 private boolean member=false;
 
 public Customer(String Name,boolean member,String memberType) {
	 this.Name = Name;
	 this.member = member;
	 this.memberType = memberType;
 }
 public void display(){
 	if(Name.equals("sai")) {
 		member=true;
 		memberType="Gold";
 		System.out.println("Name : Sai , Member : true , MemberType : Gold \n");
 	}
	else if(Name.equals("krishna")){
		member=true;
 		memberType="Silver";
		 System.out.println("Name : Krishna , Member : true , MemberType : Silver \n");
	}
	else if(Name.equals("chinna")) {
		member=false;
 		memberType="Premium";
		System.out.println("Name : Chinna , Member : false , MemberType : Premium \n");
	}
	else {
		System.out.println("Name : not found , Member : not found , MemberType : not found \n");
	}
 }
public Customer(String name) {
	this.Name = name;
}
public String getName() {
	return this.Name;
}

public String getMemberType() {
	return this.memberType;
}
public void setMemberType(String memberType) {
	this.memberType = memberType;
}
public boolean isMember() {
	return member;
}
public void setMember(boolean member) {
	this.member = member;
}
@Override
public String toString() {
	return "Customer [Name = " + Name + ", memberType = " + memberType + ", member = " + member + "]";
}
 
}
