package pack;
import java.util.Scanner;
public class Concase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="wElCoMe";
		String output="";
		int ascii=0;
		for(int i=0;i<s.length();i++) {
			ascii=(int)s.charAt(i);
			if(ascii>=65 && ascii<=90) {
				output+=String.valueOf((char)ascii).toLowerCase();
			}
			else {
				output+=String.valueOf((char)ascii).toUpperCase();
			}
		}
		System.out.println(output);
	}
}
