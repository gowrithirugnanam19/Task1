package com.demo;

public class Demo {
public static void main(String[] args) {
	Bird b=new Bird() {
		@Override
		public void eat() {
			System.out.println("Eats Insects");
		}
		@Override
		public void fly() {
			System.out.println("Flies Fast");
		}	
	};
	b.eat();
	b.fly();
}
}
