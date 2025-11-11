package com.example;

public class Usertable {
public static void main(String[] args) {
	//for method and object level
//	Table tb=new Table();
//	Atable t1=new Atable(tb);
//	Btable t2=new Btable(tb);
//	t1.start();
//	t2.start();
	
	//for static level
	Atable t1=new Atable();
	Btable t2=new Btable();
	t1.start();
	t2.start();
}
}
