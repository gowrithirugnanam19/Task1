package com.inter;

class shop1 implements Drinks{
	@Override
	public void Tea() {
		System.out.println("For a relief take a tea");
	}
	@Override
	public void coffee() {
		System.out.println("Have a coffee,take a break");
	}
}
class shop2 implements Juice{
	@Override
	public void iced() {
		System.out.println("Drink a iced juice and be cool");
	}
	@Override
	public void noniced() {
		System.out.println("Drink is good");
	}
}
public class Person extends shop1{
public static void main(String[] args) {
	shop1 s1=new Person();
	s1.Tea();
	s1.coffee();
}
}
