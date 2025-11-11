package com.example;

public class User1 {
public static void main(String[] args) {
	Thread t1=new Thread() {
		public void run() {
			System.out.println("First Thread");
		}
	};
	Thread t2=new Thread() {
		public void run() {
			System.out.println("Second Thread");
		}
	};
	t1.start();
	t2.start();
}
}

// without reference calling
//public class User1 {
//public static void main(String[] args) {
//	new Thread() {   // without reference
//		public void run() {
//			System.out.println("First Thread");
//		}
//	}.start();    call at the end of an object
