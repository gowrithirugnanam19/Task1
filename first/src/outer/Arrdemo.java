package outer;
import java.util.Scanner;
public class Arrdemo {
public static void main(String[] args) {
	int marks[]= {1,2,3,4,5};
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}
	int mark[]= {11,22,33,44,55};
    for(int m:mark) {
    	System.out.print(m+" ");
    }
    int point[]=new int[5];
    int c=0;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<point.length;i++) {
    	System.out.println("Enter a mark");
    	point[i]=sc.nextInt();
    	if(point[i]<40) {
    		c++;
    	}
    }
    System.out.println("Subject count failed is "+c);
    System.out.println("Entered marks");
    int sum=0;
    for(int j=0;j<point.length;j++) {
    	sum+=point[j];
    	System.out.println(point[j]);
    }
    int avg=sum/2;
    System.out.println(avg);
}
}
