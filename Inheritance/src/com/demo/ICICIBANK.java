package com.demo;

public class ICICIBANK implements Loan {
	@Override
	public void interestrate(int amount) {
		int rate=amount*3*5;
		int r=rate/100;
		System.out.println("The interest is "+r);
	}
}
class SBIBANK implements Loan{
	@Override
	public void interestrate(int amount) {
	    int rate=amount*2*10;
	    int r=rate/100;
	    System.out.println("The interest is "+r);
	}
}