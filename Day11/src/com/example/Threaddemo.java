package com.example;

public class Threaddemo extends Thread{
public static void main(String[] args) {
	Threaddemo td=new Threaddemo();//new born
	td.start();//runnable
}
//public void run() {
//	for(int i=1;i<=5;i++) {
//		System.out.println(i);
//		try {
//			Thread.sleep(3000);// the value print for every 3 seconds once
//		}
//		catch(InterruptedException e){
//			e.printStackTrace();
//		}
//	}
//}


public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		if(i==3) {
			Thread thread = new Thread();
			thread.suspend();
		}
	}
}
}
