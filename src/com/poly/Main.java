package com.poly;
import java.util.*;
public class Main {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("Suriya");
	ts.add("Abi");
	ts.add("Merin");
	ts.add("Sreelakshmi");
	ts.add("Aisha");
	ts.add("Aishwarya");
	ts.add("Gowri");
	ts.add("Liya");
	ts.add("Megha");
	ts.add("Pragana");
	System.out.println(ts);
	System.out.println();
	for(Object s:ts) {
		System.out.println(s);
	}
	System.out.println();
	System.out.println(ts.size());
}
}
