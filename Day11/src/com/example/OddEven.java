package com.example;

public class OddEven {
private boolean oddTurn = true;
public synchronized void odd() {
	for (int i = 1; i <= 10; i += 2) {
        while (!oddTurn) { 
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(i); 
        oddTurn = false; 
        notify(); 
    }
}
public synchronized void even() {
	for (int i = 2; i <= 10; i += 2) {
        while (oddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(i); 
        oddTurn = true; 
        notify(); 
    }
}
public static void main(String[] args) {
	OddEven oe=new OddEven();
	new Thread() {
	public void run()
	{
	oe.odd();
	}
	}.start();
	new Thread() {
	public void run()
	{
	oe.even();
	}
	}.start();
	}
}