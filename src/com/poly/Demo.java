package com.poly;
import java.util.*;
public class Demo {
public static void main(String[] args) {
  LinkedHashSet ls=new LinkedHashSet();
  ls.add("Java");
  ls.add("OOPS");
  ls.add("Has 4 pillars");
  ls.add("Inheritance");
  ls.add("5 Types");
  ls.add("Java");
  ls.add("Abstract");
  ls.add("Collections");
  System.out.println(ls);
  System.out.println();
  ls.add("Array");
  for(Object s:ls) {
	  System.out.println(s);
  }
}
}
