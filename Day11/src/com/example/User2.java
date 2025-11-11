package com.example;
// with refernce
public class User2 {
	public static void main(String[] args) {
		Runnable rn=new Runnable() {
			public void run() {
				System.out.println("Runnable object");
			}
		};
		Thread th=new Thread(rn);
		th.start();
	}
}
// without refernce for object
//	Runnable rn=new Runnable() {
//		public void run() {
//			System.out.println("Runnable object");
//		}
//	};
//	new Thread(rn).start();
//}


//without reference for Runnable
//new Thread(new Runnable(){
//public void run() {
//	System.out.println("Runnable object");
//}};.start();
//}
	
