package com.example;

    class E {
	void eat() {
		System.out.println("Cat drinks");
	    }
    }
	class F extends E{
		void run() {
			System.out.println("Tiger runs fast");
		}
	}
	class G extends F{
		void eat(int x) {
			System.out.println("Monkey eats "+x+" bananas");
	  }
	}
	public class D extends G{
		void roll() {
			System.out.println("Panda rolls in the floor");
		}
	
	public static void main(String[] args) {
	D e=new D();
	e.roll();
	}
}
