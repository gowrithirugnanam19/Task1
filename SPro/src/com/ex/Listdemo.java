package com.ex;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class Listdemo {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(3,1,5,6,2,8);
	Stream<Integer> s=l.stream();
	s.forEach(nums->System.out.println(nums));
//	Consumer<Integer> c=new Consumer<Integer>() {
//
//		@Override
//		public void accept(Integer t) {
//			System.out.println("Data "+t);
//		}
//	};
//	l.forEach(c);// anonymous method without using object calling
	l.forEach(new MyObject()); //create object and use lambda expression for calling object
}
}
