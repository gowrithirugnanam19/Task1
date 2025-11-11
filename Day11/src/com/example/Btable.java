package com.example;
// for object and method level sync
//public class Btable extends Thread {
//	Table t;
//	Btable(Table t)
//	{
//	this.t=t;
//	}
//	public void run()
//	{
//	t.print(1000);
//	}
//}

//for static level
public class Btable extends Thread {
	public void run()
	{
	Table.print(1000);
	}
}
