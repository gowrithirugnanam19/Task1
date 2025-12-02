package com.ex;
import java.io.*;
public class Euser {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee eb=new Employee(101,"Vijay",45000);
	FileOutputStream fos=new FileOutputStream("C:\\Program\\demo.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(eb);
	
	FileInputStream fis=new FileInputStream("C:\\Program\\demo.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Employee e=(Employee)ois.readObject();
	System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
}
}
