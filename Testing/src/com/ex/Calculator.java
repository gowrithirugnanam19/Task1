package com.ex;

public class Calculator {
private CalculatorService cserv;
public Calculator(CalculatorService cserv) {
	this.cserv=cserv;
}
public int addOperation(int x,int y) {
	int z=cserv.add(x,y);
	return z;
}
}
