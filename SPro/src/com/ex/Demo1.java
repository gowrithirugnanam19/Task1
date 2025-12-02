package com.ex;
import java.io.*;
public class Demo1 {
public static void main(String[] args) throws IOException {
//	FileInputStream fis=new FileInputStream("C:\\Program\\B.txt");
//	//System.out.println(fis.read());
//	int i=0;
//	while((i=fis.read())!=-1) {
//		System.out.print((char)i);
//	}
	
//	FileWriter fw=new FileWriter("C:\\Program\\c.txt");
//	String str="Welcome";
//	fw.write(str);
//	System.out.println("File written successfully");
//	fw.close();
	
	
  FileReader fr=new FileReader("C:\\Program\\c.txt");
  //System.out.println(fr.read());//read value
  int i=0;
  while((i=fr.read())!=-1){
	  System.out.print((char)i);//get char
  }
  }	
}
