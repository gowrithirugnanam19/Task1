package com.ex;
//singleton allows only one object not multiple object creations
public class Singleton {
  public static Singleton s1=getInstance();
  private Singleton() {
	  
  }
  private static Singleton getInstance() {
	  return new Singleton();
  }
  public void disp() {
	  System.out.println("disp");
  }
  public static void main(String[] args) {
	Singleton single1=Singleton.s1;
	Singleton single=Singleton.getInstance();
	System.out.println(single1);
	System.out.println(single);
	
}
}
