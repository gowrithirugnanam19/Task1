package com.example;
class A{
	A(){
		System.out.println("A class constructor");
	}
	A(int x){
		System.out.println("The value of x is "+x);
	}
}
public class B extends A{
	B(){
		super(5);
		System.out.println("B class constructor");
	}
	B(int x){
		System.out.println("The value of x is "+x);
	}
	public static void main(String[] args) {
		new B();
		new B(22);
		}
}

//the method should not have any arguments,or same arguments such as default
//it will come as error example
// A(int x){
//system.out.print(the value of x is +x);
//it prints error because class B has no argument.