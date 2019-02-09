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
