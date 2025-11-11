package com.demo;

public class Driver extends car  {
	@Override
	public void start() {
		System.out.println("Start ride");
	}
	@Override
	public void increasespeed() {
		System.out.println("Increase the speed");
	}
	@Override
	public void stop() {
		System.out.println("Stop ride");
	}
	public void seat() {
		System.out.println("5 seats");
	}
	public static void main(String[] args) {
		car d=new Driver();
		d.color();
		d.brandname();
		d.start();
		d.increasespeed();
		d.stop();
		//d.seat();
	}
}