package com.ex;
import java.io.*;
public class Demo {
public static void main(String[] args) {
//	File f1=new File("c:\\Program");
//    //File f2=new File(f1) rename option also there
//    f1.mkdir();
//    System.out.println("successfully");
	File f2=new File("C:\\Program\\A.txt");
	try {
		f2.createNewFile();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("File created successfully");
}
}
