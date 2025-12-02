package com.ex;

public class Calc {
public int add(int x,int y) { // non static method so creating a instance variable 
	return (x+y);  // for accesing the add and cube methods.
}
public int cube(int x) {
	return (x*x*x);
}

}
