package com.example;

public class Dog {
	int legs=4;//Instance variable
	void eat()//Instance method
	{
		System.out.println("Eat bones");
	}
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println("Dog has "+d.legs+" legs");
	d.eat();
}

}
