package com.example;

public class BB extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName()+" is running");
}
public static void main(String[] args) {
	AA t=new AA();
	BB t1=new BB();
	//set value means
	t.setName("First thread");
	t1.setName("Second thread");
	//set priority
	t1.setPriority(10);//if we give integer value more than 10 it comes as Illegal Argument Exception
	t.start();
	t1.start();
}
}
