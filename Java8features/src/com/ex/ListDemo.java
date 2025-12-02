package com.ex;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void display(String n) {
		System.out.println(n);
	}
public static void main(String[] args) {
//	List<Integer> l=Arrays.asList(33,11,55,2,5);
//	l.forEach(System.out::println);
	
	String names[]= {"Gowri","Dhivi","Ponnu","Bhavya"};
	Arrays.stream(names).forEach(ListDemo::display);
}
}