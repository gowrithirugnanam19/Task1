package com.inherit;
class student{
	String name;
	int age;
	public void name(){
		System.out.println("Name of the student is Yashna");
	}
	public void age(int x) {
	   System.out.println("Student age is "+x);
	}
}
public class School extends student {
   public void stuid(int x) {
	   System.out.println("The Student id is "+x);
   }
   public static void main(String[] args) {
   School s=new School();
   s.name();
   s.age(15);
   s.stuid(5050);
}
}
