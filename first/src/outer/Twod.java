package outer;
import java.util.Scanner;
public class Twod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[2][3];
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("Enter a number");
			arr[i][j]=sc.nextInt();
		}
	}
	for(int x=0;x<2;x++) {
		for(int y=0;y<3;y++) {
			System.out.print(arr[x][y]+"\t");
		}
		System.out.println();
	}
}
}
