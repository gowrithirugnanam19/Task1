package com.demo;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Eats only Non Veg");
	}
	@Override
	public void run() {
		System.out.println("Runs Fast");
	}
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.run();
		System.out.println(Animal.legs);
	}
}
