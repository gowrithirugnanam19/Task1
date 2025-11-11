package pack;
import java.util.Scanner;
public class Prime1 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=2;i<n;i++) {
    	if(n%i==0) {
    		System.out.println(" Not Prime");
    	    return;
    	}
    }
    System.out.println("Prime");
}
}
