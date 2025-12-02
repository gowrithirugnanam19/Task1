package com.ex;

public class Ex {
 record Employee(int empid,String empname) { //this method introduced in java/jdk 17 features 
	 
 }
 public static void main(String[] args) {
	Employee e=new Employee(101,"Suriya");
	System.out.println(e);
}
}
