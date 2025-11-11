package pack;
import java.util.Scanner;
public class Palinstr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	StringBuffer sb=new StringBuffer(s1);
	sb.reverse();
	System.out.println(sb);
	if(s1.equals(sb.toString())) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
