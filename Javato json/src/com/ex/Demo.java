package com.ex;

import java.io.DataInputStream;
import java.io.IOException;

public class Demo {
public static void main(String[] args) {
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("Enter your name");
	try {
		String name=dis.readLine();
		System.out.println("Hi "+name+" welcome to UST");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
