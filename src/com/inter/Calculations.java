package com.inter;
interface Operations{
	public void compute();
}
class add implements Operations{
	int a=5,b=10;
	@Override
	public void compute() {
		int c=a+b;
		System.out.println("The addition of two numbers is "+c);
	}
}
class sub implements Operations{
    int a=10,b=5;
	@Override
	public void compute() {
		int c=a-b;
		System.out.println("The subtraction of two numbers is "+c);
	}
}
public class Calculations extends sub {
	public void display() {
		System.out.println("Performance of Operations");
	}
	public static void main(String[] args) {
		Calculations d=new Calculations();
		d.compute();
		d.display();
	}
}
