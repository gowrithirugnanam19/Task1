package com.example;
// this is for method and object level synch
//public class Atable extends Thread{
//	Table t;
//	Atable(Table t)
//	{
//	this.t=t;
//	}
//	public void run()
//	{
//	t.print(100);
//	}
//}

//for static level
public class Atable extends Thread{
	public void run()
	{
	Table.print(100);
	}
}

