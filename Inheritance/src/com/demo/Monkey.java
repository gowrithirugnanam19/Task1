package com.demo;

public class Monkey extends Tiger implements Animal{
   public void eat() {
	   super.eat();
	   System.out.println("Eats Bananas");
   }
   public static void main(String[] args) {
	Monkey m=new Monkey();
	m.eat();
	m.run();
	System.out.println(Animal.legs);
}
}
