package outer;
import java.util.Scanner;
public class Customer {
		Scanner sc=new Scanner(System.in);
		String cusname=sc.nextLine();
		int cusno=sc.nextInt();
		int cusprice=sc.nextInt();
        Customer cus[]=new Customer[3];
        void addCustomer()
        {
        for(int i=0;i<cus.length;i++)
        {
        cus[i]=new Customer();
        System.out.println("Enter customer name ");
        cus[i].cusname=sc.nextLine();
        System.out.println("Enter product quantity ");
        cus[i].cusno=sc.nextInt();
        System.out.println("Enter product price");
        cus[i].cusprice=sc.nextInt();
        }
        }
        public static void main(String[] args) {
			Customer ct=new Customer();
			ct.addCustomer();
		}
}	


