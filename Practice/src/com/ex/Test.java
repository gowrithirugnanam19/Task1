package com.ex;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String out=vowel(s);
		System.out.println(out);
	}
	private static String vowel(String s) {
		String vowels="AEIOUaeiou";
		char fv=0;
		for(int i=0;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i))!=-1) {
				fv=s.charAt(i);
				break;
		}
	}
		if(fv==0) {
			return s;
		}
		String sb="";
		for(int i=0;i<s.length();i++) {
			sb+=fv;
		}
		return sb;

	}

}
