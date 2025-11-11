package com.example;

public class Tiger extends Animal{
	int legs=2;
	void eat() {
		System.out.println("Animal has "+super.legs+" legs");
		super.eat();
		System.out.println("Eats only Non Veg");
	}
	void run() {
		System.out.println("Runs fast");
	}
public static void main(String[] args) {
	Tiger t=new Tiger();
	t.run();
	t.eat();
	System.out.println("Tiger has "+t.legs+" legs");
}
}
