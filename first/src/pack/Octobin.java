package pack;
import java.util.Scanner;
public class Octobin {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int oct=sc.nextInt();
    String bin="";
	while(oct>0) {
		int dig=oct%10;
		String binary="";
		int temp=dig;
		for(int i=1;i<=3;i++) {
		    binary=(temp%2)+binary;
		    temp=temp/2;
		}
		bin=binary+bin;
		oct=oct/10;
	}
	System.out.println(bin);
}
}
