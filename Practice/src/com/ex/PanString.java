package com.ex; 
import java.util.Scanner; 
public class PanString {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); 
		int score = 0; 
		score=lencheck(s,score); 
		System.out.println(score);
		}
	private static int lencheck(String s, int score) { 
		int l=s.length();
		for(int i=0;i<=s.length()-4;i++) { 
			String substring=s.substring(i, i+4);
			if(isPalindrome(substring)) { 
				score+=5; } } 
		for(int i=0;i<=s.length()-5;i++) { 
			String substring=s.substring(i, i+5); 
			if(isPalindrome(substring)) { score+=10; } }
		return score; }
	private static boolean isPalindrome(String substring) { 
		StringBuilder sb=new StringBuilder(substring); 
		String s1=sb.reverse().toString(); 
		return substring.equals(s1); } 
	}