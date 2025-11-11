package pack;
import java.util.Scanner;
public class Dtobin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		String bin="";
		int rem=0;
		while(n>0) {
			rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
			System.out.println(bin);
	}
}
