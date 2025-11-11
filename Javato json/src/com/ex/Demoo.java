package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demoo {
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	String name="";
	try {
	   name=br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("HI "+name);
}
}
