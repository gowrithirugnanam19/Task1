package com.ex;
import java.io.*;
public class Demoo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("C:\\Program\\B.txt");
	String str="welcome";
	byte b[]=str.getBytes();
	fos.write(b); // write() takes argument as array
	System.out.println("Message return successfully");
}
}
