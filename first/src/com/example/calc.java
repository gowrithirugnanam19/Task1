package com.example;

public class calc {
	static void add(int x,int y) {
		int z=x+y;
		System.out.println("The addition is "+z);
	}
	static int cube(int x) {
		return(x*x*x);
	}
public static void main(String[] args) {
	calc.add(22,33);
	System.out.println(calc.cube(5));
}
}
