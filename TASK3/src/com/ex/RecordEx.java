package com.ex;

public class RecordEx{
	public static void main(String[] args) {
		record Product(String name,double price) {
	}
	Product p=new Product("Laptop",55000);
	System.out.println(p);
	}
}
