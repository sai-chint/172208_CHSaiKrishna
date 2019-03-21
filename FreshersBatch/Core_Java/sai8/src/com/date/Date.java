package com.date;

public class Date {
 public String date1;
 public String date2;
 public String diff;
 int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
 int[] array2 = {31,28,31,30,31,30,31,31,30,31,30,31};
private int YYYY1;
private int YYYY2;
 
 public Date(String date1,String date2) {
	  this.date1=date1;
	  this.date2=date2; 
  }

public Date(int YYYY1,int YYYY2) {
	this.YYYY1=YYYY1;
	this.YYYY2=YYYY2;
}

public Date(int yYYY12, Object date22) {
	
}

public Date(Object date12, int yYYY22) {
	
}

public String getDate1() {
	return date1;
}
public String getDate2() {
	return date2;
}
public void year() {
	if((YYYY1)%4==0) {
		array[2] = 29;
	}
	if((YYYY2)%4==0) {
		array2[2] = 29;
	}
}

 
}
