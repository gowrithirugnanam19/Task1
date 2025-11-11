package com.example;

public class User {
public static void main(String[] args) {
	A t1=new A();    // A a=new A();
	B t2=new B();    // Thread t=new Thread(a);
	t1.start();      // t.start();
	t2.start();
}
}

// using lambdaa (in main method) directly calling Runnable in A class
// Runnable rn=()->{System.out.println("Runnable Interface");};
// Thread th=new Thread(rn);
// th.start();