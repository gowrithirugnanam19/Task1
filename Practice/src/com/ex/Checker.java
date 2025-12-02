package com.ex;
import java.util.*;
public class Checker {
	private void checksubstring(String str,String s,String e) {
		if(str.startsWith(s) && str.endsWith(e)) {
			System.out.println("The input is matched");
		}
		else if(str.startsWith(s) || str.endsWith(e)) {
			System.out.println("The input is not matched");
		}
		else {
			System.out.println("Invalid string");
		}
	}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
Checker c=new Checker();
String s=sc.nextLine();
String[] str=s.split(" ");
String s1=str[0];
String s2=str[1];
String s3=str[2];
c.checksubstring(s1,s2,s3);
}	
}
