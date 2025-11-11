package pack;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
		if(count==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime");
		}
	}
	}
}
