package com.demo;

public class Bat implements Bird,Animal{

	@Override
	public void run() {
		System.out.println("Runs slowly");
	}
	@Override
	public void eat() {
		System.out.println("Eats flowers");
	}
	@Override
	public void fly() {
		System.out.println("Flies fast");
	}
	public static void main(String[] args) {
		Bat b=new Bat();
		b.run();
		b.eat();
		b.fly();
		System.out.println(Animal.legs);
	}

}
