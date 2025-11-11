package com.example;

public class Demo implements Runnable{
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		Thread t1=new Thread(d);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Runnable Object");
	}
}



