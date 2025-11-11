package com.example;

public class Table {
//public synchronized void print(int x) { //not synch means it print as
//	for(int i=1;i<=5;i++) {             //100 1000 200 2000
//		System.out.println(i*x);        // sync means it first complete the Atable and gos Btable 
//		try {                           //this is called method synchronization
//			Thread.sleep(3000);
//		}
//		catch(InterruptedException e){
//			e.printStackTrace();
//		}
//	}
//}
	
//	public void print(int x) { 
//		synchronized(this) {  //object level synchronized using this keyword
//		for(int i=1;i<=5;i++) {             
//			System.out.println(i*x);         
//			try {                           
//				Thread.sleep(3000);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//	}	
//}
	
	public static synchronized void print(int x) { 
		for(int i=1;i<=5;i++) {             
			System.out.println(i*x);         
			try {                           
				Thread.sleep(3000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}	
}	

