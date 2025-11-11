package com.example;

public class AA extends Thread{
public void run() {
	Thread t=Thread.currentThread();
	System.out.println("Alive "+t.isAlive()); // returns boolean type
	System.out.println(Thread.currentThread().getName()+" is running");
}
}
