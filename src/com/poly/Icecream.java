package com.poly;
import java.util.*;
public class Icecream {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("Vannila");
		s.add("Butterscotch");
		s.add("Chocolate");
		s.add("Stawberry");
		s.push("Flavours");
		s.add(4,"Icecream");
		System.out.println(s);
		System.out.println();
		s.add("Cone");
		s.add("Chocobar");
		s.add("Icecream");
		s.add("Ball icecream");
		s.add("Mini bytes");
		for(Object st:s) {
			System.out.println(st);
		}
		System.out.println();
		s.pop();
		System.out.println(s);
	}

}
