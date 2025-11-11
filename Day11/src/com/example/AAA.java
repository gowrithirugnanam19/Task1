package com.example;

public class AAA {
Table t;
AAA(Table t){
	this.t=t;
}
public void disp() {
	t.print(100);
}
public static void main(String[] args) {
	Table tb=new Table();
	AAA a=new AAA(tb);
	a.disp();
}
}
